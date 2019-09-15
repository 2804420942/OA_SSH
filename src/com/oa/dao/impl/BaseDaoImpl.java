package com.oa.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.BaseDao;
@Transactional
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
	// ����ע��sessionFactory
	@Resource
    private SessionFactory sessionFactory;

   

	//���������
    private Class<T> clazz;

    //���������
    private String clazzName;

    public BaseDaoImpl(){
        clazz = (Class<T>) this.getClass();  //�õ���������
        ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();

        //�õ��������ʵ����
        clazz = (Class) pt.getActualTypeArguments()[0];
        //�õ���������ơ�HQL����ͨ����������ѯ�ġ�
        clazzName = clazz.getSimpleName();
    }
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void save(T entity) {
		getSession().save(entity);
		
	}

	@Override
	public void delete(Long id) {
		Object obj = getById(id);
		if(obj!=null){
			getSession().delete(obj);
		}
	}

	@Override
	public T getById(Long id) {
		return (T)getSession().get(clazz,id);
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public List<T> getByIds(Long[] ids) {
		return getSession().createQuery(
				"FROM User WHERE id IN (:ids)")
				.setParameterList("ids", ids)
				.list();
	}


	@Override
	public List<T> findAll() {
        return getSession().createQuery("from " + clazzName).list();
    }
	
}

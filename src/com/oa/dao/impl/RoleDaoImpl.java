package com.oa.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.oa.dao.RoleDao;
import com.oa.domain.Role;
@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {

	@Override
	public Integer findCount(DetachedCriteria detachedCriteria) {
		// select count(*) from xxx where Ìõ¼þ;
		detachedCriteria.setProjection(Projections.rowCount());
		List<Long> list  = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return null;
	}

	@Override
	public List<Role> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize) {
		detachedCriteria.setProjection(null);
		return (List<Role>) this.getHibernateTemplate().findByCriteria(detachedCriteria, begin, pageSize);
	}

	


}

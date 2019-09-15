package com.oa.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.oa.dao.UserDao;
import com.oa.domain.User;
/**
*
* 1.保存管理员【注册】--->save()
* 2.查找管理员【登陆】--->login()
*
*
* */

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	 public void save(User user) {
			this.getHibernateTemplate().save(user);
		}
	 @Override
		public User login(User user) {
			List<User> list =(List<User>) this.getHibernateTemplate().find("from User where user_name=? and user_password=?", user.getUser_name(),user.getUser_password());
			if(list.size()>0){
				return list.get(0);
			}
			return null;
		}

}


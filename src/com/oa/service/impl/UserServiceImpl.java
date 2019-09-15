package com.oa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.UserDao;
import com.oa.domain.User;
import com.oa.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}
	@Override
	public User getByid(Long id) {
		return userDao.getById(id);
	}
	@Override
	public void update(User user) {
		userDao.update(user);	
	}

}

package com.oa.dao;

import com.oa.domain.User;

public interface UserDao extends BaseDao<User>{

	User login(User user);
	void save(User user);
}

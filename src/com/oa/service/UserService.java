package com.oa.service;

import com.oa.domain.User;

public interface UserService {

	User login(User user);

	void save(User user);

	User getByid(Long id);

	void update(User user);

}

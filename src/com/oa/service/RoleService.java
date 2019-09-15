package com.oa.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.oa.domain.PageBean;
import com.oa.domain.Role;

public interface RoleService {
	//²éÑ¯ËùÓÐ
	List<Role> findAll();

	void delete(Long id);

	Role getById(Long id);

	void save(Role role);

	PageBean<Role> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize);

	void update(Role role);
	
}

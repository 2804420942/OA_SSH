package com.oa.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.oa.domain.Role;

public interface RoleDao extends BaseDao<Role>{

	Integer findCount(DetachedCriteria detachedCriteria);

	List<Role> findByPage(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize);


}

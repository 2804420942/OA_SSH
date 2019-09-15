package com.oa.dao;

import java.util.List;

import com.oa.domain.Dept;

public interface DeptDao extends BaseDao<Dept>{

	List<Dept> findAll();

	void delete(Long id);

}

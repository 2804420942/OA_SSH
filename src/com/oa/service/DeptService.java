package com.oa.service;

import java.util.List;

import com.oa.domain.Dept;

public interface DeptService {

	List<Dept> findAll();

	void delete(Long id);

	void save(Dept dept);

	Dept getById(Long id);

	void update(Dept dept);

}

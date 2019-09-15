package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.DeptDao;
import com.oa.domain.Dept;
import com.oa.service.DeptService;
@Transactional
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public List<Dept> findAll() {
		
		return deptDao.findAll();
	}
	
	@Override
	public void delete(Long id) {
		deptDao.delete(id);
	}

	@Override
	public void save(Dept dept) {
		deptDao.save(dept);
		
	}

	@Override
	public Dept getById(Long id) {
		return deptDao.getById(id);
	}

	@Override
	public void update(Dept dept) {
		deptDao.update(dept);
	}

}

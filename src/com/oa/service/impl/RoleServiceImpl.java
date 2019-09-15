package com.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.RoleDao;
import com.oa.domain.PageBean;
import com.oa.domain.Role;
import com.oa.service.RoleService;
@Transactional
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public List<Role> findAll() {
		
		return roleDao.findAll();
	}
	
	@Override
	public void delete(Long id) {
		roleDao.delete(id);
	}

	@Override
	public Role getById(Long id) {
		return roleDao.getById(id);
	}

	@Override
	public void save(Role role) {
		roleDao.save(role);
		
	}

	@Override
	public PageBean<Role> findByPage(DetachedCriteria detachedCriteria, Integer currPage, Integer pageSize) {
		PageBean<Role> pageBean = new PageBean<Role>();
		// 封装当前页数:
		pageBean.setCurrPage(currPage);
		// 封装每页显示记录数:
		pageBean.setPageSize(pageSize);
		// 封装总记录数:
		// 调用DAO:
		Integer totalCount  = roleDao.findCount(detachedCriteria);
		pageBean.setTotalCount(totalCount);
		// 封装总页数:
		Double tc = totalCount.doubleValue();
		Double num = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页显示数据的集合
		Integer begin = (currPage - 1) * pageSize;
		List<Role> roleList = roleDao.findByPage(detachedCriteria,begin,pageSize);
		pageBean.setList(roleList);
		return pageBean;
	}

	@Override
	public void update(Role role) {
		roleDao.update(role);
	}

}

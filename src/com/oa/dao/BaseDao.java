package com.oa.dao;

import java.util.List;

public interface BaseDao<T> {
	void save(T entity);
	void delete(Long id);
	T getById(Long id);
	void update(T entity);
	List<T> getByIds(Long[] ids);
	List<T> findAll();
}

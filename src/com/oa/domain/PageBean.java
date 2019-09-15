package com.oa.domain;
import java.util.List;

public class PageBean<T> {
	private Integer currPage;
	private Integer pageSize;
	private Integer totalCount;
	private Integer TotalPage;
	private List<T> list;
	public Integer getCurrPage() {
		return currPage;
	}
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		return TotalPage;
	}
	public void setTotalPage(Integer totalPage) {
		TotalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
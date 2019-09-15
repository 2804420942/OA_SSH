package com.oa.web.action;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.oa.domain.PageBean;
import com.oa.domain.Role;
import com.oa.service.RoleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("roleAction")
@Scope("prototype")
public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	private Long id;
	@Autowired
	private Role role = new Role();

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Role getModel() {
		return role;
	}
	@Autowired
	private RoleService roleService;

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	//分页
	private Integer currPage=1;
	private Integer pageSize=5;
	public void setCurrPage(Integer currPage) {
		if(currPage==null){
			currPage=1;
		}
		this.currPage = currPage;
	}
	
	public void setPageSize(Integer pageSize) {
		if(pageSize==null){
			pageSize=5;
		}
		this.pageSize = pageSize;
	}
	//列表
	public String list() throws Exception{
		// 接收参数：分页参数
		// 最好使用DetachedCriteria对象（条件查询--带分页）
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Role.class);
				
		// 调用业务层查询:
		PageBean<Role> pageBean = roleService.findByPage(detachedCriteria, currPage, pageSize);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}
	public String delete() throws Exception{
		roleService.delete(id);
		return "toList";
	}
	
	public String addUI() throws Exception{
		return "addUI";
	}
	
	public String add() throws Exception{
		roleService.save(role);
		return "toList";
	}
	
	public String updateUI() throws Exception{
		Role updateRole = roleService.getById(id);
		ActionContext.getContext().put("updateRole", updateRole);
		return "updateUI";
	}
	public String update(){
		System.out.println(role.getRole_Dept().getDept_id());
		roleService.update(role);
		return "update";
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}




}

package com.oa.web.action;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.oa.domain.Dept;
import com.oa.domain.Role;
import com.oa.service.DeptService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("deptAction")
@Scope("prototype")
public class DeptAction extends ActionSupport implements ModelDriven<Dept>{
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Autowired
	private Dept dept;
	@Autowired
	private DeptService deptService;
	public void setRoleService(DeptService deptService) {
		this.deptService = deptService;
	}
	//ап╠М
	public String list() throws Exception{
		List<Dept> deptList = deptService.findAll();
		ActionContext.getContext().put("deptList", deptList);
		return "deptList";
	}
	public String role() throws Exception{
		List<Dept> deptList = deptService.findAll();
		ActionContext.getContext().put("deptRole", deptList);
		return "deptToRole";
	}
	public String delete() throws Exception{
		deptService.delete(id);
		return "deptToList";
	}
	
	public String addUI() throws Exception{
		return "deptAddUI";
	}
	
	public String add() throws Exception{
		deptService.save(dept);
		return "deptToList";
	}
	
	public String updateUI() throws Exception{
		Dept updateDept = deptService.getById(id);
		ActionContext.getContext().put("updateDept", updateDept);
		return "deptUpdateUI";
	}
	public String update(){
		deptService.update(dept);
		return "deptUpdate";
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public Dept getModel() {
		return dept;
	}



}

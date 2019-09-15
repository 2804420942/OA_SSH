package com.oa.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="Role")
public class Role {
	private Long Role_id;
	private String Role_name;
	private String Role_desc;
	private String Role_expe;
	private String Role_rela;
	private String Role_record;
	private String Role_train;
	private String Role_money;
	@Autowired
	private Dept Role_Dept;
	public Long getRole_id() {
		return Role_id;
	}
	public void setRole_id(Long role_id) {
		Role_id = role_id;
	}
	public String getRole_name() {
		return Role_name;
	}
	public void setRole_name(String role_name) {
		Role_name = role_name;
	}
	public String getRole_desc() {
		return Role_desc;
	}
	public void setRole_desc(String role_desc) {
		Role_desc = role_desc;
	}
	public String getRole_expe() {
		return Role_expe;
	}
	public void setRole_expe(String role_expe) {
		Role_expe = role_expe;
	}
	public String getRole_rela() {
		return Role_rela;
	}
	public void setRole_rela(String role_rela) {
		Role_rela = role_rela;
	}
	public String getRole_record() {
		return Role_record;
	}
	public void setRole_record(String role_record) {
		Role_record = role_record;
	}
	public String getRole_train() {
		return Role_train;
	}
	public void setRole_train(String role_train) {
		Role_train = role_train;
	}
	public Dept getRole_Dept() {
		return Role_Dept;
	}
	public void setRole_Dept(Dept Role_dept) {
		Role_Dept = Role_dept;
	}
	public String getRole_money() {
		return Role_money;
	}
	public void setRole_money(String role_money) {
		Role_money = role_money;
	}

}

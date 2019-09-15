package com.oa.domain;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="Dept")
public class Dept {
	private Long Dept_id;
	private String Dept_name;
	private String Dept_role;
	public Long getDept_id() {
		return Dept_id;
	}
	public void setDept_id(Long dept_id) {
		Dept_id = dept_id;
	}
	public String getDept_name() {
		return Dept_name;
	}
	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
	public String getDept_role() {
		return Dept_role;
	}
	public void setDept_role(String dept_role) {
		Dept_role = dept_role;
	}
	
}

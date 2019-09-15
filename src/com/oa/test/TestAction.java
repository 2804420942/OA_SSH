package com.oa.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;


public class TestAction extends ActionSupport{
	public String execute() throws Exception {
		System.out.println("TestAction.execute()");
		return "success";
	}
}

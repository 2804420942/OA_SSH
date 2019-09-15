package com.oa.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.oa.domain.User;
import com.oa.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	private Long id;
	@Autowired
	private User user =new User();
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getModel() {
		return user;
	}
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String regist(){
		userService.save(user);
		System.out.println(user.getUser_name());
		return "login";
	}
	public String clear(){	
		ActionContext.getContext().getSession().clear();
		return "login";
	}
	public String login(){
		User ExisUser = userService.login(user);
		if(null==ExisUser){
			this.addActionError("用户名或密码错误");
			return "login";
		}else{
			ActionContext.getContext().getSession().put("ExisUser", ExisUser);
			return "success";
		}
	}
	public String updateUI(){
		User updateUser= userService.getByid(id);
		ActionContext.getContext().put("updateUser", updateUser);
		return "updateUI";
	}
	public String update(){
		userService.update(user);
		return "update";
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
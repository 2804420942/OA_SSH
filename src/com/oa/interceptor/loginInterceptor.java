package com.oa.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class loginInterceptor extends MethodFilterInterceptor {
	 @Override
	    protected String doIntercept(ActionInvocation invocation) throws Exception {

	        //1.获得session
	        Map<String, Object> session = ActionContext.getContext().getSession();
	        //2.如果用户登录成功，会向session域中存放user对象，所以这个就是判断用户是否登录的标识
	        Object object = session.get("ExisUser");
	        //3.判断登陆标识是否存在
	        if(object == null){
	            //不存在=>没登录=>重定向到登录页面，这里需要配置全局的结果集，用于全局的页面跳转
	            return "login";
	        }else{
	            //存在=>已经登陆=>放行
	            return invocation.invoke();
	        }
	    }

}

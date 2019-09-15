package com.oa.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class loginInterceptor extends MethodFilterInterceptor {
	 @Override
	    protected String doIntercept(ActionInvocation invocation) throws Exception {

	        //1.���session
	        Map<String, Object> session = ActionContext.getContext().getSession();
	        //2.����û���¼�ɹ�������session���д��user����������������ж��û��Ƿ��¼�ı�ʶ
	        Object object = session.get("ExisUser");
	        //3.�жϵ�½��ʶ�Ƿ����
	        if(object == null){
	            //������=>û��¼=>�ض��򵽵�¼ҳ�棬������Ҫ����ȫ�ֵĽ����������ȫ�ֵ�ҳ����ת
	            return "login";
	        }else{
	            //����=>�Ѿ���½=>����
	            return invocation.invoke();
	        }
	    }

}

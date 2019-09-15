<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业人事管理系统</title>
<style>
h1, p {
	padding-top: 30px;
	font-family: fantasy;
	text-align: center;
}

tr th, td {
	text-align: center;
}

.input-group {
	width: 300px;
	height: 30px;
	margin: 15px auto;
}

.title {
	background-image: url(img/1.png);
}
</style>
</head>
<body>
	<center>
	<div class="title">
				<h1>企业人事管理系统</h1>
				<s:if test="null!=#session.ExisUser">
				<span class="text-primary">当前用户：<s:property value="#session.ExisUser.user_name"/></span>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<span class="text-danger"><s:a action="user_updateUI?id=%{#session.ExisUser.user_id}"><span class="text-danger">修改密码</span></s:a>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<s:a action="user_clear"><span class="text-danger">安全退出</span></s:a>
										</span>
				</s:if>
				<s:else>
				<a href="${ pageContext.request.contextPath }/login.jsp">登录 </a> <a href="${ pageContext.request.contextPath }/login.jsp">注册</a>
				</s:else>
		</div>
	</center>
</body>
</html>
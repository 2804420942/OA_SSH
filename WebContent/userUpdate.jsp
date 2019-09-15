<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<title>用户密码修改</title>
<style type="text/css">
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
	margin: 0 auto;
}

.title {
	background-image: url(img/1.png);
}
</style>
</head>
<body>
	<center>
		<div class="container">
			<%@ include file="top.jsp" %>
			<div class="content">
				<h2>用户密码修改</h2>
				<form id=form name=form action="${ pageContext.request.contextPath }/user_update.action" method=post>
				<table class="table table-hover bg-info">
					<tr>
						<td>用户ID：</td>
						<td><input type="text" class="form-control" name="user_id"
							value="<s:property value="#updateUser.user_id"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>用户姓名：</td>
						<td><input type="text" class="form-control" name="user_name"
							value="<s:property value="#updateUser.user_name"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>用户密码：</td>
						<td><input type="password" class="form-control"
							placeholder="用户密码" name="user_password"></td>
					</tr>
				</table>
				<button type="submit" class="btn btn-primary">用户修改密码</button>
				<button type="reset" class="btn btn-danger">重置信息</button>
				<button type="button" class="btn btn-default">返回上一级</button>
				</form>
			</div>
		</div>
	</center>
</body>
</html>
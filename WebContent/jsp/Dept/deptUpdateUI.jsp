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
<title>雇佣员工</title>
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
			<%@ include file="../../top.jsp" %>
			<div class="content">
				<h2>部门管理</h2>
				<form id=form name=form action="${ pageContext.request.contextPath }/dept_update.action" method=post>
				<table class="table table-hover bg-info">
					<tr>
						<td>部门ID：</td>
						<td><input type="text" class="form-control" name="Dept_id"
							 value="<s:property value="#updateDept.Dept_id"/>" readonly="readonly"></td>
					</tr>
					<tr>
						<td>部门名称：</td>
						<td><input type="text" class="form-control" name="Dept_name"
							 value="<s:property value="#updateDept.Dept_name"/>"></td>
					</tr>
					<tr>
						<td>部门负责人：</td>
						<td><input type="text" class="form-control" name="Dept_role"
							 value="<s:property value="#updateDept.Dept_role"/>"></td>
					</tr>
					
					
				</table>
				<button type="submit" class="btn btn-primary">修改部门</button>
				<button type="button" class="btn btn-success"><s:a action="dept_delete?id=%{#updateDept.Dept_id}" onclick="return confirm('确定要删除吗？')">删除部门</s:a></button>
				<button type="reset" class="btn btn-danger">重置信息</button>
				<button type="button" class="btn btn-default">返回上一级</button>
				</form>
			</div>
		</div>
	</center>
</body>
</html>
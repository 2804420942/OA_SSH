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
				<h2>员工雇佣</h2>
				<form id=form name=form action="${ pageContext.request.contextPath }/role_add.action" method=post>
				<table class="table table-hover bg-info">
					<tr>
						<td>员工姓名：</td>
						<td><input type="text" class="form-control"
							placeholder="员工姓名" name="Role_name"></td>
					</tr>
					<tr>
						<td>工作经历：</td>
						<td><input type="text" class="form-control"
							placeholder="工作经历" name="Role_expe"></td>
					</tr>
					<tr>
						<td>家庭关系：</td>
						<td><input type="text" class="form-control"
							placeholder="家庭关系" name="Role_rela"></td>
					</tr>
					<tr>
						<td>奖惩记录：</td>
						<td><input type="text" class="form-control"
							placeholder="奖惩记录" name="Role_record"></td>
					</tr>
					<tr>
						<td>培训经历：</td>
						<td><input type="text" class="form-control"
							placeholder="培训经历" name="Role_train"></td>
					</tr>
					<tr>
						<td>员工工资：</td>
						<td><input type="text" class="form-control"
							placeholder="员工工资" name="Role_money"></td>
					</tr>
					
					<tr>
						<td>员工部门：</td>
						<td><input type="text" class="form-control"
							placeholder="员工部门" name="Dept_name"></td>
					</tr>
				</table>
				<button type="submit" class="btn btn-primary">雇佣员工</button>
				<button type="reset" class="btn btn-danger">重置信息</button>
				<button type="button" class="btn btn-default">返回上一级</button>
				</form>
			</div>
		</div>
	</center>
</body>
</html>
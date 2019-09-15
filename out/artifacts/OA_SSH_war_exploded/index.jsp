<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<SCRIPT language=javascript>
	function to_page(page){
		if(page){
			$("#page").val(page);
		}
		document.customerForm.submit();
		
	}
</SCRIPT>
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
<title>企业人事管理系统</title>
</head>
<body>
	<center>
		<div class="container">
			<%@ include file="top.jsp" %>
			<div class="nav">
				<nav class="navbar navbar-default" role="navigation">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">首页</a>
					</div>
					<div>
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">员工管理</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"> 部门管理 <b class="caret"></b>
							</a>
								<ul class="dropdown-menu">
								<s:iterator value="deptList" var="d">
									<li><s:a action="dept_updateUI?id=%{#d.Dept_id}"><s:property value="#d.Dept_name"/></s:a></li>
								</s:iterator>
								<li role="presentation" class="divider"></li>
								<li><s:a action="dept_addUI">增加部门 </s:a></li>	
								</ul></li>
						</ul>
					</div>
				</div>
				</nav>
			</div>
			<div class="form">
				<form>
					<div class="bg-info">
						<div>
							<p>员工姓名:</p>
							<div class="input-group">
								<input type="text" class="form-control" placeholder="员工姓名"
									aria-describedby="basic-addon1">
							</div>
							<div>
								<button type="button" class="btn btn-danger"><s:a action="role_addUI">查询员工 </s:a></button>
								<button type="button" class="btn btn-success"><s:a action="role_addUI">雇佣员工 </s:a></button>
							</div>
						</div>
					</div>
				</form>
			</div>
			<table class="table table-hover">
				<thead>
					<th>序号</th>
					<th>员工姓名</th>
					<th>员工薪资</th>
					<th>员工部门</th>
					<th>操作</th>
				</thead>
			<s:iterator value="list" var="r">
			
				<tr>
					
					<td><s:property value="#r.Role_id"/></td>
					<td><s:property value="#r.Role_name"/></td>
					<td><s:property value="#r.Role_money"/></td>
					<td><s:property value="#r.Dept_name.Dept_name"/></td>
					<td><s:a action="role_updateUI?id=%{#r.Role_id}">调度 </s:a>    <s:a action="role_delete?id=%{#r.Role_id}" onclick="return confirm('确定要解雇吗？')">解雇</s:a></td>			
				</tr>
			</s:iterator>
			</table>
			<SPAN id=pagelink>
				<DIV
				style="LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right">
				共[<B><s:property value="totalCount"/></B>]条记录,[<B><s:property value="totalPage"/></B>]页
				,每页显示
					<select name="pageSize" onchange="to_page()">
							<option value="3" <s:if test="pageSize==3">selected</s:if>>3</option>
							<option value="5" <s:if test="pageSize==5">selected</s:if>>5</option>
							<option value="10" <s:if test="pageSize==10">selected</s:if>>10</option>
					</select>
							条
					[<A href="javascript:to_page(<s:property value="currPage-1"/>)">前一页</A>]
						<B>
												
						</B>
					[<A href="javascript:to_page(<s:property value="currPage+1"/>)">后一页</A>] 
							到
					<input type="text" size="3" id="page" name="currPage" />
							页
					<input type="button" value="Go" onclick="to_page()"/>
				</DIV>
			</SPAN>
		</div>
	</center>
</body>
</html>
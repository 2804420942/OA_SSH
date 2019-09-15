<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>登录界面</title>
<style type="text/css">
h1, h2, p {
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
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<center>
		<div class="container">
			<div class="content">
				<div class="form row">
                	<h2 class="form-title" style="text-align:left;padding-left:20px;">登录</h2>
                	<div class="col-md-6">
                		<form id=form1 name=form1 action="${ pageContext.request.contextPath }/user_login.action" method=post>
                   			<div class="form-group" style="text-align:left">
                        		<i class="fa fa-user fa-lg"></i>
                        		<input class="form-control required" type="text" placeholder="Username" id="username"  name="user_name" autofocus="autofocus" maxlength="20"/>
                    		</div>
                   			<div class="form-group" style="text-align:left">
                            	<i class="fa fa-lock fa-lg"></i>
                            	<input class="form-control required" type="password" placeholder="Password" id="password" name="user_password" maxlength="8"/>
                    		</div>
                    		<div class="form-group">
                        		<label class="checkbox">
                            		<input type="checkbox" name="remember" value="1"/>记住我
                        		</label>
                    		</div>
                    		<div class="form-group col-md-offset-9">
                        		<button type="submit" class="btn btn-success pull-right" name="submit">登录</button>
                    		</div>
                    	</form>
                	</div>
                	<div style="margin-top:-405px;">
                	<h2 class="form-title" style="text-align:left;padding-left:420px;margin-top:340px;">注册</h2>
                	<div class="col-md-6">
                		<form id=form1 name=form1 action="${ pageContext.request.contextPath }/user_regist.action" method=post>
                    		<div class="form-group" style="text-align:left">
                        		<i class="fa fa-user fa-lg"></i>
                        		<input class="form-control required" type="text" placeholder="Username" id="username"  name="user_name" autofocus="autofocus" maxlength="20"/>
                   	 		</div>
                    		<div class="form-group" style="text-align:left">
                            	<i class="fa fa-lock fa-lg"></i>
                            	<input class="form-control required" type="password" placeholder="Password" id="password" name="user_password" maxlength="8"/>
                    		</div>
                    		<div class="form-group">
                        		<label class="checkbox">
                            		<input type="checkbox" name="remember" value="1"/>记住我
                        		</label>
                    		</div>
		                    <div class="form-group col-md-offset-9">
		                        <button type="submit" class="btn btn-danger pull-right" name="submit">注册</button>
		                    </div>
                    	</form>
                	</div>
                	</div>
            	</div>
            	</div>
            </div>
	</center>
</body>
</html>
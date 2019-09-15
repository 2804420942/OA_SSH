<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录界面</title>
    <script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
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


</head>
<body>
    <div class="container">
        <div class="form row">
            <div class="form-horizontal col-md-offset-3" id="login_form">
                <h3 class="form-title">LOGIN</h3>
                <div class="col-md-9">
                	<form id=form1 name=form1 action="${ pageContext.request.contextPath }/user_login.action" method=post>
                    <div class="form-group">
                        <i class="fa fa-user fa-lg"></i>
                        <input class="form-control required" type="text" placeholder="Username" id="username"  name="user_name" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <div class="form-group">
                            <i class="fa fa-lqock fa-lg"></i>
                            <input class="form-control required" type="password" placeholder="Password" id="password" name="user_password" maxlength="8"/>
                    </div>
                    <div class="form-group">
                        <label class="checkbox">
                            <input type="checkbox" name="remember" value="1"/>记住我
                        </label>
                    </div>
                    <div class="form-group col-md-offset-9">
                        <button type="submit" class="btn btn-success pull-right" name="submit">注册</button>
                    </div>
                    </form>
                </div>
                
            </div>
        </div>
        <div class="form row">
            <div class="form-horizontal col-md-offset-3" id="login_form">
                <h3 class="form-title">REGISTER</h3>
                <div class="col-md-9">
                <form id=form2 name=form2 action="${ pageContext.request.contextPath }/user_regist.action" method=post>
                    <div class="form-group">
                        <i class="fa fa-user fa-lg"></i>
                        <input class="form-control required" type="text" placeholder="Username" id="username"  name="user_name" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <div class="form-group">
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
                
            </div>
        </div>
    </div>
</body>
</html>
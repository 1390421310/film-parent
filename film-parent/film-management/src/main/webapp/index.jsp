<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
 <link rel="stylesheet" href="css/pintuer.css">
 <link rel="stylesheet" href="css/admin.css">
 <script src="js/jquery.js"></script>
 <script src="js/pintuer.js"></script>  

<style type="text/css">
	body {
	background-image: url("images/bgimage.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
</style>
</head>
<body>
<div class="container" style="width: 350px;line-height: 150px;">
	<form action="login" method="post">
		<div class="panel loginbox">
                <div class="text-center margin-big"><h1>登录后台管理中心</h1></div>                   
                <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="text" class="input input-big" name="name" placeholder="登录账号" data-validate="required:请填写账号" />
                            <span class="icon icon-user margin-small"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="password" class="input input-big" name="password" placeholder="登录密码" data-validate="required:请填写密码" />
                            <span class="icon icon-key margin-small"></span>
                        </div>
                    </div>        
                </div>
                <div style="padding:30px;"><input type="submit" class="button button-block bg-main text-big input-big" value="登录"></div>           	
           		<c:if test="${temp=='false' }">            
                		<h5 style="color: red;text-align: center;">用户名或密码错误</h5>               	
               	</c:if> 
            </div>
	</form>
</div>
</body>
</html>
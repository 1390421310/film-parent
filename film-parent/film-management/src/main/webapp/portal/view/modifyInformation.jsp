<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改个人信息</title>
<style>
    body {
        background-image:url("/film/portal/img/background.jpg");
        background-repeat: no-repeat;
        background-size: 100% 100%;
    }

    div.registerDivPage {
        position: fixed;
        top: 0px;
        left: 0px;
        right: 0px;
        bottom: 0px;
        margin: auto;
    }

    div.registerDivPage {
        background-color: white;
        width: 350px;
        height: 400px;
        padding: 60px 25px 80px 25px;
    }

    div.registerErrorMessageDiv {
        width: 300px;
        position: absolute;
        top: 20px;
        display: none;
    }

    div.registerErrorMessageDiv div.alert {
        padding: 5px !important;
    }

    div.register_account_text {
        color: #3C3C3C;
        font-size: 16px;
        font-weight: bold;
    }

    div.registerInput {
        border: 1px solid #CBCBCB;
        margin: 20px 0px;
    }

    div.registerInput input {
        display: inline-block;
        border: 0px solid transparent;
        width: 244px;
        height: 30px;
        position: relative;
        left: 6px;
        top: 3px;
    }

    div.registerInput span, div.loginInput input {
        display: inline-block;
    }

    div.registerInput span.registerInputIcon {
        margin: 0px;
        background-color: #CBCBCB;
        width: 40px;
        height: 40px;
    }

    span.registerInputIcon span.glyphicon {
        font-size: 22px;
        position: relative;
        left: 9px;
        top: 9px;
        color: #606060;
    }

    button.redButton {
        color: white;
        background-color: #FF0036;
        font-size: 16px;
        font-weight: 700;
        height: 42px;
        line-height: 35px;
        vertical-align: middle;
        width: 300px;
        border-radius: 3px;
        border: 0;
        margin-top: 10px;
    }

    button.redButton:hover {
        background-color: rgba(255, 0, 54, .8);
    }
</style>
<script type="text/javascript">
	$(function(){
		$("form.registerFrom input").keyup(function () {
            $("div.registerErrorMessageDiv").hide();
        });
		$("#btn_modify").click(function () {
            if (success()) {
                $.ajax({
                    url: "/film/modifyInformation",
                    type: "POST",
                    data: {"id":$("#id").val(),"name": $("#name").val(), "password": $("#password").val(),"phone":$("#phone").val(),"email":$("#email").val()},
                    success: function (result) {
                        if ("success" == result) {
                            alert("修改成功");
                            window.location.href = "/film/portal/view/index.jsp";
                        } else {
                            $("span.errorMessage").html(result);
                            $("div.registerErrorMessageDiv").show();
                            $("#password").val("");
                            $("#password-confirm").val("");
                        }
                    },
                    error: function (result) {
                        window.location.reload();
                        console.error(result);
                    }
                });
            }
        });
    });
		function success(){
			//用户名校验
	        var name = document.getElementById("name").value;
	        var pattern1 = /^[a-zA-Z][a-zA-Z0-9_]{4,15}$/;  //字母开头，允许5-16字节，允许字母数字下划线
	        if (!pattern1.test(name)) {
	            $("span.errorMessage").html("用户名不合法");
	            $("div.registerErrorMessageDiv").show();
	            return false;
	        }
	      //密码校验
	        var pwd = document.getElementById("password").value;
	        //最少6位，包括至少1个字母，1个数字，1个特殊字符
	        //var pattern = /^.*(?=.{6,})(?=.*\d)(?=.*[a-zA-z])(?=.*[!@#$%^&*? ]).*$/;
	        var pattern2 = /^[a-zA-Z]\w{5,17}$/;
	        if (!pattern2.test(pwd)) {
	            $("span.errorMessage").html("密码不合法");
	            $("div.registerErrorMessageDiv").show();
	            return false;
	        }
	        if (0 == $("#password-confirm").val().length || $("#password-confirm").val() != $("#password").val()) {
	            $("span.errorMessage").html("请确认两次密码保持一致");
	            $("div.registerErrorMessageDiv").show();
	            return false;
	        }
	      //联系方式校验
	        var phone = document.getElementById("phone").value;
	        var pattern3 = /\d{11}/;
	        if (!pattern3.test(phone)) {
	        	$("span.errorMessage").html("联系方式不合法");
	            $("div.registerErrorMessageDiv").show();
	            return false;
			}
	        //邮箱校验
	        var email = document.getElementById("email").value;
	        var pattern4 = /^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.com){1}$/;
	        if (!pattern4.test(email)) {
	        	$("span.errorMessage").html("邮箱格式不合法");
	            $("div.registerErrorMessageDiv").show();
	            return false;
			}
	        return true;
		}
</script>
</head>
<body>
	<div class="registerDivPage container" style="height: 550px;">
    <div class="registerErrorMessageDiv">
        <div class="alert alert-danger">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
            <span class="errorMessage"></span>
        </div>
    </div>
	<input type="hidden" id="id" value="${id }">
    <div class="register_account_text">修改个人信息</div>
    <div class="registerInput ">
        <span class="registerInputIcon"><span class=" glyphicon glyphicon-user"></span></span>
        <input id="name" name="name" placeholder="新账号为字母开头5-16位字母、数字或下划线组成" type="text">
    </div>
    <div class="registerInput">
        <span class="registerInputIcon"><span class="glyphicon glyphicon-lock"></span></span>
        <input id="password" name="password" type="password" placeholder="新密码字母开头由6~18位字母、数字或下划线组成" >
    </div>
    <div class="registerInput">
        <span class="registerInputIcon"><span class="glyphicon glyphicon-lock"></span></span>
        <input id="password-confirm" name="password-confirm" type="password" placeholder="确认密码" >
    </div>
    <div class="registerInput">
        <span class="registerInputIcon"><span class="glyphicon glyphicon-earphone"></span></span>
        <input id="phone" name="phone" type="tel" placeholder="联系方式,由11位数字组成" >
    </div>
     <div class="registerInput ">
        <span class="registerInputIcon"><span class=" glyphicon glyphicon-envelope"></span></span>
        <input id="email" name="email" placeholder="邮箱格式形如:xxx@xxx.com" type="text">
    </div>
    <div style="margin-top:20px">
        <button class="btn btn-block redButton" id="btn_modify" type="submit">修改</button>
    </div>
</div>
</body>
</html>
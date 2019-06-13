<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="include/header.jsp" %>
<style>
    body {
        background-image: url(../img/background.jpg);
        background-repeat: no-repeat;
        background-size: 100% 100%;
    }

    /*div定位在中间*/
    div.loginDivPage {
        position: fixed;
        top: 0px;
        left: 0px;
        right: 0px;
        bottom: 0px;
        margin: auto;
    }

    div.loginDivPage {
        background-color: white;
        width: 350px;
        height: 400px;
        padding: 60px 25px 80px 25px;
    }

    div.loginErrorMessageDiv {
        width: 300px;
        position: absolute;
        top: 20px;
        display: none;
    }

    div.loginErrorMessageDiv div.alert {
        padding: 5px !important;
    }

    div.login_account_text {
        color: #3C3C3C;
        font-size: 16px;
        font-weight: bold;
    }

    div.loginInput {
        border: 1px solid #CBCBCB;
        margin: 20px 0px;
    }

    div.loginInput input {
        display: inline-block;
        border: 0px solid transparent;
        width: 244px;
        height: 30px;
        position: relative;
        left: 6px;
        top: 3px;
    }

    div.loginInput span, div.loginInput input {
        display: inline-block;
    }

    div.loginInput span.loginInputIcon {
        margin: 0px;
        background-color: #CBCBCB;
        width: 40px;
        height: 40px;
    }

    span.loginInputIcon span.glyphicon {
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
    }

    button.redButton:hover {
        background-color: rgba(255, 0, 54, .8);
    }
</style>
<script>
    var flag = false;
    $(function () {
    	$("#a_valid").click(function(){
    		//浏览器带有缓存功能,不会多次请求相同数据
    		$("img").attr("src","/film/validcode?date="+new Date());
    		return false;
    	})
        $("#name").blur(function () {
            if (checkName()) {
                flag = true;
            }
        });
        $("#password").blur(function () {
            if (checkPassword()) {
                flag = true;
            }
        });
        $("div.loginInput input").keyup(function () {
            $("div.loginErrorMessageDiv").hide();
        });
        $("#btn_login").click(function () {
            if (flag) {
                var page = "/film/userlogin";
                $.post(
                    page,
                    {"name": $("#name").val(), "password": $("#password").val(),"code":$("#code").val()},
                    function (result) {
                        if ("success" == result) {
                            window.location.href = "/film/portal/view/index.jsp";
                        } else if("false" == result){
                            $("span.errorMessage").html("验证码错误");
                            $("div.loginErrorMessageDiv").show();
                            $("#password").val("");
                        }else {
                        	$("span.errorMessage").html("账号密码错误");
                            $("div.loginErrorMessageDiv").show();
                            $("#password").val("");
						}
                    }
                );
            } else {
                $("#name").focus();
            }
        });
    });
    function checkName() {
        var name = document.getElementById("name").value;
        if (!name) {
            $("span.errorMessage").html("用户不能为空！");
            $("div.loginErrorMessageDiv").show();
            return false;
        }
        return true;
    }
    function checkPassword() {
        var pwd = document.getElementById("password").value;
        if (!pwd) {
            $("span.errorMessage").html("密码不能为空！");
            $("div.loginErrorMessageDiv").show();
            return false;
        }
        return true;
    }
</script>

<div class="loginDivPage container">
    <div class="loginErrorMessageDiv">
        <div class="alert alert-danger">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
            <span class="errorMessage"></span>
        </div>
    </div>

    <div class="login_account_text">用户登录</div>
    <div class="loginInput ">
        <span class="loginInputIcon ">
            <span class=" glyphicon glyphicon-user"></span>
        </span>
        <input id="name" name="name" placeholder="用户名" type="text">
    </div>
    <div class="loginInput ">
        <span class="loginInputIcon ">
            <span class=" glyphicon glyphicon-lock"></span>
        </span>
        <input id="password" name="password" type="password" placeholder="密码" >
    </div>
    <div>
    	<span class="loginInputIcon ">
        	<span class=" glyphicon glyphicon-picture"></span>&nbsp;&nbsp;&nbsp;&nbsp;
        </span>
	    <input style="width:120px;height: 40px;" type="text" id="code" name="code" placeholder="请输入验证码" maxlength="4">
	    <img src="/film/validcode" width="80" height="40"/><a href="" id="a_valid">换一张</a>
	</div>
    <div style="margin-top:20px">
        <button class="btn btn-block redButton loginSubmitButton" id="btn_login" type="button">登录</button>
    </div>
    <div style="margin-top: 20px;">
        <a class="notImplementLink" href="modifyPassWord.jsp">忘记登录密码</a>
        <a href="register.jsp" class="pull-right">免费注册</a>
    </div>
</div>



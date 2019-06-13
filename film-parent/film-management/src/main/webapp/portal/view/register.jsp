<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="include/header.jsp" %>
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
<script>
    $(function () {
    	$("a").click(function(){
    		//浏览器带有缓存功能,不会多次请求相同数据
    		$("img").attr("src","/film/validcode?date="+new Date());
    		return false;
    	})
        $("form.registerFrom input").keyup(function () {
            $("div.registerErrorMessageDiv").hide();
        });
        $("#btn_register").click(function () {
            if (validateLogin()) {
                $.ajax({
                    url: "/film/register",
                    type: "POST",
                    data: {"name": $("#name").val(), "password": $("#password").val(),"phone":$("#phone").val(),"status":"非会员","sex":$("#sex").val(),"email":$("#email").val(),"code":$("#code").val()},
                    success: function (result) {
                        if ("success" == result) {
                            alert("注册成功");
                            window.location.href = "/film/portal/view/login.jsp";
                        } else if("false" == result){
                            $("span.errorMessage").html("验证码错误");
                            $("div.registerErrorMessageDiv").show();
                            $("#name").val("");
                            $("#password").val("");
                            $("#password-confirm").val("");
                        }else{
                        	$("span.errorMessage").html("用户名已存在");
                            $("div.registerErrorMessageDiv").show();
                            $("#name").val("");
                            $("#password").val("");
                            $("#password-confirm").val("");
                        }
                    },
                    error: function (result) {
                        window.location.reload();
                        $("span.errorMessage").html(result);
                        $("div.registerErrorMessageDiv").show();
                    }
                });
            }
        });
    });

    //校验
    function validateLogin() {
        if (0 == $("#name").val().length || 0 == $("#password").val().length || 0==$("#phone").val().length || 0==$("#sex").val().length || 0==$("#email").val().length) {
            $("span.errorMessage").html("请填写完整信息");
            $("div.registerErrorMessageDiv").show();
            return false;
        }
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
        //性别校验
        var sex = document.getElementById("sex").value;
        if (!(sex=="男" || sex=="女")) {
        	$("span.errorMessage").html("性别不合法");
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
<div class="registerDivPage container" style="height: 600px;">
    <div class="registerErrorMessageDiv">
        <div class="alert alert-danger">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
            <span class="errorMessage"></span>
        </div>
    </div>

    <div class="register_account_text">用户注册</div>
    <div class="registerInput ">
        <span class="registerInputIcon"><span class=" glyphicon glyphicon-user"></span></span>
        <input id="name" name="name" placeholder="用户名为字母开头5-16位字母、数字或下划线组成" type="text">
    </div>
    <div class="registerInput">
        <span class="registerInputIcon"><span class="glyphicon glyphicon-lock"></span></span>
        <input id="password" name="password" type="password" placeholder="密码字母开头由6~18位字母、数字或下划线组成" >
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
        <span class="registerInputIcon"><span class=" glyphicon glyphicon-user"></span></span>
        <input id="sex" name="sex" placeholder="性别为男或女" type="text">
    </div>
    <div class="registerInput ">
        <span class="registerInputIcon"><span class=" glyphicon glyphicon-envelope"></span></span>
        <input id="email" name="email" placeholder="邮箱格式形如:xxx@xxx.com" type="text">
    </div>
    <div>
    	<span class="registerInputIcon">
        	<span class=" glyphicon glyphicon-picture"></span>&nbsp;&nbsp;&nbsp;&nbsp;
        </span>
	    <input style="width:120px;height: 40px;" type="text" id="code" name="code" placeholder="请输入验证码" maxlength="4">
	    <img src="/film/validcode" width="80" height="40"/><a href="">换一张</a>
	</div>
    <div style="margin-top:20px">
        <button class="btn btn-block redButton" id="btn_register" type="submit">注册</button>
    </div>
</div>
</body>
</html>

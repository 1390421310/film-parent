<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<script src="/film/portal/static/md5.min.js"></script>
<style>
    div.modal-content {
        margin: auto;
        width: 360px;
    }

    div.loginDivInProductPage {
        margin: auto;
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
        left: 4px;
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
</style>
<div class="modal " id="loginModal" tabindex="-1" role="dialog">
    <div class="modal-dialog loginDivInProductPageModalDiv">
        <div class="modal-content">
            <div class="loginDivInProductPage">
                <div class="loginErrorMessageDiv">
                    <div class="alert alert-danger">
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
                        <span class="errorMessage"></span>
                    </div>
                </div>
                <div class="login_account_text">账户登录</div>
                <div class="loginInput ">
                            <span class="loginInputIcon ">
                                <span class=" glyphicon glyphicon-user"></span>
                            </span>
                    <input id="name" name="name" placeholder="会员名" type="text">
                </div>
                <div class="loginInput ">
                            <span class="loginInputIcon ">
                                <span class=" glyphicon glyphicon-lock"></span>
                            </span>
                    <input id="password" name="password" type="password" placeholder="密码" type="password">
                </div>
                <div>
                    <a href="#nowhere">忘记登录密码</a>
                    <a href="register.jsp" class="pull-right">免费注册</a>
                </div>
                <div style="margin-top:20px">
                    <button class="btn btn-block redButton loginSubmitButton" type="submit">登录</button>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="modal" id="deleteConfirmModal" tabindex="-1" role="dialog">
    <div class="modal-dialog deleteConfirmModalDiv">
        <div class="modal-content">
            <div class="modal-header">
                <button data-dismiss="modal" class="close" type="button"><span aria-hidden="true">×</span><span
                        class="sr-only">Close</span></button>
                <h4 class="modal-title">确认删除？</h4>
            </div>
            <div class="modal-footer">
                <button data-dismiss="modal" class="btn btn-default" type="button">关闭</button>
                <button class="btn btn-primary deleteConfirmButton" id="submit" type="button">确认</button>
            </div>
        </div>
    </div>
</div>

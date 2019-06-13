<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 顶部导航栏 --%>
<nav id="site-nav" role="navigation">
    <div class="workArea">
        <%-- 导航栏左半部分 如果取不到用户信息则显示如下 --%>
        <a href="/film/portal/view/index.jsp">
            <span class="glyphicon glyphicon-home">&ensp;商城首页</span>
        </a>
        <c:if test="${empty sessionScope.name}">
            <span>欢迎进入</span>
            <span><a href="/film/portal/view/login.jsp">亲,请登录</a></span>
            <span><a href="/film/portal/view/register.jsp">免费注册</a></span>
        </c:if>
        <%-- 如果用户成功登录，则显示如下 --%>
        <c:if test="${!empty sessionScope.name}">
        	<input type="hidden" name="id" value="${sessionScope.id }">
            <span class="glyphicon glyphicon-user">&ensp;${sessionScope.name}</span>
            <span><a href="/film/logout">退出登录</a></span>
        </c:if>

        <%-- 导航栏右半部分 使用Bootstrap的pull-right类 --%>
        <script>
            function delet(){
            	var temp = confirm("确认注销账户吗?");
            	return temp;
            }
        </script>
        <c:if test="${!empty sessionScope.name}">
        <span class="pull-right">
            <span><a href="/film/showOrder">我的订单</a></span>
            <span><a href="/film/selUserById?id=${sessionScope.id }">个人中心</a></span>
            <span><a href="/film/delUser?id=${sessionScope.id }" onclick="return delet()">注销账户</a></span>
        </span>
        </c:if>
    </div>
</nav>

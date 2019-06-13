<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<body>
	<table class="table table-bordered" >
		<caption>个人信息</caption>
		<tbody>
			<c:forEach items="${list }" var="li">
				<tr>
					<td>姓名</td>
					<td>${li.name }</td>
				</tr>
				<tr>
					<td>密码</td>
					<td>${li.password }</td>
				</tr>
				<tr>
					<td>联系方式</td>
					<td>${li.phone }</td>
				</tr>
				<tr>
					<td>会员</td>
					<td>${li.status }</td>
				</tr>
				<tr>
					<td>性别</td>
					<td>${li.sex }</td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td>${li.email }</td>
				</tr>
				<tr>
					<td>操作</td>
					<td><a href="/film/pageSkipInformation?id=${li.id }" >修改个人信息</a>
						<c:if test="${li.status=='非会员' }">
							<a href="/film/portal/view/member.jsp">升级会员</a>
						</c:if>
					</td>
				</tr>
			</c:forEach> 
		</tbody>
	</table>
</body>
</html>
<%@include file="include/footer.jsp"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户</title>
<style type="text/css">
	a {
	color: blue;
}
</style>
</head>
<body >
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>用户名</th>
				<th>密码</th>
				<th>联系方式</th>
				<th>是否会员</th>
				<th>性别</th>
				<th>邮箱</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="u">
				<tr>
					<td>${u.name }</td>
					<td>${u.password }</td>
					<td>${u.phone }</td>
					<td>${u.status }</td>
					<td>${u.sex }</td>
					<td>${u.email }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
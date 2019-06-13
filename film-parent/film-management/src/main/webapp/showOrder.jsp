<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单</title>
<style type="text/css">
	a {
	color: blue;
}
</style>
</head>
<body>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>订单id</th>
				<th>影片名称</th>
				<th>影院名称</th>
				<th>场厅名称</th>
				<th>座位号</th>
				<th>时间场次</th>
				<th>票价</th>
				<th>支付状态</th>
				<th>用户名</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="li">
				<tr>
					<td>${li.id }</td>
					<td>${li.film }</td>
					<td>${li.cinema }</td>
					<td>${li.room }</td>
					<td>${li.seat }</td>
					<td>${li.times }</td>
					<td>${li.price }</td>
					<td>${li.state }</td>
					<td>${li.name }</td>					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
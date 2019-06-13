<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询评论</title>
<style type="text/css">
	a {
	color: blue;
}
</style>
</head>
<body>
	<c:if test="${flag=='true' }">
		<h5 style="color: green;">提示信息:删除成功</h5>
	</c:if>
	<c:if test="${flag=='false' }">
		<h5 style="color: red;">提示信息:删除失败</h5>
	</c:if>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>评论id</th>
				<th>评论内容</th>
				<th>影片名称</th>
				<th>评论人</th>
				<th>评论日期</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="comm">
				<tr>
					<td>${comm.id }</td>
					<td>${comm.content }</td>
					<td>${comm.fname }</td>
					<td>${comm.uname }</td>
					<td><fmt:formatDate value="${comm.createdate }"/></td>
					<td><a href="delComment?id=${comm.id }" onclick="return delet()">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
<script type="text/javascript">
	function delet() {
		var temp = confirm("您确认要删除此条评论吗?");
		return temp;
	}
</script>
</html>
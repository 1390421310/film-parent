<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询类别</title>
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
	<c:if test="${temp=='true' }">
		<h5 style="color: green;">提示信息:修改成功</h5>
	</c:if>
	<c:if test="${temp=='false' }">
		<h5 style="color: red;">提示信息:修改失败</h5>
	</c:if>	
	<c:if test="${var=='true' }">
		<h5 style="color: green;">提示信息:新增成功</h5>
	</c:if>
	<c:if test="${var=='false' }">
		<h5 style="color: red;">提示信息:新增失败</h5>
	</c:if>
		<table class="table table-bordered">
			<thead>
			<tr>
				<th>类别id</th>
				<th>类别名称</th>
				<th>操作</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${list }" var="cat">
				<tr>
					<td>${cat.id }</td>			
					<td>${cat.name }</td>
					<td><a href="pageSkipCategory?id=${cat.id }" >修改</a>&nbsp;&nbsp;
						<a href="delCategory?id=${cat.id }" onclick="return delet()">删除</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>	
</body>
<script type="text/javascript">
	function delet() {
		var temp = confirm("您确认要删除该类别吗?");
		return temp;
	}
</script>
</html>
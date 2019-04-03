<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="1000px" border="1" cellspacing="0" >
		<tr>
			<td colspan="4" height="70px" align="center">
			<span style="font-size: 60px;font-weight: bold;">评论列表</span>
			<input type="button" value="返回新闻列表" onclick="javascript:window.location.href='/news/show'">
			</td>
		</tr>
		<tr bgcolor="skyblue">
			<th>评论编号</th>
			<th>评论内容</th>
			<th>评论人</th>
			<th>评论时间</th>
		</tr>
		<c:forEach items="${list }" var="comment">
			<tr>
				<td>${comment.id }</td>
				<td>${comment.content }</td>
				<td>${comment.author }</td>
				<td><fmt:formatDate value="${comment.createDate }"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
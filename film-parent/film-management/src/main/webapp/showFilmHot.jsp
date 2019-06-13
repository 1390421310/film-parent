<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询正在热映影片</title>
</head>
<body>
	<c:forEach items="${list }" var="f">
		<div>
			<div style="float: left;">
				<img alt="网络不流畅" src="http://192.168.126.130/${f.photo.name }"
					width="230px" height="350px">
			</div>
			<div style="float: right;width: 1000px;height: 350px; ">
				<table style="font-size: 20px;">
					<tr>
						<td>片名:&nbsp;&nbsp;${f.name }</td>
					</tr>
					<tr>
						<td>导演:&nbsp;&nbsp;${f.director }</td>
					</tr>
					<tr>
						<td>主演:&nbsp;&nbsp;${f.actor  }</td>
					</tr>
					<tr>
						<td>时长(分钟):&nbsp;&nbsp;${f.duration  }</td>
					</tr>
					<tr>
						<td>国家:&nbsp;&nbsp;${f.country  }</td>
					</tr>
					<tr>
						<td>评分:&nbsp;&nbsp;${f.score  }</td>
					</tr>
					<tr>
						<td>上映日期:&nbsp;&nbsp;<fmt:formatDate value="${f.createdate }" /></td>
					</tr>
					<tr>
						<td>类别:&nbsp;&nbsp;${f.cname }</td>
					</tr>
					<tr>
						<td width="800px">简介:&nbsp;&nbsp;${f.description }</td>
					</tr>
					<tr>
						<td>下架该影片:&nbsp;&nbsp;<a href="delFilmHotById?id=${f.id }">删除</a></td>
					</tr>					
				</table>
			</div>
		</div>
	</c:forEach>
</body>
</html>
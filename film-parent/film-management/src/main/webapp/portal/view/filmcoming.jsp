<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全部即将上映影片</title>
</head>
<body>
	<c:forEach items="${list}" var="h">
		<div style="float: left;margin-left: 100px;">
			<img title="${h.name }"
				src="http://192.168.126.130/${h.photo.name }" width="180"
				height="260">
			<div
				style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
				<a href="/film/info?id=${h.id }">影片详情</a>&nbsp;&nbsp;
			</div>
		</div>
	</c:forEach>
</body>
</html>
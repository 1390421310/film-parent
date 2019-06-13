<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>影片信息</title>
<style type="text/css">
	body {
        background-image: url(portal/img/info4.jpg);
        background-repeat: no-repeat;
        background-size: 100% 100%;
    }
</style>
</head>
<body>
	<div>
		<div align="center">
			<h2>
				<span>${filmhot.name }</span>
			</h2>
		</div>
		<hr>
		<div style="float: left; margin-left: 100px;">
			<img alt="网络不流畅" src="http://192.168.126.130/${filmhot.photo.name }"
				width="230px" height="350px">
		</div>
		<div
			style="float: left; width: 1000px; height: 350px; margin-left: 20px;">
			<table style="font-size: 20px;">
				<tr>
					<td>导演:&nbsp;&nbsp;${filmhot.director }</td>
				</tr>
				<tr>
					<td>主演:&nbsp;&nbsp;${filmhot.actor  }</td>
				</tr>
				<tr>
					<td>片长:&nbsp;&nbsp;${filmhot.duration  }<span>分钟</span></td>
				</tr>
				<tr>
					<td>制片国家:&nbsp;&nbsp;${filmhot.country  }</td>
				</tr>
				<tr>
					<td>上映日期:&nbsp;&nbsp;<fmt:formatDate
							value="${filmhot.createdate }" /></td>
				</tr>
				<tr>
					<td>类型:&nbsp;&nbsp;${filmhot.cname }</td>
				</tr>
				<tr>
					<td width="800px">剧情介绍:&nbsp;&nbsp;${filmhot.description }</td>
				</tr>
				<tr>
					<td>评分:&nbsp;&nbsp;${filmhot.score }</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
<%@include file="include/footer.jsp"%>
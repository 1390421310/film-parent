<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
a {
	margin-left: 10px;
}
</style>
<script type="text/javascript" src="js/jquery-1.9.1.js">
</script>
</head>
<body>
	<div align="center">
		<div>
			<form action="search" method="post">
				<span style="font-size: 20px; font-weight: bold;">新闻标题:</span> 
				<input type="text" name="title" value="${title}"/> 
				<input type="submit" value="查询" id="test" />
			</form>
		</div>
		<div>
			<table border="1" width="1000" cellspacing="0">

				<tr>
					<td colspan="6" align="center"><span
						style="font-size: 20px; font-weight: bold;">新闻列表</span></td>
				</tr>


				<tr bgcolor="#CDC8FD">
					<th>新闻编号</th>
					<th>新闻标题</th>
					<th>新闻摘要</th>
					<th>作者</th>
					<th>创建时间</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list }" var="news">
					<tr>
						<td>${news.id }</td>
						<td>${news.title }</td>
						<td>${news.summary }</td>
						<td>${news.author }</td>
						<td>${news.createDate }</td>
						<td>
							<a href="showComment/${news.id }">查看评论</a>
							<a href="addCommentController/${news.id }">评论</a>
							<a href="delete/${news.id }">删除</a>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td>
						
							<c:if test="${flag eq true }">
							<span style="background-color: red">删除成功</span>
							</c:if>
							
							<c:if test="${flag eq false }">
							<span style="background-color: yellow">删除失败</span>
							</c:if>
						
					</td>
				</tr>
			</table>
		</div>
	</div>
	
	
</body>
</html>
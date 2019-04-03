<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加评论</title>
</head>
<body>
	<form action="/news/addComment/newsid/content/author" method="post">
		<input type="hidden" name="newsid" value="${newsid }">
		<table style="border: 1px solid black; " >
			<thead>
				<tr bgcolor="skyblue" >
					<td colspan="2" height="50" align="center"><span style="font-size: 40px;font-weight: bold;">增加评论</span></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>评论内容(*)</td>
					<td><textarea rows="5" cols="80" name="content"></textarea></td>
				</tr>
				<tr>
					<td>评论人</td>
					<td><input type="text" name="author"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交">
					<input type="button" value="返回" onclick="javascript:history.go(-1)"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
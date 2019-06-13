<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加评论</title>
</head>
<body>
	<form class="form-horizontal" role="form" action="/film/addComment" method="post">
		<input type="hidden" name="fname" value="${fname }">
		<input type="hidden" name="uname" value="${sessionScope.name }">
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">添加评论:</label>
			<div class="col-sm-4">
				<textarea class="form-control" id="name" name="content"></textarea>
			</div>
		</div>
		<div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-success">提交</button>
		    </div>
		 </div>
	</form>
</body>
</html>
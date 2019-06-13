<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增正在热映影片</title>
</head>
<body>
	<form class="form-horizontal" role="form" action="insFilmHot" method="post" onsubmit="return validate()" enctype="multipart/form-data">
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">影片名称</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入影片名称">
			</div>
		</div>
		<div class="form-group">
			<label for="director" class="col-sm-2 control-label">导演</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="director" name="director"
					placeholder="请输入导演">
			</div>
		</div>
		<div class="form-group">
			<label for="actor" class="col-sm-2 control-label">演员</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="actor" name="actor"
					placeholder="请输入演员">
			</div>
		</div>
		<div class="form-group">
			<label for="duration" class="col-sm-2 control-label">片长(分钟)</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="duration" name="duration"
					placeholder="请输入片长，单位分钟">
			</div>
		</div>
		<div class="form-group">
			<label for="country" class="col-sm-2 control-label">国家</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="country" name="country"
					placeholder="请输入国家">
			</div>
		</div>
		<div class="form-group">
			<label for="description" class="col-sm-2 control-label">简介</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="description" name="description"
					placeholder="请输入影片简介">
			</div>
		</div>
		<div class="form-group">
			<label for="score" class="col-sm-2 control-label">评分</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="score" name="score"
					placeholder="请输入评分">
			</div>
		</div>
		<div class="form-group">
			<label for="file" class="col-sm-2 control-label">宣传海报</label>
			<div class="col-sm-3">
				<input type="file" class="form-control" id="file" name="file"
					placeholder="请选择一张图片">
			</div>
		</div>
		<div class="form-group">
		    <label for="cid" class="col-sm-2 control-label">影片类别</label>
		   	<div class="col-sm-2">
			    <select class="form-control" name="cid">
			      <c:forEach items="${list }" var="cat">
						<option value="${cat.id }">${cat.name }</option>
					</c:forEach>
			    </select>
		   	</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">提交</button>
				<span class="errorMessage" hidden="hidden" ></span>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript">
	function validate() {
		if (0 == $("#name").val().length) {
            $("span.errorMessage").html("请填写影片名称");
            $("span").show();
            return false;
        }
		if (0 == $("#director").val().length) {
            $("span.errorMessage").html("请填写导演");
            $("span").show();
            return false;
        }
		if (0 == $("#actor").val().length) {
            $("span.errorMessage").html("请填写演员");
            $("span").show();
            return false;
        }
		if (0 == $("#duration").val().length) {
            $("span.errorMessage").html("请填写片长");
            $("span").show();
            return false;
        }
		if (0 == $("#country").val().length) {
            $("span.errorMessage").html("请填写国家");
            $("span").show();
            return false;
        }
		if (0 == $("#description").val().length) {
            $("span.errorMessage").html("请填写简介");
            $("span").show();
            return false;
        }
		if (0 == $("#score").val().length) {
            $("span.errorMessage").html("请填写评分");
            $("span").show();
            return false;
        }
		if (0 == $("#file").val().length) {
            $("span.errorMessage").html("请选择图片");
            $("span").show();
            return false;
        }
	}
</script>
</html>
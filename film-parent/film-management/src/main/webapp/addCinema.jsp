<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增影院</title>
</head>
<body>
	<form class="form-horizontal" role="form" action="insCinema" method="post" onsubmit="return validate()">
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">影院名称</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入影院名称">
			</div>
		</div>
		<div class="form-group">
			<label for="number" class="col-sm-2 control-label">订票电话</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="number" name="number"
					placeholder="请输入订票电话">
			</div>
		</div>
		<div class="form-group">
			<label for="address" class="col-sm-2 control-label">影院地址</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="address" name="address"
					placeholder="请输入影院地址">
			</div>
		</div>
		<div class="form-group">
		    <label for="cid" class="col-sm-2 control-label">所属城市</label>
		   	<div class="col-sm-2">
			    <select class="form-control" name="cid">
			      <c:forEach items="${list }" var="cit">
						<option value="${cit.id }">${cit.name }</option>
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
            $("span.errorMessage").html("请填写影院名称");
            $("span").show();
            return false;
        }
		if (0 == $("#number").val().length) {
            $("span.errorMessage").html("请填写订票电话");
            $("span").show();
            return false;
        }
		if (0 == $("#address").val().length) {
            $("span.errorMessage").html("请填写影院地址");
            $("span").show();
            return false;
        }
	}
</script>
</html>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="form-horizontal" role="form" action="modifyCategory" method="post" onsubmit="return validate()">
				 <input type="hidden"  name="id" value="${id }"><br>
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">当前类别名称:</label>
			<div class="col-sm-2">
				<input type="text" value="${name }" readonly="readonly">
			</div>
		</div>
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">新的类别名称</label>
			<div class="col-sm-3">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入新的名称">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-success">修改</button>
				<span class="errorMessage" hidden="hidden" ></span>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript">
	function validate() {
		if (0 == $("#name").val().length) {
            $("span.errorMessage").html("请输入类别名称");
            $("span").show();
            return false;
        }
	}
</script>
</html>
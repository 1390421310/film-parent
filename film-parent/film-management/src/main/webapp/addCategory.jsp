<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增影片类别</title>
</head>
<body>
	<form class="form-horizontal" role="form" action="insCategory" method="post" onsubmit="return validate()">
		<div class="form-group">				        
			<label for="name" class="col-sm-2 control-label">请输入影片类别名称:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入类别名称">
			</div>
			<button type="submit" class="btn btn-success">提交</button>
			<span class="errorMessage" hidden="hidden" ></span>
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
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增放映厅</title>
</head>
<body>
	<form class="form-horizontal" role="form" action="insRoom" method="post" onsubmit="return validate()">
		<div class="form-group">
			<label for="name" class="col-sm-2 control-label">场厅名称</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入场厅名称">
			</div>
		</div>
		<div class="form-group">
			<label  class="col-sm-2 control-label">座位数量</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" id="total" name="total"
					placeholder="请输入座位数量">
			</div>
		</div>
		<div class="form-group">
		    <label for="cid" class="col-sm-2 control-label">所属影院</label>
		   	<div class="col-sm-2">
			    <select class="form-control" name="cid">
			      <c:forEach items="${list }" var="cin">
						<option value="${cin.id }">${cin.name }</option>	
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
            $("span.errorMessage").html("请填写场厅名称");
            $("span").show();
            return false;
        }
		if (0 == $("#total").val().length) {
            $("span.errorMessage").html("请填写座位数量");
            $("span").show();
            return false;
        }
	}
</script>
</html>
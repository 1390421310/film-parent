<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改放映厅信息</title>
</head>
<body>
	<form action="modifyRoom" method="post" onsubmit="return validate()">
		<input type="hidden" name="id" value="${room.id }">
		<table class="table table-bordered">
			<caption>修改场厅信息</caption>
			<tbody>
				<tr>
					<td>座位数量:${room.total }</td>
					<td>修改为:<input type="text" name="total" id="total"></td>
				</tr>
				<tr>
					<td>场厅名称:${room.name }</td>
					<td>修改为:<input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="hidden" name="cid"
					value="${room.cid }"> 所属影院名称:${room.cinema.name }</td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit" class="btn btn-success">修改</button>
					<span class="errorMessage" hidden="hidden" ></span>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
<script type="text/javascript">
	function validate() {
		if (0 == $("#total").val().length) {
            $("span.errorMessage").html("请填写座位数量");
            $("span").show();
            return false;
        }
		if (0 == $("#name").val().length) {
            $("span.errorMessage").html("请填写场厅名称");
            $("span").show();
            return false;
        }
	}
</script>
</html>
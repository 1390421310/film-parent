<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="portal/view/include/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改影院信息</title>
</head>
<body>
	<form action="modifyCinema" method="post" onsubmit="return validate()">
		<input type="hidden" name="id" value="${id }">
		<table class="table table-bordered">
			<caption>修改影院信息</caption>
			<tbody>
				<tr>
					<td>影院名称:${cinema.name }</td>
					<td>新的名称:<input type="text" id="name" name="name" placeholder="请输入新的影院名称"></td>
				</tr>
				<tr>
					<td>订票电话:${cinema.number }</td>
					<td>新的电话:<input type="text" id="number" name="number" placeholder="请输入新的订票电话"></td>
				</tr>
				<tr>
					<td>影院地址:${cinema.address }</td>
					<td>新的地址:<input type="text" id="address" name="address" placeholder="请输入新的地址"></td>
				</tr>
				<tr>
					<td>所属城市:${cinema.city.name }</td>
					<td>新的城市:
						<select name="cid">
							<c:forEach items="${list }" var="c">
								<option value="${c.id }">${c.name }</option>
							</c:forEach>
			 			</select>
					</td>
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
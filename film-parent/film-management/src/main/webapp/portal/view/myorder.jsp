<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
</head>
<body>
	<div>
			<table class="table table-condensed">
				<caption>我的订单</caption>
				<thead>
					<tr>
						<th>影片名称</th>
						<th>影院名称</th>
						<th>场厅名称</th>
						<th>座位</th>
						<th>时间场次</th>
						<th>票价</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="o">
						<tr>
							<td>${o.film }</td>
							<td>${o.cinema }</td>
							<td>${o.room }</td>
							<td>${o.seat }</td>
							<td>${o.times }</td>
							<td>${o.price }</td>
							<td>${o.state }</td>
							<td><a href="/film/pageskipComment?id=${o.id }" >添加评论</a>
								<c:if test="${o.state=='未支付' }">
									<a href="/film/pay?price=${o.price }">去支付</a>
								</c:if>
								<c:if test="${o.state=='已支付' }">
									<a href="/film/delOrder?id=${o.id }" onclick="return delet()">退票</a>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
</body>
<script type="text/javascript">
	function delet(){
		var temp = confirm("退票需知:\n开场前二小时之内退票不收取手续费;\n开场前一小时之内退票需付20%票价的手续费;\n开场前半小时之内退票需付40%票价的手续费;\n开场前十五分钟之内不允许退票;\n继续退票点击确认,返回点取消");
    	return temp;
	}
</script>
</html>
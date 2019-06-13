<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>订票页面</title>
</head>
<body>
	<div>
		<div>
			<div align="center">
				<h2>
					<span>${filmhot.name }</span>
				</h2>
			</div>
			<hr>
			<div style="float: left;margin-left: 100px;">
				<img alt="网络不流畅" src="http://192.168.126.130/${filmhot.photo.name }"
					width="230px" height="350px">
			</div>
			<div style="float: left; width: 1000px; height: 350px;margin-left: 20px;">
				<table style="font-size: 20px;">
					<tr>						
						<td>导演:&nbsp;&nbsp;${filmhot.director }</td>
					</tr>
					<tr>						
						<td>主演:&nbsp;&nbsp;${filmhot.actor  }</td>
					</tr>
					<tr>					
						<td>片长:&nbsp;&nbsp;${filmhot.duration  }<span>分钟</span></td>
					</tr>
					<tr>					
						<td>制片国家:&nbsp;&nbsp;${filmhot.country  }</td>
					</tr>
					<tr>					
						<td>上映日期:&nbsp;&nbsp;<fmt:formatDate value="${filmhot.createdate }" /></td>
					</tr>
					<tr>					
						<td>类型:&nbsp;&nbsp;${filmhot.cname }</td>
					</tr>
					<tr>
						<td width="800px">剧情介绍:&nbsp;&nbsp;${filmhot.description }</td>
					</tr>
					<tr>					
						<td>评分:&nbsp;&nbsp;${filmhot.score }</td>
					</tr>
				</table>
			</div>
		</div>
		<div>
			<table class="table table-condensed">
				<caption>选座购票</caption>
				<thead>
					<tr>
						<th>影院名称</th>
						<th>场厅名称</th>
						<th>座位</th>
						<th>时间场次</th>
						<th>票价</th>
						<th>订票</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${accord }" var="acc">
						<tr>
							<td>${acc.cinema }</td>
							<td>${acc.room }</td>
							<td><select id="seat">
									<option>一排一号</option>
									<option>一排二号</option>
									<option>一排三号</option>
									<option>一排四号</option>
									<option>一排五号</option>
									<option>一排六号</option>
									<option>一排七号</option>
									<option>一排八号</option>
									<option>一排九号</option>
									<option>一排十号</option>
									<option>二排一号</option>
									<option>二排二号</option>
									<option>二排三号</option>
									<option>二排四号</option>
									<option>二排五号</option>
									<option>二排六号</option>
									<option>二排七号</option>
									<option>二排八号</option>
									<option>二排九号</option>
									<option>二排十号</option>
									<option>三排一号</option>
									<option>三排二号</option>
									<option>三排三号</option>
									<option>三排四号</option>
									<option>三排五号</option>
									<option>三排六号</option>
									<option>三排七号</option>
									<option>三排八号</option>
									<option>三排九号</option>
									<option>三排十号</option>
							</select></td>
							<td>
								<select id="times">
									<option>5月24号 8:00-9:44</option>
									<option>5月24号 10:00-11:44</option>
									<option>5月24号 12:00-13:44</option>
									<option>5月24号 14:00-15:44</option>
									<option>5月24号 16:00-17:44</option>
								</select>
							</td>
							<td>${acc.price }</td>
							<td>
								<a onclick="buy(${acc.id })" href="">提交订单</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
<script type="text/javascript">
		function buy(data){
			var uid = ${sessionScope.id};			
			$.ajax({
				 url: "/film/commit",
                 type: "POST",
                 data: {"id": data,"seat":$("#seat").val(),"times":$("#times").val(),"uid":uid},
                 success: function (result) {
                     if ("success" == result) {
                         alert("加入订单成功");
                         window.location.href = "/film/showOrder?id="+${sessionScope.id};  
                     } else {
                    	 alert("该座位已被预定");
                    	 window.location.reload();  
                     }
                 },
                 error: function (result) {
                	 alert(result);
                     window.location.reload();                  
                 }
			});
		}
</script>
</html>
<%@include file="include/footer.jsp"%>
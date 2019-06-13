<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
#myCarousel img {
	height: 100%;
	width: 100%;
}

li, ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

.hot-word-line a {
	margin-left: 13px;
	height: 22px;
	line-height: 22px;
	font-size: 14px;
	float: left;
}

div.floor-line-con {
	margin-top: 20px;
	height: 330px;
	/*position: relative;*/
	float: left;
	overflow: hidden;
}

div.floor-line-con i {
	background-color: #0AA6E8;
	width: 5px;
	height: 18px;
	display: inline-block;
	vertical-align: middle;
}

.floor-name {
	margin-left: 10px;
	display: inline-block;
	font-size: 18px;
	color: #000000;
	height: 28px;
	vertical-align: middle;
}

.grid {
	margin-left: 13px;
	text-align: center;
}

.productItem {
	display: block;
	float: left;
	width: 233px;
	height: 300px;
	border: 1px solid #FFFFFF;
}

.productItem:hover {
	border: 1px solid #FF0036;
}

.floor-item-img {
	object-fit: cover;
	margin-top: 20px;
	position: relative;
	width: 185px;
	height: 185px;
}

.floor-item-title {
	width: 135px;
	height: 40px;
	font-size: 14px;
	color: #333333;
	line-height: 20px;
	overflow: hidden;
	margin: 8px auto;
}

.floor-price {
	font-size: 18px;
	color: #FF0036;
	line-height: 18px;
	margin: 10px auto;
}

.tm-end {
	/*display: block;*/
	position: relative;
	text-align: center;
	width: 80px;
	height: 45px;
	margin: 0 auto;
	-webkit-background-size: cover;
	background-size: cover;
	z-index: 9;
}

div.floor-name a:link {
	color: #0c0c0c;
}

div.floor-name a:hover {
	color: red;
}
</style>

<%-- 轮播 --%>
<div id="myCarousel" class="carousel slide " style="height: 500px;">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner">
		<div class="item active">
			<img class="img-responsive center-block"
				src="/film/portal/img/carousel1.jpg" alt="First slide">
		</div>
		<div class="item">
			<img class="img-responsive center-block"
				src="/film/portal/img/carousel2.jpg" alt="Second slide">
		</div>
		<div class="item">
			<img class="img-responsive center-block"
				src="/film/portal/img/carousel3.jpg" alt="Third slide">
		</div>
	</div>
	<!-- 轮播（Carousel）导航 -->
	<a class="left carousel-control" href="#myCarousel" role="button"
		data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
		aria-hidden="true"></span> <span class="sr-only">Previous</span>
	</a> <a class="right carousel-control" href="#myCarousel" role="button"
		data-slide="next"> <span class="glyphicon glyphicon-chevron-right"
		aria-hidden="true"></span> <span class="sr-only">Next</span>
	</a>
</div>
<%--分类显示--%>
<div class="new-floor-con">
	<div class="workArea">
		<ul id="myTab" class="nav nav-tabs">
			<li class="active"><a href="#home" data-toggle="tab">正在热映</a></li>
			<li><a href="#ios" data-toggle="tab">即将上映</a></li>
		</ul>
		<div id="myTabContent" class="tab-content">
			<div class="tab-pane fade in active" id="home">
				<div style="float: left;">
					<img title="复仇者联盟4:终局之战"
						src="http://192.168.126.130/1557300879986.jpg" width="180"
						height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/information?id=11">影片详情</a>&nbsp;&nbsp; <a
							href="/film/buyPage?id=11">选座购票</a>
					</div>
				</div>
				<div style="float: left; margin-left: 60px;">
					<img title="何以为家" src="http://192.168.126.130/1557301000824.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/information?id=10">影片详情</a>&nbsp;&nbsp; <a
							href="/film/buyPage?id=10">选座购票</a>
					</div>
				</div>

				<div style="float: left; margin-left: 60px;">
					<img title="下一任:前任" src="http://192.168.126.130/1557301011162.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/information?id=7">影片详情</a>&nbsp;&nbsp; <a
							href="/film/buyPage?id=7">选座购票</a>
					</div>
				</div>
				<div style="float: left; margin-left: 60px;">
					<img title="大侦探皮卡丘" src="http://192.168.126.130/1557301022933.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/information?id=8">影片详情</a>&nbsp;&nbsp; <a
							href="/film/buyPage?id=8">选座购票</a>
					</div>
				</div>

				<div style="float: left; margin-left: 60px;">
					<img title="雪暴" src="http://192.168.126.130/1557301033239.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/information?id=9">影片详情</a>&nbsp;&nbsp; <a
							href="/film/buyPage?id=9">选座购票</a>
					</div>
				</div>
				<div
					style="float: right; font-size: 15px; margin-left: 20px; width: 70px;">
					<a href="/film/filmhot">全部正在热映影片</a>
				</div>
			</div>
			<div class="tab-pane fade" id="ios">
				<div style="float: left;">
					<img title="哥斯拉2:怪兽之王"
						src="http://192.168.126.130/1557320480746.jpg" width="180"
						height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/info?id=1">影片详情</a>
					</div>
				</div>
				<div style="float: left; margin-left: 60px;">
					<img title="X战警:黑凤凰" src="http://192.168.126.130/1557320489748.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/info?id=2">影片详情</a>
					</div>
				</div>
				<div style="float: left; margin-left: 60px;">
					<img title="黑衣人:全球追缉"
						src="http://192.168.126.130/1557745096350.jpg" width="180"
						height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/info?id=3">影片详情</a>
					</div>
				</div>
				<div style="float: left; margin-left: 60px;">
					<img title="双生" src="http://192.168.126.130/1557745722261.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/info?id=4">影片详情</a>
					</div>
				</div>
				<div style="float: left; margin-left: 60px;">
					<img title="扫毒2天地对决" src="http://192.168.126.130/1557746074345.jpg"
						width="180" height="260">
					<div
						style="width: 180px; height: 30px; background-color: #EB002A; line-height: 30px; color: white; text-align: center;">
						<a href="/film/info?id=5">影片详情</a>
					</div>
				</div>
				<div
					style="float: right; font-size: 15px; margin-left: 20px; width: 70px;">
					<a href="/film/filmcoming">全部即将上映影片</a>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="include/footer.jsp"%>

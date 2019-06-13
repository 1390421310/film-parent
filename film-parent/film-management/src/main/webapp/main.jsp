<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">

<title>后台管理中心</title>
<link rel="stylesheet" href="css/admin.css">
<link rel="stylesheet" href="css/pintuer.css">
<script src="js/jquery.js"></script>

</head>
<body style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" />网上电影订票系统后台管理中心
			</h1>
		</div>
		<div class="head-l">
			<a class="button button-little bg-red" href="index.jsp"><span
				class="icon-power-off"></span> 退出登录</a>
		</div>
		<div style="float: right;">
			<span style="line-height: 70px;color: white;font-size: 20px;" >当前用户:${sysname }</span>
		</div>
	</div>
	<div class="leftnav">
		<h2>
			基本设置
		</h2>
		<ul style="display: block">	
			<li><a href="modifyPwd.jsp"><span></span>修改密码</a></li>
		</ul>
		<h2>
			用户管理
		</h2>
		<ul>
			<li><a href="selAllUser" target="right"><span></span>查询用户</a></li>		
		</ul>
		<h2>
			影片管理
		</h2>
		<ul>
			<li><a href="selAllFilmHot" target="right"><span></span>查询正在热映影片</a></li>
			<li><a href="pageSkipFilmHot" target="right"><span></span>新增正在热映影片</a></li>
			<li><a href="selAllFilmComing" target="right"><span></span>查询即将热映影片</a></li>
			<li><a href="pageSkipFilmComing" target="right"><span></span>新增即将热映影片</a></li>
		</ul>
		<h2>
			影院管理
		</h2>
		<ul>
			<li><a href="selAllCinema" target="right"><span></span>查询影院</a></li>
			<li><a href="queryAllCity" target="right"><span></span>新增影院</a></li>
		</ul>
		<h2>
			评论管理
		</h2>
		<ul>
			<li><a href="selAllComment" target="right"><span></span>查询评论</a></li>
		</ul>
		<h2>
			订单管理
		</h2>
		<ul>
			<li><a href="selAllOrder" target="right"><span></span>查询订单</a></li>		
		</ul>
		<h2>
			场厅管理
		</h2>
		<ul>
			<li><a href="selAllRoom" target="right"><span></span>查询场厅</a></li>
			<li><a href="pageSkipRoom" target="right"><span></span>新增场厅</a></li>
		</ul>
		<h2>
			影片类别管理
		</h2>
		<ul>
			<li><a href="selAllCategory" target="right"><span></span>查询类别</a></li>
			<li><a href="addCategory.jsp" target="right"><span></span>新增类别</a></li>
		</ul>
		<h2>
			城市管理
		</h2>
		<ul>
			<li><a href="selAllCity" target="right"><span></span>查询城市</a></li>
			<li><a href="addCity.jsp" target="right"><span></span>新增城市</a></li>
		</ul>
	</div>
	<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
	<div class="admin">
  <iframe scrolling="auto" frameborder="0" src="welcome.jsp" name="right" width="100%" height="100%"></iframe>
</div>
	
</body>
</html>
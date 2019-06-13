<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>
<%@include file="include/top.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>付款</title>
</head>
<body>
	<div align="center">
		<h3>您需要支付人民币<span>${price }</span>元，请扫码支付</h3>
		<img alt="" src="portal/img/pay.jpg" width="500px" height="600px">
	</div>
</body>
</html>
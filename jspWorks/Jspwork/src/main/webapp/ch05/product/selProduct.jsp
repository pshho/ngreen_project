<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<style>
	#container {
		width: 50%;
		margin: 30px auto;
		text-align: center;
	}
	
	#container form select {
		padding: 3px;
	}
</style>
</head>
<jsp:useBean id="product" class="product.Product"/>
<body>
	<div id="container">
		<h2>상품 선택 결과</h2>
		<hr>
		<p>선택한 상품은: ${ param.select }</p>
		<p>num1 + num2 = ${ product.num1 + product.num2 }</p>
	</div>
</body>
</html>
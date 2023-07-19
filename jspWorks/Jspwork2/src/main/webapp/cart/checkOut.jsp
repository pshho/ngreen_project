<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<div id="container">
		<h2>계산</h2>
		<p>
			선택한 상품 목록
		</p>
		<hr>
		<%
			// 장바구니 session 유지
			ArrayList<String> productList = (ArrayList)session.getAttribute("cartList");
			
			if (productList == null){
				out.println("상품이 없습니다.");
			}else{
				for (String product: productList)
					out.println(product + "<br>");
			}
		%>
	</div>
</body>
</html>
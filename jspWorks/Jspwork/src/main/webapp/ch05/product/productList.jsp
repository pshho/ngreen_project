<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<jsp:useBean id="product" class="products.Product"/>
<body>
	<div id="container">
		<h2>상품 목록</h2>
		<hr>
		<form action="selProduct.jsp" method="post">
			<select name="select">
				<c:forEach var="product" items="${ product.productList }">
					<option><c:out value="${ product }"></c:out></option>
				</c:forEach>
			
				<!-- 
					<option>참외</option>
					<option>수박</option>
				-->
			</select>
			<button type="submit">선택</button>
		</form>
	</div>
</body>
</html>
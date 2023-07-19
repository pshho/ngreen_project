<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<section class="container my-3">
		<h2>상품 목록 페이지</h2>
		<div>
			<c:forEach items="${ productList }" var="product">
				<img src="../resources/uploads/${ product.pproductImage }.png" alt="갤럭시">
				<p>${ product.pname }</p>
				<p>${ product.pdescription }</p>
				<p>${ product.punitPrice }</p>
				<p>${ product.pmanufacturer }</p>
				<p>${ product.pcondition }</p>
				<p>${ product.punitsInstock }</p>
			</c:forEach>
		</div>
	</section>
</body>
</html>
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
		<c:forEach items="${ productList }" var="product">
			<div class="card" style="width: 18rem;">
				<img src="../resources/uploads/${ product.pproductImage }.png" alt="갤럭시" class="card-img-top" style="height: 18rem;">
			  	<div class="card-body">
			    <h5 class="card-title">이름: ${ product.pname }</h5>
			    <p class="card-text">설명: ${ product.pdescription }</p>
			    <p class="card-text">가격: ${ product.punitPrice }</p>
			    <p class="card-text">제조사: ${ product.pmanufacturer }</p>
			    <p class="card-text">상태: ${ product.pcondition }</p>
			    <p class="card-text">재고: ${ product.punitsInstock }</p>
			  </div>
			</div>
		</c:forEach>
	</section>
</body>
</html>
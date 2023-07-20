<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 페이지</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container" style="box-sizing: border-box;">
		<h2 class="text-left my-4 bg-info bg-opacity-10 border border-info border-start rounded-start rounded-end" style="padding:8px;">상품 목록 페이지</h2>
		<div class="row shadow-lg p-3 mb-5 bg-body-tertiary rounded my-3 bg-dark-subtle text-emphasis-dark" align="center" style="padding-top: 8px;" >
			<c:forEach items="${productList}" var="product">
				<div class="col-4" id="product_list">
					<img alt="사진" src="../resource/upload/${product.productImage}"
						style="width: 100%; height: 400px;">
					<p>${product.pname}</p>
					<p>${product.description}</p>
					<p>${product.unitPrice}원</p>
					<p>
						<a href="/productInfo.do?productId=${product.productId}"
							class="btn btn-secondary">상세 정보 &raquo;</a>
					</p>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 편집</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3">
		<h2 class="text-left mx-4 my-4">상품 편집</h2>
		<div class="row mx-5" align="center">
			<c:forEach items="${productList}" var="product">
				<div class="col-4">
					<img alt="사진" src="../resource/upload/${product.productImage}"
						style="width: 100%; height: 400px">
					<p>${product.pname}</p>
					<p>${product.description}</p>
					<p>${product.unitPrice}원</p>
					<p>
					<!-- edit이 update면 수정 버튼 -->
					<c:if test="${edit eq 'update'}">
						<a href="/updateProductForm.do?productId=${product.productId}"
							class="btn btn-success">수정 &raquo;</a>
					</c:if>

					<!-- edit이 delete면 수정 버튼 -->
					<c:if test="${edit eq 'delete'}">
						<a href="/deleteProduct.do?productId=${product.productId}"
							class="btn btn-danger" onclick="return confirm('정말로 삭제하시겠습니까?')">삭제
							&raquo;</a>
					</c:if>
					</p>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
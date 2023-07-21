<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-4">
		<h3 class="text-center mx-4 my-4">주문 완료</h3>
		<h2 class="alert alert-danger text-center"><a href="/productList.do" class="btn btn-secondary">주문해 주셔서 감사합니다.</a></h2>
		<p>주문번호: ${ cartId }</p>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
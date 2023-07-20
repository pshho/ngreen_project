<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container my-3">
		<h2>
			<a href="productList.do">상품목록</a>
		</h2>

		<div class="card mb-3">
			<img src="../resource/img/bg_labtop.jpg" class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">게이밍 노트북</h5>
				<p class="card-text">시대를 앞서가는 최신 13세대 Intel® Core™ 프로세서</p>
				<p class="card-text">
					<small class="text-muted">Last updated 3 mins ago</small>
				</p>
			</div><!--card body-->
		</div><!--card mb3 -->
		
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
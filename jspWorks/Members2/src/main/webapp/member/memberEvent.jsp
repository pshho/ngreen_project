<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>행운의 추첨</title>
<link rel="stylesheet" href="../resources/css/style.css">
<script src="../resources/js/event.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>

	<c:if test="${ empty sessionId }">
		<script>
			alert("로그인을 해주세요");
			location.replace("/loginForm.do"); // 페이지 이동
		</script>
	</c:if>

	<div id="container">
		<section id="memberEvent">
			<article id="luckyCoupon">
				<h2>이벤트 추첨</h2>
				<button onclick="clk()">추첨</button>
				<p id="display"></p>
			</article>
		</section>
	</div>

	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
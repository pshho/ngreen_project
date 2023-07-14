<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 가입</title>
<link rel="stylesheet" href="../resources/css/style.css">
<script src="../resources/js/validation.js"></script>
<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>
<script src="../resources/js/check.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<!-- 다국어 Locale 설정 -->
	<fmt:setLocale value="${ param.Language }"/>
	<fmt:bundle basename="bundle.message">
	<div id="container">
		<section id="register">
			<!-- 다국어 메뉴 영역 -->
			<div class="Language">
				<a href="?Language=ko">한국어</a> | <a href="?Language=en">English</a>
			</div>
			<h2><fmt:message key="signup.title"/></h2>
			<form action="addMember.do" method="post" name="member">
				<fieldset>
					<ul>
						<li><label for="memberId"><fmt:message key="signup.id"/></label> <input type="text"
							name="memberId" id="memberId" placeholder='<fmt:message key="signup.idCheck"/>'></li>
						<li class="check"><p id="checked"></p>
							<button type="button" onclick="checkId()" id="check" value="N"><fmt:message key="signup.doubleCheck"/></button></li>
						<li><label for="passwd1"><fmt:message key="signup.password"/></label> <input type="password"
							name="passwd1" id="passwd1" placeholder='<fmt:message key="signup.pwCheck"/>' required></li>
						<li><label for="passwd2"><fmt:message key="signup.password2"/></label> <input
							type="password" name="passwd2" id="passwd2" required></li>
						<li><label for="name"><fmt:message key="signup.name"/></label> <input type="text"
							name="name" id="name" placeholder='<fmt:message key="signup.onlyKorean"/>' required></li>
						<li><label for="gender"><fmt:message key="signup.gender"/></label> <label class="la1"><input
								type="radio" name="gender" id="gender" value="남" checked><fmt:message key="signup.man"/></label>
							<label class="la1"><input type="radio" name="gender"
								id="gender" value="여"><fmt:message key="signup.woman"/></label></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="button" value="<fmt:message key="signup.register"/>" onclick="checkMember()"> <input
						type="reset" value="<fmt:message key="signup.cancel"/>">
				</div>
			</form>
		</section>
	</div>
	</fmt:bundle>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
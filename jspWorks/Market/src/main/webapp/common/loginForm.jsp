<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>로그인</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<!-- 다국어 Locale 설정 -->
	<fmt:setLocale value="${ param.Language }"/>
	<fmt:bundle basename="bundle.message">
	<div id="container">
		<section id="loginForm">
			<!-- 다국어 메뉴 영역 -->
			<div class="Language">
				<a href="?Language=ko">한국어</a> | <a href="?Language=en">English</a>
			</div>
			<h2><fmt:message key="login.title"/></h2>
			<form action="loginProcess.do" method="post">
				<fieldset>
					<ul>
						<li><label for="memberId"><fmt:message key="login.id"/></label> <input type="text"
							name="memberId" id="memberId"></li>
						<li><label for="passwd1"><fmt:message key="login.password"/></label> <input type="password"
							name="passwd1" id="passwd1"></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="submit" value='<fmt:message key="login.button"/>'>
				</div>
			</form>
		</section>
	</div>
	</fmt:bundle>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
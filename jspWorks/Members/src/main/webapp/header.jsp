<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./resources/css/style.css">
<link rel="stylesheet" href="./resources/css/responsive_web.css">
</head>
<body>
	<header>
		<nav>
			<ul id="headerMenu">
				<li><h2><a href="index.jsp">GangNam</a></h2></li>
				<li><a href="memberForm.do">회원가입</a></li>
				<c:choose>
					<c:when test="${ not empty sessionId }">
						<li><a href="memberView.do?memberId=${ sessionId }">마이 페이지</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="memberList.do">회원</a></li>
					</c:otherwise>
				</c:choose>
				<li>
					<a href="boardList.do">게시판</a>
					<ul id="subMenu">
						<li><a href="memberEvent.do">추첨</a></li>
					</ul>
				</li>
				<c:choose>
					<c:when test="${ empty sessionId }">
						<li><a href="loginForm.do">로그인</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="logout.do">${ sessionId }님 로그아웃</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
	</header>
</body>
</html>
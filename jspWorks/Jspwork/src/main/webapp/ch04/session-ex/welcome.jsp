<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h3><%= session.getAttribute("id") %>님 환영합니다.</h3>
	<h3><a href="session_out.jsp">로그아웃</a></h3>
</body>
</html>
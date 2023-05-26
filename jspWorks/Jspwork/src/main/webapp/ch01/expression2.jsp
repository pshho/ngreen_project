<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>짝수/홀수 판별 프로그램</title>
</head>
<body>
	<h2>짝수/홀수 판정 프로그램</h2>
	<%!int check = 10;%>
	<%
	if (check % 2 == 0) {
		out.println("결과는 짝수입니다.");
	} else {
		out.println("결과는 홀수입니다.");
	}
	%>
	<%-- <p>결과는 <%= %></p> --%>
</body>
</html>
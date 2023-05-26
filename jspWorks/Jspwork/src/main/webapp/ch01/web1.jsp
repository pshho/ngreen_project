<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- <%@ page %>는 지시어(디렉티브 태그)로 jsp파일의 
언어, 문서 유형, 인코딩 등의 정보를 서버에게 알림 - jsp 주석 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello~</title>
</head>
<body>
	<h1>처음 만드는 웹 페이지</h1>
	<%-- <h3>현재 날짜와 시간은 <%= LocalDateTime.now() %></h3> --%>
	<%
		// 날짜와 시간 형식 설정
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		String current_time = now.format(datetime);
	%>
	<h3>현재 날짜와 시간은 <%= current_time %></h3>
</body>
</html>
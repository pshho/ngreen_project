<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문과 표현문 태그 사용</title>
<%!
	// 변수나 함수 선언(정의)
	// ! - static 역할(값을 공유, 누적임)
	int count = 0;
%>
</head>
<body>
	<h2>방문해 주셔서 감사합니다.</h2>
	
	<!-- 전치 연산(선증가) -->
	<h3>Page Count is <%= ++count  %></h3>
</body>
</html>
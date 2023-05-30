<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 빈즈(Java Beans)</title>
</head>
<body>
	<!-- id는 객체와 같음(new한 것과 같음) -->
	<jsp:useBean id="calc" class="beans.CalcBean"></jsp:useBean>
	
	<%
		int num = calc.calculate(3);
		// out.println(num);
	%>
	
	<h1 style="width: 200px; margin: 0 auto;">결과: <%= num %></h1>
</body>
</html>
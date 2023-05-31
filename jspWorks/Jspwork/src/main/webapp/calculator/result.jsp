<%@page import="beans.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정수형 계산기</title>
<link rel="stylesheet" href="./css/calcStyle.css">
</head>
<body>
	<%
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		String op = request.getParameter("op");
		
		// Calculator 객체 생성
		Calculator calc = new Calculator();
		
		calc.setX(x);	// 첫번째 수 입력(저장)
		calc.setY(y);	// 두번째 수 입력(저장) 
		calc.setOp(op);	// 계산 방식 입력(저장)
		
		// 계산하는 함수 호출
		calc.Calculate();
	%>
	<div id="container">
		<h2>계산결과</h2>
		<hr>
		
		<input type="text" name="x" value="<%= x %>" readonly>
		<select name="op" disabled>
			<option value="+" <% if(op.equals("+")) {%> selected <%} %>>+</option>
			<option value="-" <% if(op.equals("-")) {%> selected <%} %>>-</option>
			<option value="x" <% if(op.equals("x")) {%> selected <%} %>>x</option>
			<option value="/" <% if(op.equals("/")) {%> selected <%} %>>/</option>
		</select>
		<input type="text" name="y" value="<%= y %>" readonly>
		
	</div>
	<div id="wrap">
		<p>결과: <%= calc.getResult() %></p>
	</div>
</body>
</html>

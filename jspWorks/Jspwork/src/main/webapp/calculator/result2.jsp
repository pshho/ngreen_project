<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="calc" class="beans.Calculator"></jsp:useBean>
<jsp:setProperty property="x" name="calc"/>
<jsp:setProperty property="y" name="calc"/>
<jsp:setProperty property="op" name="calc"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정수형 계산기</title>
<link rel="stylesheet" href="./css/calcStyle.css">
</head>
<body>
	<%
		String op = request.getParameter("op");	
	
		calc.Calculate();
	%>
	<div id="container">
		<h2>계산결과</h2>
		<hr>
		
		<input type="text" name="x" value="<jsp:getProperty property="x" name="calc"/>" readonly>
		<select name="op" disabled>
			<option value="+" <% if(op.equals("+")) {%> selected <%} %>>+</option>
			<option value="-" <% if(op.equals("-")) {%> selected <%} %>>-</option>
			<option value="x" <% if(op.equals("x")) {%> selected <%} %>>x</option>
			<option value="/" <% if(op.equals("/")) {%> selected <%} %>>/</option>
		</select>
		<input type="text" name="y" value="<jsp:getProperty property="y" name="calc"/>" readonly>
		
	</div>
	<div id="wrap">
		<p>결과: <jsp:getProperty property="result" name="calc"/></p>
	</div>
</body>
</html>

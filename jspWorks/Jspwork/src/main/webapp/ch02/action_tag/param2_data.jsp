<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param 태그</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
	%>
	<p>아이디: <%= URLDecoder.decode(id) %></p>
	<p>비밀번호: <%= request.getParameter("pwd") %></p>
</body>
</html>
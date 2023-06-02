<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");	
	
		String id = request.getParameter("userid");
		String pd = request.getParameter("passwd");
	%>

	<h1 style="width: 50%; margin: 20px auto;">
		<span style="color: red">"<%= id %>"</span>님
		 <span style="color: red">"<%= pd %>"</span> 
		 비밀번호로 로그인 되었습니다.
	</h1>
	<h2 style="width: 50%; margin: 20px auto;">환영합니다.</h2>
</body>
</html>
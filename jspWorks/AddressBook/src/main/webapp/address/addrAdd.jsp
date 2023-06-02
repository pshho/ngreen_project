<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>

<title>주소 추가</title>

<link rel="stylesheet" href="../resources/css/style.css">

<jsp:useBean id="aB" class="address.AddrBook"></jsp:useBean>
<jsp:setProperty property="username" name="aB"/>
<jsp:setProperty property="tel" name="aB"/>
<jsp:setProperty property="email" name="aB"/>
<jsp:setProperty property="gender" name="aB"/>
<jsp:useBean id="abDAO" class="address.AddrBookDAO" scope="application"></jsp:useBean>

<%
	// ArrayList에 aB에 객체 삽입(추가)
	abDAO.add(aB);
%>

<div id="container">
	<h1>등록 내용</h1>
	<hr>
	
	<div id="wrap">
		<p>이름: <%= aB.getUsername() %></p>
		<p>전화번호: <%= aB.getTel().substring(0, 3) + "-" 
					+ aB.getTel().substring(3, 7) + "-" + aB.getTel().substring(7, 11) %></p>
		<p>이메일: <%= aB.getEmail() %></p>
		<p>성별: <%= aB.getGender() %></p>
	</div>
	
	<hr>
	<div id="wrap2">
		<a href="addrList.jsp">목록 보기</a>
	</div>
</div>

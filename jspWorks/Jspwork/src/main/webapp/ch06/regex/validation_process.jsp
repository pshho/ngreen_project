<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
%>

<p>아이디: <%= request.getParameter("id") %></p>
<p>비밀번호: <%= request.getParameter("pw") %></p>
<p>이름: <%= request.getParameter("name") %></p>
<p>전화번호: <%= request.getParameter("phone") %>-<%= 
			request.getParameter("phone1") %>-<%=
			request.getParameter("phone2") %></p>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int timeOut = session.getMaxInactiveInterval();
	
	session.setMaxInactiveInterval(60);

	out.println("<p>세션 유효 시간: " + (timeOut / 60) + "분");
%>
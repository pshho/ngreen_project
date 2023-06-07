<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="gugudan" class="gugudan.GuguBean"/>

<h3>구구단 출력</h3>

<%
	int dan = Integer.parseInt(request.getParameter("dan"));

	// 자바 클래스의 method 호출(times() 호출)
	int[] result = gugudan.times(dan);
	
	for(int i=0; i<19; i++) {
		out.print(dan + " X " + (i + 1) + " = " + result[i] + "<br>");
	}
	
%>
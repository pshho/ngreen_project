<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 아이디와 비밀번호를 받아와서 인증 처리 및 세션 발급
	String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");
	
	if(id.equals("admin") && pw.equals("admin1234")) {
		// session 발급 후 welcome.jsp(forwarding)
		session.setAttribute("id", id);	// session 이름, session 값
		session.setAttribute("pw", pw);
		
		response.sendRedirect("welcome.jsp");
	}else {
		out.println("아이디와 비밀번호를 확인해주세요.");
	}
%>
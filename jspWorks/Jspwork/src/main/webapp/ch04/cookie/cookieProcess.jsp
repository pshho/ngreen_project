<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 아이디와 비밀번호를 받아서 쿠키 생성
	String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");
	
	if((id != null && id.equals("admin")) && (pw != null && pw.equals("0000"))) {
		// Cookie(쿠키 이름, 쿠키 값) 객체 생성
		Cookie cookieId = new Cookie("userId", id);
		Cookie cookiePw = new Cookie("passWd", pw);
		
		// 쿠키 생성 후 client에게 보냄
		response.addCookie(cookieId);
		response.addCookie(cookiePw);
		
		out.println("쿠키 생성이 완료되었습니다.");
		
	}else {
		out.println("쿠키 생성이 실패했습니다.");
	}
%>
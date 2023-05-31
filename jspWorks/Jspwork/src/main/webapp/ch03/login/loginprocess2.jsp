<%@ page import="beans.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	// form 데이터 가져오기
	String id = request.getParameter("userid");
	String pd = request.getParameter("passwd");
	LoginBean login = new LoginBean();
	login.setUserid(id);
	login.setPasswd(pd);
	boolean result = login.checkUser();
	
	if(result) {
		out.println(login.getUserid() + "님 환영합니다.");
	}else {
		out.println("아이디나 비밀번호를 확인해주세요.");
	}
%>
<p>아이디: <%= login.getUserid() %> </p>
<p>비밀번호: <%= login.getPasswd() %> </p>

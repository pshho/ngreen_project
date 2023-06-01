<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("userid");
	String userPw = request.getParameter("passwd");
	String form = request.getMethod();
	String id = (String) session.getAttribute("userid");
	
	if(form.equals("POST")) {
		if(userId.equals("today") && userPw.equals("0000")) {
			session.setAttribute("userid", userId);
			session.setAttribute("passwd", userPw);
			
			// out.println("로그인에 성공하셨습니다.");
		}else {
			out.println("<script>");
			out.println("alert('아이디와 비밀번호를 확인해주세요.')");
			out.println("history.go(-1)");
			out.println("</script>");
		}
	}
%>
<!-- 세션 이름 가져오기 -->
<p>
	<% if(id != null && id.equals("today")) { %>
	<%= session.getAttribute("userid") + "님이 로그인 하셨습니다." %>
	<% } %>
</p>	
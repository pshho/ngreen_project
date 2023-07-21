<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>관리자 로그인</title>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<!-- 다국어 Locale 설정 -->
	<fmt:setLocale value="${ param.Language }"/>
	<fmt:bundle basename="bundle.message">
		<div class="container my-3">
			<section id="adminLogin">
				<!-- 다국어 메뉴 영역 -->
				<div class="Language">
					<a href="?Language=ko">한국어</a> | <a href="?Language=en">English</a>
				</div>
				<h2><fmt:message key="login.title"/></h2>
				<form action="j_security_check" method="post">
				
					<%
						String error = request.getParameter("error");
		
						if (error != null) {
							out.println("<div class='alert alert-danger'>");
							out.println("아이디와 비밀번호를 확인해 주세요.");
							out.println("</div>");
						}
					%>
	
					<div class="form-group">
						<label for="j_username"><fmt:message key="login.id"/></label> <input type="text"
								name="j_username" id="j_username" class="form-control" required>
					</div>
					<div class="form-group">
						<label for="j_password"><fmt:message key="login.password"/></label> <input type="password"
								name="j_password" id="j_password" class="form-control" required>
					</div>
					<button type="submit" class="text-right btn btn-warning"><fmt:message key="login.button"/></button>
				</form>
			</section>
		</div>
	</fmt:bundle>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
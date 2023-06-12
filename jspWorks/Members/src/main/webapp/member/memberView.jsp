<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="memberView">
			<h2>회원 정보</h2>
			<ul>
				<li>아이디: <input type="text" value="${ member.memberId }" readonly></li>
				<li>비밀번호: <input type="text" value="${ member.passwd }" readonly></li>
				<li>이름: <input type="text" value="${ member.name }" readonly></li>
				<li>
					성별: 
					<c:if test="${ member.gender eq '남' }">
						<label><input type="radio" value="남" checked disabled>남</label>
						<label><input type="radio" value="여">여</label>
					</c:if>
					<c:if test="${ member.gender eq '여' }">
						<label><input type="radio" value="남">남</label>
						<label><input type="radio" value="여" checked disabled>여</label>
					</c:if>
				</li>
				<li>생성날짜: <input type="text" value="<fmt:formatDate value='${ member.joinDate }' type='both'/>" readonly></li>
				<c:if test="${ sessionId == member.memberId }">
					<li id="btn">
						<a href="/memberUpdate.do?memberId=${ member.memberId }">
							<input type="button" value="수정">
						</a>
						<a href="/memberDelete.do?memberId=${ member.memberId }">
							<input type="button" value="삭제">
						</a>
					</li>
				</c:if>
			</ul>
			
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
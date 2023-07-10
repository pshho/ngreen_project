<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 가입</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="update">
			<h2>회원 수정</h2>
			<form action="updMember.do" method="post">
				<fieldset>
					<ul>
						<li><label for="memberId">아이디</label> <input type="text"
							name="memberId" id="memberId" value="${ member.memberId }"
							readonly></li>
						<li><label for="passwd1">비밀번호</label> <input type="password"
							name="passwd1" id="passwd1" value="${ member.passwd }"></li>
						<li><label for="passwd2">비밀번호 확인</label> <input
							type="password" name="passwd2" id="passwd2"
							value="${ member.passwd }"></li>
						<li><label for="name">이름</label> <input type="text"
							name="name" id="name" value="${ member.name }"></li>
						<li><label for="gender">성별</label> <c:if
								test="${ member.gender eq '남' }">
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="남" checked>남</label>
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="여">여</label>
							</c:if> <c:if test="${ member.gender eq '여' }">
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="남">남</label>
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="여" checked>여</label>
							</c:if></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="submit" value="저장"> <a
						href="/memberView.do?memberId=${ member.memberId }"> <input
						type="button" value="취소">
					</a>
				</div>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
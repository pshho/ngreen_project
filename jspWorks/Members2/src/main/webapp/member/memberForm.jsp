<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 가입</title>
<link rel="stylesheet" href="../resources/css/style.css">
<script src="../resources/js/validation.js"></script>
<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>
<script src="../resources/js/check.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="register">
			<h2>회원 가입</h2>
			<form action="addMember.do" method="post" name="member">
				<fieldset>
					<ul>
						<li><label for="memberId">아이디</label> <input type="text"
							name="memberId" id="memberId" placeholder="4~15 영어 대, 소문자"></li>
						<li class="check"><p id="checked"></p>
							<button type="button" onclick="checkId()" id="check" value="N">중복체크</button></li>
						<li><label for="passwd1">비밀번호</label> <input type="password"
							name="passwd1" id="passwd1" placeholder="8자 이상, 대, 소, 특수문자, 숫자"></li>
						<li><label for="passwd2">비밀번호 확인</label> <input
							type="password" name="passwd2" id="passwd2"></li>
						<li><label for="name">이름</label> <input type="text"
							name="name" id="name" placeholder="한글만" required></li>
						<li><label for="gender">성별</label> <label class="la1"><input
								type="radio" name="gender" id="gender" value="남" checked>남</label>
							<label class="la1"><input type="radio" name="gender"
								id="gender" value="여">여</label></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="button" value="등록" onclick="checkMember()"> <input
						type="reset" value="취소">
				</div>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
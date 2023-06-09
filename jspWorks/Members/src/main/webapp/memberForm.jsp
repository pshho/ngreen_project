<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<div id="container">
		<section id="register">
			<h2>회원 가입</h2>
			<form action="addMember.do" method="post">
				<fieldset>
					<ul>
						<li>
							<label for="memberId">아이디</label>
							<input type="text" name="memberId" id="memberId">
						</li>
						<li>
							<label for="passwd1">비밀번호</label>
							<input type="password" name="passwd1" id="passwd1">
						</li>
						<li>
							<label for="passwd2">비밀번호 확인</label>
							<input type="password" name="passwd2" id="passwd2">
						</li>
						<li>
							<label for="name">이름</label>
							<input type="text" name="name" id="name">
						</li>
						<li>
							<label for="gender">성별</label>
							<label class="la1"><input type="radio" name="gender" id="gender">남</label>
							<label class="la1"><input type="radio" name="gender" id="gender">여</label>
						</li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="submit" value="등록">
					<input type="reset" value="취소">
				</div>
			</form>
		</section>
	</div>
</body>
</html>
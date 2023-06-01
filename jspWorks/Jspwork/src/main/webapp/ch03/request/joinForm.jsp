<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="joinProcess.jsp" method="post">
		<p>
			<label for="userid">아이디</label>
			<input type="text" id="userid" name="userid">
		</p>
		<p>
			<label for="passwd">비밀번호</label>
			<input type="password" id="passwd" name="passwd">
		</p>
		<p>
			<label for="uname">이름</label>
			<input type="text" id="uname" name="uname">
		</p>
		<p>
			<label for="phone">연락처</label>
			<input type="text" id="phone1" name="phone1" maxlength=3 size=3>
			- <input type="text" id="phone2" name="phone2" maxlength=4 size=4>
			- <input type="text" id="phone3" name="phone3" maxlength=4 size=4>
		</p>
		<p>
			<label for="gender">
				성별
				<input type="radio" id="gender" name="gender" value="남성" checked>남성
				<input type="radio" id="gender" name="gender" value="여성">여성
			</label>
		</p>
		<p>
			<label for="hobby">
				취미
				<input type="checkbox" id="hobby1" name="hobby" value="독서">독서
				<input type="checkbox" id="hobby2" name="hobby" value="운동">운동
				<input type="checkbox" id="hobby3" name="hobby" value="영화">영화
			</label>
		</p>
		<p>자기 소개</p>
		<p>
			<textarea rows="4" cols="40" name="comment"></textarea>
		</p>
		<p>
			<input type="submit" value="가입하기">
			<input type="reset" value="다시쓰기">
		</p>
	</form>
</body>
</html>
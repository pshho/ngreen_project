<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정규 표현식 예제</title>
<script>
	function checkMember() {
		// 1. 아이디나 비밀번호가 비어 있을 때 처리
		// 2. 비밀번호에 동일한 아이디가 포함되어 있을 때
		// "비밀번호는 아이디를 포함할 수 없습니다."
		
		let form = document.member;
		let id = form.id;
		let pw = form.pw;
		let nm = form.name;
		
		const regEx = /^[a-zA-Z가-힣]/;
		
		if(id.value == "") {
			id.focus();
			alert('아이디를 입력해주세요.');
			return false;
		}else if(pw.value == "") {
			pw.focus();
			alert('비밀번호를 입력해주세요.');
			return false;
		}else if(pw.value.search(id.value) > -1) {
			alert('비밀번호는 아이디를 포함할 수 없습니다.')
			pw.select();
			return false;
		}else if(!regEx.test(nm.value)) {
			alert('이름은 숫자로 시작할 수 없습니다.');
			nm.select();
			return false;
		}
		else {
			form.submit();
		}
	}
</script>
</head>
<body>
	<h3>회원 가입</h3>
	<form action="test_process.jsp" method="post" name="member">
		<p>아이디: <input type="text" name="id"></p>
		<p>비밀번호: <input type="password" name="pw"></p>
		<p>이름: <input type="text" name="name"></p>
		<button type="button" onclick="checkMember()">가입</button>
	</form>
</body>
</html>
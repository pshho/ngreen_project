<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script>
	function checkMember() {
		let form = document.member;
		let id = form.id.value;
		let pw = form.pw.value;
		let nm = form.name.value;
		let ph = form.phone.value + "-" + 
				 form.phone1.value + "-" +
				 form.phone2.value;
				 
		const regExpId = /^[a-zA-Z가-힣]/;	// 아이디 - 문자 시작
		const regExpPw = /^[0-9]+$/;		// 비밀번호 - 숫자만
		const regExpNm = /^[가-힣]+$/;		// 이름 - 한글만
		const regExpPh = /\d{2,3}-\d{3,4}-\d{4}/;
		
		if(!regExpId.test(id)) {
			alert("아이디는 문자로 시작해주세오.");
			id.select();
			return
		}else if(pw == "" || !regExpPw.test(pw)) {
			alert("비밀번호는 숫자로만 입력해주세요.")
			pw.select();
			return
		}else if(nm == "" || !regExpNm.test(nm)) {
			alert("이름은 한글로만 입력해주세요.")
			name.select();
			return
		}else if(nm == "" || !regExpNm.test(nm)) {
			alert("이름은 한글로만 입력해주세요.")
			name.select();
			return
		}else if(ph == "" || !regExpPh.test(ph)) {
			alert("연락처를 확인해주세요."')
			form.phone1.select();
			return
		}
		
		form.submit();
	}
</script>
</head>
<body>
	<h3>회원가입</h3>
	<form action="validation_process.jsp" method="post" name="member">
		<p>
			<label for="id">아이디</label>
			<input type="text" id="id" name="id">
		</p>
		<p>
			<label for="pw">비밀번호</label>
			<input type="password" id="pw" name="pw">
		</p>
		<p>
			<label for="name">이름</label>
			<input type="text" id="name" name="name">
		</p>
		<p>
			<label>연락처</label>
			<select name="phone">
				<option>010</option>
				<option>02</option>
				<option>031</option>
				<option>041</option>
			</select>
			- <input type="text" name="phone1" maxlength="4" size="4">
			- <input type="text" name="phone2" maxlength="4" size="4">
		</p>
		<p>
			<input type="button" value="가입하기" onclick="checkMember()">
			<input type="reset" value="다시쓰기">
		</p>
	</form>
</body>
</html>
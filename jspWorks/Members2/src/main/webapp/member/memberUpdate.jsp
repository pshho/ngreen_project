<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>정보 수정</title>
<link rel="stylesheet" href="../resources/css/style.css">
<script type="text/javascript">
	function checkMember() {
		let form = document.member;
		let pw1 = form.passwd1.value;
		let pw2 = form.passwd2.value;
		let nm = form.name.value;
		// let cch = form.cch.value;
	
		// 정규 표현식
		const pat1 = /\s/g;
		const pw_pat1 = /\d+/g;
		const pw_pat2 = /[a-zA-Z]+/g;
		const pw_pat3 = /[~!@#$%^&*()_+]+/g;
		const nm_pat1 = /^[가-힣]+$/g;						// 한글만
	
		if (pat1.test(id) || pat1.test(pw1)
			|| pat1.test(pw2) || pat1.test(nm)) {
			alert('공백은 입력하실 수 없습니다.')
			return
		}
	
		if (!pw_pat1.test(pw1) || !pw_pat2.test(pw1) ||
			!pw_pat3.test(pw1)) {
			alert('비밀번호는 알파벳 대, 소문자, 숫자, 특수문자의 조합으로 해야 합니다.');
			pw1.select();
			return
		} else if (pw1 == "" || pw2 == "") {
			alert('비밀번호를 입력해주세요.');
			pw1.focus();
			return
		} else if (pw1 != pw2) {
			alert('비밀번호가 일치하지 않습니다.')
			pw2.select();
			return
		} else if (pw1.length < 8) {
			alert('비밀번호는 8자보다 커야 합니다.');
			pw1.select();
			return
		}
	
		if (!nm_pat1.test(nm)) {
			alert('이름은 한글만 가능합니다.');
			nm.select();
			return
		}
	
		form.submit();
	
	}
</script>
<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<!-- 다국어 Locale 설정 -->
	<fmt:setLocale value="${ param.Language }"/>
	<fmt:bundle basename="bundle.message">
	<div id="container">
		<section id="update">
			<!-- 다국어 메뉴 영역 -->
			<div class="Language">
				<a href="?memberId=${ member.memberId }&Language=ko">한국어</a> | <a href="?memberId=${ member.memberId }&Language=en">English</a>
			</div>
			<h2><fmt:message key="signup.modifytitle"/></h2>
			<form action="updMember.do" method="post" name="member">
				<fieldset>
					<ul>
						<li><label for="memberId"><fmt:message key="signup.id"/></label> <input type="text"
							name="memberId" id="memberId" value="${ member.memberId }"
							readonly></li>
						<li><label for="passwd1"><fmt:message key="signup.password"/></label> <input type="password"
							name="passwd1" id="passwd1" value="${ member.passwd }"></li>
						<li><label for="passwd2"><fmt:message key="signup.password2"/></label> <input
							type="password" name="passwd2" id="passwd2"
							value="${ member.passwd }"></li>
						<li><label for="name"><fmt:message key="signup.name"/></label> <input type="text"
							name="name" id="name" value="${ member.name }"></li>
						<li><label for="gender"><fmt:message key="signup.gender"/></label> <c:if
								test="${ member.gender eq '남' }">
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="남" checked><fmt:message key="signup.man"/></label>
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="여"><fmt:message key="signup.woman"/></label>
							</c:if> <c:if test="${ member.gender eq '여' }">
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="남"><fmt:message key="signup.man"/></label>
								<label class="la1"><input type="radio" name="gender"
									id="gender" value="여" checked><fmt:message key="signup.woman"/></label>
							</c:if></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="button" value="<fmt:message key="signup.save"/>" onclick="checkMember()"> <a
						href="/memberView.do?memberId=${ member.memberId }"> <input
						type="reset" value="<fmt:message key="signup.cancel"/>">
					</a>
				</div>
			</form>
		</section>
	</div>
	</fmt:bundle>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
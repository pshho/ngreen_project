/**
 * 
 */
function checkMember() {
	let form = document.member;
	let id = form.memberId.value;
	let pw1 = form.passwd1.value;
	let pw2 = form.passwd2.value;
	let nm = form.name.value;
	let cch = form.cch.value;
	
	// 정규 표현식
	const id_pat = /^[a-zA-Z]+/;						// 영어로 시작
	const pw_pat1 = /\d+/g;
	const pw_pat2 = /[a-zA-Z]+/g;
	const pw_pat3 = /[~!@#$%^&*()_+]+/g;
	const nm_pat1 = /^[가-힣]+$/g;						// 한글만
	
	if(!id_pat.test(id)) {
		alert('아이디는 알파벳 대, 소문자로 시작해야 합니다.');
		id.select();
		return
	}else if(id.length > 15 || id.length < 4) {
		alert('아이디는 4~15자 사이로 해야 합니다.');
		id.select();
		return
	}
	
	if(!pw_pat1.test(pw1) || !pw_pat2.test(pw1) || 
	!pw_pat3.test(pw1)) {
		alert('비밀번호는 알파벳 대, 소문자, 숫자, 특수문자의 조합으로 해야 합니다.');
		pw1.select();
		return
	}else if(pw1 == "" || pw2 == "") {
		alert('비밀번호를 입력해주세요.');
		pw1.focus();
		return
	}else if(pw1 != pw2) {
		alert('비밀번호가 일치하지 않습니다.')
		pw2.select();
		return
	}else if(pw1.length < 8) {
		alert('비밀번호는 8자보다 커야 합니다.');
		pw1.select();
		return
	}
	
	if(!nm_pat1.test(nm)) {
		alert('이름은 한글만 가능합니다.');
		nm.select();
		return
	}
	
	if(cch == "") {
		alert('중복체크 해주세요.');
		return
	}
	
	form.submit();
	
}




/**
 * 
 */
function checkAddProduct() {
	let form = document.adPro;
	let id = document.getElementById("productId");
	let name = document.getElementById("pname");
	let price = document.getElementById("unitPrice");
	let stock = document.getElementById("unitsInStock");
	
	// 상품 아이디 - 예) "P1234" P와 숫자를 조합하여 5~12자 입력
	// 상품명 - 5~20자
	let regId = /^P[0-9]{4,11}$/;
	
	if (!regId.test(id.value.trim())){
		alert("[상품코드] P와 숫자를 조합하여 5~12자");
		id.focus();
		id.select();
		return false;
	} else if (name.value.length < 5 || name.value.length > 20) {
		alert("[상품명] 최소 5~20자");
		name.focus();
		name.select();
		return false;
	} else if (price.value < 0) {
		alert("[상품명] 숫자는 1원 이상만 가능합니다.");
		price.focus();
		price.select();
		return false;
	} else if (stock.value < 0) {
		alert("[상품명] 숫자는 1개 이상만 가능합니다.");
		stock.focus();
		stock.select();
		return false;
	} else {
		form.submit();
	}
}

function checkOrder() {
	alert("상품을 추가해주세요.");
}

function checkMember() {
	let form = document.member;
	let id = document.getElementById("mid");
	let pw1 = document.getElementById("passwd1");
	let pw2 = document.getElementById("passwd2");
	let nm = document.getElementById("mname");
	// let cch = form.cch.value;
	let check = form.btnChk.value;

	// 정규 표현식
	const pat1 = /\s/g;
	const id_pat = /^[a-zA-Z]+/;						// 영어로 시작
	const pw_pat1 = /\d+/g;
	const pw_pat2 = /[a-zA-Z]+/g;
	const pw_pat3 = /[~!@#$%^&*()_+]+/g;
	const nm_pat1 = /^[가-힣]+$/g;						// 한글만
	
	if (check == "N") {
		alert('중복체크 해주세요.');
		return false;
	} else if (pat1.test(id.value.trim()) || pat1.test(pw1.value.trim())
		|| pat1.test(pw2.value.trim()) || pat1.test(nm.value.trim())) {
		alert('공백은 입력하실 수 없습니다.');
		id.focus();
		id.select();
		return false;
	} else if (!id_pat.test(id.value.trim())) {
		alert('아이디는 알파벳 대, 소문자로 시작해야 합니다.');
		id.focus();
		id.select();
		return false;
	} else if (id.value.length > 15 || id.value.length < 4) {
		alert('아이디는 4~15자 사이로 해야 합니다.');
		id.focus();
		id.select();
		return false;
	} else if (!pw_pat1.test(pw1.value.trim()) || !pw_pat2.test(pw1.value.trim()) ||
		!pw_pat3.test(pw1.value.trim())) {
		alert('비밀번호는 알파벳 대, 소문자, 숫자, 특수문자의 조합으로 해야 합니다.');
		pw1.focus();
		pw1.select();
		return false;
	} else if (pw1 == "" || pw2 == "") {
		alert('비밀번호를 입력해주세요.');
		pw1.focus();
		pw1.select();
		return false;
	} else if (pw1 != pw2) {
		alert('비밀번호가 일치하지 않습니다.');
		pw2.focus();
		pw2.select();
		return false;
	} else if (pw1.length < 8) {
		alert('비밀번호는 8자보다 커야 합니다.');
		pw1.focus();
		pw1.select();
		return false;
	} else if (!nm_pat1.test(nm.value.trim())) {
		alert('이름은 한글만 가능합니다.');
		nm.focus();
		nm.select();
		return false;
	} else {
		form.submit();		
	}
}
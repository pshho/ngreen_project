/**
 * 
 */
function signUp() {
	let form = document.form1;
	let name = form.name.value;
	let email = form.email.value;
	
	confirm("정말로 가입하시겠습니까?")
	
	// 회원 가입 form 숨기기
	document.getElementById("regForm").style.display = "none";
	document.querySelector("#rname").innerHTML = name;
	document.querySelector("#remail").innerHTML = email;
	
	// 가입 정보 스타일
	document.getElementById("result").setAttribute('style', 
			"display: block; background: lightgreen; padding: 5px 20px;");
	
}
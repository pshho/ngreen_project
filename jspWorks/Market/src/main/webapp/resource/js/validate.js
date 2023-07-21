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
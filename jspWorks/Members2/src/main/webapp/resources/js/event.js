function clk() {
	let name = ['이진성', '노승우', '박성호', '권지혜', '이경철', '성의석', '이유진', '유성길', '한주훈',
		'강정현', '김현우', '이영준', '김민정', '유세현', '윤기은', '오화룡', '조은별', '안재훈'];
	let pickNumber = 5;
	let success = new Array(pickNumber);
	let result = "";

	for (let i = 0; i < success.length; i++) {
		let pick = Math.floor(Math.random() * name.length);
		success[i] = name[pick];

		for (let j = 0; j < i; j++) {
			if (success[j] == success[i]) {
				i--;
			}
		}
	}

	for (let i = 0; i < success.length; i++) {
		if (i == success.length - 1) {
			result += document.getElementById("display").innerHTML = success[i] + "";
		} else {
			result += document.getElementById("display").innerHTML = success[i] + ", ";
		}
	}

	result += document.getElementById("display").innerHTML = "<br><br>당첨을 축하드립니다!!"

	let display = document.getElementById("display");
	display.innerHTML = result;
}
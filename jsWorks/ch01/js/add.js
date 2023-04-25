/* let n1 = parseInt(prompt("첫 번째 수 입력", "1~50"));
let n2 = parseInt(prompt("두 번째 수 입력", "1~50")); */
let n1 = prompt("첫 번째 수 입력: ");
let n2 = prompt("두 번째 수 입력: ");
let sum_v;

sum_v = parseFloat(n1) + parseFloat(n2);

// 객체.toFixed() 소수점 자리수 설정 함수
document.write("두 수의 합: " + sum_v.toFixed(8));
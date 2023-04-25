// 변수의 값을 교환하기
let x = 0, y = 1;
let temp;

document.write("---교환전---<br>");
document.write("x=" + x + ", y=" + y);

// 교환 처리
temp = x; // temp = 0
x = y; // x = 1
y = temp; // y = 0

document.write("<br>==========<br>");
document.write("---교환후---<br>");
document.write("x=" + x + ", y=" + y);

// 재교환 처리
temp = y, y = x, x = temp;

document.write("<br>==========<br>");
document.write("---재교환후---<br>");
document.write("x=" + x + ", y=" + y);

//재재교환 처리
temp = x, x = y, y = temp;

document.write("<br>==========<br>");
document.write("---재재교환후---<br>");
document.write("x=" + x + ", y=" + y);
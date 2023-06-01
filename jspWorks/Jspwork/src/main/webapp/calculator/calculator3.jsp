<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정수형 계산기</title>
<link rel="stylesheet" href="./css/calcStyle.css">
</head>
<body>
	<div id="container">
		<h2>계산기</h2>
		<hr>
		<form action="/calculator/calc" method="post">
			<input type="text" name="x">
			<select name="op">
				<option value="+">+</option>
				<option value="-">-</option>
				<option value="x">x</option>
				<option value="/">/</option>
			</select>
			<input type="text" name="y">
			<button type="submit">계산</button>
			<button type="reset">다시 입력</button>
		</form>
	</div>
</body>
</html>
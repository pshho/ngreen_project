<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체크박스 선택</title>
</head>
<body>
	<form action="process2.jsp" method="get">
		<p>
			<label>오렌지<input type="checkbox" name="fruits" value="오렌지"></label>
			<label>사과<input type="checkbox" name="fruits" value="사과"></label>
			<label>바나나<input type="checkbox" name="fruits" value="바나나"></label>
			<input type="submit" value="전송">
		</p>
	</form>
</body>
</html>
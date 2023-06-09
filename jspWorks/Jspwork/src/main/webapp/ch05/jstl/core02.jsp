<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리</title>
</head>
<body>
	<h3>점수를 입력해 주세요</h3>
	<form action="scoreTest.jsp" method="get" name="form1">
		<p>
			점수: <input type="text" name="score" id="inp"> <input type="button"
				value="학점출력" onclick="checkScore()">
		</p>
	</form>
	
	<script>
		function checkScore() {
			let form = document.form1;
			let val = form.score
			let va = val.value.trim();
			
			if(va == "" || isNaN(va)) {
				alert("숫자를 입력해주세요.");
				val.focus();
				return false;
			}else if(va > 100 || va < 0) {
				alert("숫자의 범위는 1~100점입니다.");
				val.select();
				return false;
			}else {
				form.submit();
			}
		}
		
		document.getElementById("inp").addEventListener("keydown", function(event) {
			if(event.key == "Enter") {
				checkScore();
				event.preventDefault();
			}
		});
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 입력Form</title>
<script type="text/javascript">
	function guguCheck() {
		let form = document.form1;
		let dan = form.dan;

		if (dan.value == "" || isNaN(dan.value)) { // Nan = Not a number
			alert("숫자를 입력해주세요.");
			dan.focus();

			return false;
		}else if(dan.value < 1 || dan.value > 20) {
			alert("1 ~ 19단까지 입력 가능합니다.")
			dan.focus();
			
			return false;
		}else {
			form.submit();
		}
	}
</script>
</head>
<body>
	<form action="guguPrint.jsp" method="get" name="form1">
		<p>
			<label for="dan">단</label> <input type="text" name="dan" id="dan">
		</p>
		<p>
			<button type="button" onclick="guguCheck()">확인</button>
		</p>
	</form>
</body>
</html>
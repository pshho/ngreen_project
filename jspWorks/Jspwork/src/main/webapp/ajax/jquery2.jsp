<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jquery 예제</title>
<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('button').click(function() {
			let cIn = $('#t_input').val();	// 입력된 값
			$('#t_output').val(cIn);		// 출력할 값
			
		});
	});
	
</script>
</head>
<body>
	<input type="text" id="t_input">
	<button type="button">입력</button>
	<p>결과 <input type="text" id="t_output"></p>
</body>
</html>
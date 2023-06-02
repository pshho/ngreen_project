<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style>
	#container{
		width: 90%;
		margin: 10px auto;
	}
	
	h2 {
		width: 80%;
		margin: 0 auto;
		background: yellowgreen;
		text-align: center;
		padding: 10px 0;
		color: #eee;
		border-radius: 5px;
	}
	
	#regForm {
		width: 50%;
		margin: 0 auto;
		background: lightgreen;
		padding: 15px 20px;
		border-radius: 10px;
	}
	
	#regForm form div {
		display: flex;
		flex-wrap: wrap;
		justify-content: space-around;
	}
	
	#regForm form p {
		text-align: center;
	}
	
	#result {
		width: 50%;
		margin: 0 auto;
		border-radius: 10px;
	}
</style>
<script type="text/javascript" src="../../resources/js/signUp.js"></script>
</head>
<body>
	<div id="container">
		<h2>회원 가입</h2>
		<hr>
		
		<div id="regForm">
			<form action="" method="post" name="form1">
				<div>
					<label>이름</label>
					<input type="text" name="name" size="40">
				</div>
				
				<hr>
				
				<div>
					<label>이메일</label>
					<input type="email" name="email" size="40">
				</div>
				
				<p>
					<button type="button" onclick="signUp()">가입</button>
				</p>
			</form>
		</div>
		
		<div id="result">
			<h3>가입 정보</h3>
			<hr>
			<p>이름: <span id="rname"></span></p>
			<p>이메일: <span id="remail"></span></p>
		</div>
		<script>
			document.querySelector("#result").style.display = "none";
		</script>
	</div>
</body>
</html>
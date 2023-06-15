<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>로그인</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="loginForm">
			<h2>로그인</h2>
			<form action="loginProcess.do" method="post">
				<fieldset>
					<ul>
						<li><label for="memberId">아이디</label> <input type="text"
							name="memberId" id="memberId"></li>
						<li><label for="passwd1">비밀번호</label> <input type="password"
							name="passwd1" id="passwd1"></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="submit" value="로그인">
				</div>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
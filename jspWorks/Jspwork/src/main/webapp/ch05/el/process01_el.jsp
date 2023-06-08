<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<style>
#container {
	width: 80%;
	margin: 30px auto;
	text-align: center;
}

#container table {
	width: 60%;
	margin: 20px auto;
}

#container table, table thead th, table tbody td {
	border: 1px solid #ccc;
	border-collapse: collapse;
	padding: 10px 20px;
}

#container table thead th {
	background: #eee;
}

</style>
</head>
<body>
	<div id="container">
		<h3>회원 정보</h3>
		<hr>
		<table>
			<thead>
				<tr>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>이름</th>
					<th>전화번호</th>
					<th>성별</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${ param.userid }</td>
					<td>${ param.passwd }</td>
					<td>${ param.uname }</td>
					<td>${ param.phone1 }-${ param.phone2 }-${ param.phone3 }</td>
					<td>${ param.gender }</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
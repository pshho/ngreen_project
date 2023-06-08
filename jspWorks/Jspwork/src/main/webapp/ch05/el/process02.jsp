<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="mb" class="member.Member"></jsp:useBean>
<jsp:setProperty property="userid" name="mb"/>
<jsp:setProperty property="passwd" name="mb"/>
<jsp:setProperty property="uname" name="mb"/>
<jsp:setProperty property="phone1" name="mb"/>
<jsp:setProperty property="phone2" name="mb"/>
<jsp:setProperty property="phone3" name="mb"/>
<jsp:setProperty property="gender" name="mb"/>
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
					<td><%= mb.getUserid() %></td>
					<td><%= mb.getPasswd() %></td>
					<td><%= mb.getUname() %></td>
					<td><%= mb.getPhone1() %>-<%= mb.getPhone2() %>-<%= mb.getPhone3() %></td>
					<td><%= mb.getGender() %></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
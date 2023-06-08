<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
	// MVC → Controller(제어자)
	request.setCharacterEncoding("utf-8");

	// 데이터 name 속성 받기
	String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");
	String nm = request.getParameter("uname");
	String ph1 = request.getParameter("phone1");
	String ph2 = request.getParameter("phone2");
	String ph3 = request.getParameter("phone3");
	String gd = request.getParameter("gender");
%>
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
					<!-- MVC → Model(데이터) -->
					<td><%= id %></td>
					<td><%= pw %></td>
					<td><%= nm %></td>
					<td><%= ph1 %>-<%= ph2 %>-<%= ph3 %></td>
					<td><%= gd %></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
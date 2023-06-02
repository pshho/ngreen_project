<%@page import="address.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>

<jsp:useBean id="abDAO" class="address.AddrBookDAO" scope="application"></jsp:useBean>

<body>
	<div id="container">
		<h1>주소록</h1>
		<hr>
		<p><a href="addrForm.jsp">주소 추가</a></p>
		<table id="tbl_list">
			<thead>
				<tr>
					<th>이름</th>
					<th>전화번호</th>
					<th>이메일</th>
					<th>성별</th>
				</tr>
			</thead>
			<tbody>
				<!-- ArrayList 출력 -->
				<%
					for(int i=0; i<abDAO.getAddrList().size(); i++) {
						AddrBook aB = abDAO.getAddrList().get(i);
				%>
				<tr>
					<td><%= aB.getUsername() %></td>
					<td><%= aB.getTel().substring(0, 3) + "-" 
					+ aB.getTel().substring(3, 7) + "-" + aB.getTel().substring(7, 11) %></td>
					<td><%= aB.getEmail() %></td>
					<td><%= aB.getGender() %></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>
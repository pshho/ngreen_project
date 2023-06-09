<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<div id="container">
		<section id="memberList">
			<h2>회원 목록</h2>
			<hr>
			<table id="tbl_list">
				<thead>
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>성별</th>
						<th>생성날짜</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ memberList }" var="member">
						<tr>
							<td><c:out value="${ member.memberId }"/></td>
							<td><c:out value="${ member.passwd }"/></td>
							<td><c:out value="${ member.name }"/></td>
							<td><c:out value="${ member.gender }"/></td>
							<td><fmt:formatDate value="${ member.joinDate }" type="both"/></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</section>
	</div>
</body>
</html>
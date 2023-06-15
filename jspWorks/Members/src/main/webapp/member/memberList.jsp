<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div id="container">
		<section id="memberList">
			<h2>회원 목록</h2>
			<hr>
			<div class="logout">
				<p>
					<a href="/logout.do">관리자 로그아웃</a>
				</p>
			</div>
			<table id="tbl_list">
				<thead>
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>성별</th>
						<th>생성날짜</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ memberList }" var="member">
						<tr>
							<td><a href="/memberView.do?memberId=${ member.memberId }">
									<c:out value="${ member.memberId }" />
							</a></td>
							<td><c:out value="${ member.passwd }" /></td>
							<td><c:out value="${ member.name }" /></td>
							<td><c:out value="${ member.gender }" /></td>
							<td><fmt:formatDate value="${ member.joinDate }" type="both" /></td>
							<td><a href="/memberDelete.do?memberId=${ member.memberId }"><input
									type="button" value="계정 삭제"
									onclick="return confirm('정말로 삭제하시겠습니까?')"></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
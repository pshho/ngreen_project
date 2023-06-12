<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"/>
	<c:choose>
		<c:when test="${ not empty sessionId }">
			<div id="container">
				<section id="board">
					<h2>게시판 목록</h2>
					<hr>
					<table id="brd_list">
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성일</th>
								<th>조회수</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ boardList }" var="board">
								<tr>
									<td><c:out value="${ board.bid }"/></td>
									<td>
										<a href="/boardView.do?memberId=${ board.memberId }">
										<c:out value="${ board.title }"/>
										</a>
									</td>
									<td><c:out value="${ board.memberId }"/></td>
									<td><fmt:formatDate value="${ board.regDate }" type="both"/></td>
									<td><c:out value="${ board.hit }"/></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div id="board_btn">
						<a href="boardWrite.do">
							<input type="button" value="글작성">
						</a>
					</div>
				</section>
			</div>
		</c:when>
		<c:otherwise>
			<script>
				alert("로그인을 해주세요");
				location.href("/loginForm.do");	// 페이지 이동
			</script>
		</c:otherwise>
	</c:choose>
	<jsp:include page="../footer.jsp"/>
</body>
</html>
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
<title>게시판 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
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
							<td><c:out value="${ board.bid }" /></td>
							<td><a href="/boardView.do?bid=${ board.bid }"> <c:out
										value="${ board.title }" />
							</a></td>
							<td><c:out value="${ board.memberId }" /></td>
							<td><fmt:formatDate value="${ board.regDate }" type="both" /></td>
							<td><c:out value="${ board.hit }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!-- 검색 폼 -->
			<form action="" method="post">
				<select name="field">
					<option ${(field == "title") ? "selected" : ""} value="title">제목</option>
					<option ${(field == "memberId") ? "selected" : ""} value="memberId">작성자</option>
				</select>
				<input type="text" name="kw" value="${ kw }">
				<button type="submit">검색</button>
			</form>
			<!-- 페이지 처리 영역 -->
			<div class='pagination'>
				<!-- 이전 페이지 -->
				<c:if test="${ startPage > 1 }">
					<a href="/boardList.do?pageNum=${ startPage - 1 }">이전</a>
				</c:if>
				<c:if test="${ startPage <= 1 }">
					<a href="#"></a>
				</c:if>
				<!-- 페이지 리스트 -->
				<c:forEach var='i' begin='1' end='${ endPage }'>
					<c:choose>
						<c:when test="${ empty kw }">
							<a href='/boardList.do?pageNum=${ i }'>${i}</a>
						</c:when>
						<c:when test="${ not empty kw }">
							<a href='/boardList.do?field=${ field }&kw=${ kw }&pageNum=${ i }'>${i}</a>
						</c:when>
					</c:choose>
				</c:forEach>
			</div>
			
			<div id="board_btn">
				<a href="boardWrite.do"> <input type="button" value="글작성">
				</a>
			</div>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
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
<title>강남 커뮤니티</title>
<link rel="stylesheet" href="./resources/css/style.css">
<link rel="stylesheet" href="./resources/css/responsive_web.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="container">
		<h2>강남 커뮤니티입니다.</h2>
		<hr>
		<div class="main_img">
			<img alt="강남" src="./resources/images/ganam.jpg">
		</div>
		
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
					<c:forEach items="${ boardList }" var="board" varStatus="status">
						<c:if test="${status.index < 3}">
							<tr>
								<td><c:out value="${ board.bid }" /></td>
								<td><a href="/boardView.do?bid=${ board.bid }"> <c:out
											value="${ board.title }" />
								</a></td>
								<td><c:out value="${ board.memberId }" /></td>
								<td><fmt:formatDate value="${ board.regDate }" type="both" /></td>
								<td><c:out value="${ board.hit }" /></td>
							</tr>
						</c:if>
					</c:forEach>
				</tbody>
			</table>
		</section>
	</div>
	<script>
		
	</script>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
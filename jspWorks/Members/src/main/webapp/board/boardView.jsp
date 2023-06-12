<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세 보기</title>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="boardView">
			<h2>게시글 상세 보기</h2>
			<ul>
				<li><label for="title">제목</label> <input type="text"
					name="title" id="title" value="${ board.title }" readonly></li>
				<li><label for="contents">내용</label> <textarea rows="15"
						cols="40" id="contents" name="contents" readonly>
						${ board.contents }</textarea></li>
				<li><label for="memberId">작성자</label> <input type="text"
					name="memberId" id="memberId" value="${ board.memberId }" readonly></li>
				<li><label for="regDate">작성일</label><input type="text"
					value="<fmt:formatDate value='${ board.regDate }' type='both'/>"
					readonly></li>
				<c:if test="${ sessionId == board.memberId }">
					<li id="btn"><a
						href="/boardUpdate.do?bid=${ board.bid }"> <input
							type="button" value="수정">
					</a> <a href="/boardDelete.do?bid=${ board.bid }"> <input
							type="button" value="삭제">
					</a></li>
				</c:if>
			</ul>

		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
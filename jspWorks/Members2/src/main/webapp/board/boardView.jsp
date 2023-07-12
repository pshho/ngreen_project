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
<title>게시글 상세 보기</title>
<link rel="stylesheet" href="../resources/css/style.css">
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
						cols="40" id="contents" name="contents" readonly>${ board.contents }</textarea></li>
				<li><label for="fileUploads">파일</label> <input type="text"
					name="fileUploads" value="${ board.fileUploads }" readonly>
				</li>
				<li><label for="memberId">작성자</label> <input type="text"
					name="memberId" id="memberId" value="${ board.memberId }" readonly></li>
				<li><label for="regDate">작성일</label><input type="text"
					value="<fmt:formatDate value='${ board.regDate }'
					 type='both'/><c:if test="${ not empty board.modifyDate }">(수정일: <fmt:formatDate 
					value='${ board.modifyDate }' type='both'/>)</c:if>"
					readonly></li>
				<c:if test="${ sessionId == board.memberId }">
					<li id="btn"><a href="/boardUpdate.do?bid=${ board.bid }">
							<input type="button" value="수정">
					</a> <a href="/boardDelete.do?bid=${ board.bid }"> <input
							type="button" value="삭제"
							onclick="return confirm('정말로 삭제하시겠습니까?')">
					</a></li>
				</c:if>
			</ul>
			<!-- 댓글 영역 -->
			<h3>댓글</h3>
			<div class="rtitle">
			<c:forEach items="${ replyList }" var="reply">
				<p>${ reply.rno }.  ${ reply.rcontent }</p>
				<p>작성자: ${ reply.replyer }</p>
			</c:forEach>
			</div>
			<!-- 댓글 등록 -->
			<form action="/addReply.do" method="post">
				<p>
					<textarea name="rcontent" rows="3" cols="70" placeholder="댓글을 남겨주세요."></textarea>
				</p>
				<button type="submit">등록</button>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
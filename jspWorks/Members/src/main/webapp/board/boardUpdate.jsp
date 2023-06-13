<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="board_update">
			<h2>게시글 수정</h2>
			<form action="updBoard.do" method="post" enctype="multipart/form-data">
				<input type="hidden" name="bid" value="${ board.bid }">
				<fieldset>
					<ul>
						<li><label for="title">제목</label> <input type="text"
							name="title" id="title" value="${ board.title }"></li>
						<li><label for="contents">내용</label> <textarea rows="15"
								cols="40" id="contents" name="contents">${ board.contents }</textarea></li>
						<li>
							<label for="fileUploads">파일</label>
							<input type="file" name="fileUploads">
						</li>
						<li><label for="memberId">작성자</label> <input type="text"
							name="memberId" id="memberId" value="${ board.memberId }"
							readonly></li>
						<li><label for="regDate">작성일</label><input type="text"
							value="<fmt:formatDate value='${ board.regDate }'
							 type='both'/><c:if test="${ not empty board.modifyDate }">(수정일: <fmt:formatDate 
							value='${ board.modifyDate }' type='both'/>)</c:if>"
							readonly></li>
					</ul>
					<div class="button">
						<input type="submit" value="저장"> <a
							href="/boardView.do?bid=${ board.bid }"> <input type="button"
							value="취소">
						</a>
					</div>
				</fieldset>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
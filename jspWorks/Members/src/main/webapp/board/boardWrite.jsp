<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<c:choose>
		<c:when test="${ not empty sessionId }">
			<div id="container">
				<section id="board_write">
					<h2>게시글 작성</h2>
					<form action="addBoard.do" method="post" enctype="multipart/form-data">
						<fieldset>
							<ul>
								<li>
									<label for="title">제목</label>
									<input type="text" name="title" id="title">
								</li>
								<li>
									<label for="contents">내용</label>
									<textarea rows="15" cols="40" name="contents" id="contents"></textarea>
								</li>
								<li>
									<label for="fileUploads">파일</label>
									<input type="file" name="fileUploads">
								</li>
								<li>
									<label for="memberId">작성자</label>
									<input type="text" name="memberId" id="memberId" value="${ sessionId }" readonly>
								</li>
							</ul>
						</fieldset>
						<div class="button">
							<input type="submit" value="등록"> <a href="/boardList.do"><input type="button"
								value="취소"></a>
						</div>
					</form>
				</section>
			</div>
		</c:when>
		<c:otherwise>
			<script>
				alert("로그인을 해주세요");
				location.replace("/loginForm.do"); // 페이지 이동
			</script>
		</c:otherwise>
	</c:choose>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시글 상세 보기</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<%
	pageContext.setAttribute("LF", "\n");	// 엔터를 치면 아스키코드(Line Feed)
	pageContext.setAttribute("BR", "<br>");
%>
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
				<p style="text-align: left;">${ reply.rno }.</p>
				<textarea rows="4" cols="100" readonly>${ reply.rcontent }</textarea>
				<%-- <p><c:out value="${ fn:replace(reply.rcontent, LF, BR) }"
				escapeXml="false"></c:out></p> --%>
				<c:choose>
					<c:when test="${ reply.replyer == sessionId }">
						<p class="rcontent">작성자: ${ reply.replyer }<br><c:choose><c:when 
						test="${ not empty reply.rupdate }">
							작성일: <fmt:formatDate value='${ reply.rdate }'
						 	type='both'/> 수정일: <fmt:formatDate value='${ reply.rupdate }'
						 	type='both'/><br></c:when><c:otherwise>작성일: <fmt:formatDate 
						 	value='${ reply.rdate }'
						 	type='both'/><br></c:otherwise></c:choose><a 
					 	href="/updateReply.do?bid=${ board.bid }&rno=${ reply.rno }">수정</a> <a 
						href="/deleteReply.do?bid=${ board.bid }&rno=${ reply.rno }" 
						onclick="return confirm('정말 삭제하시겠습니까?')">삭제</a></p>
					</c:when>
					<c:otherwise>
						<p class="rcontent">작성자: ${ reply.replyer }</p>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			</div>
			<!-- 댓글 등록 -->
			<c:choose>
				<c:when test="${ not empty sessionId }">
					<!-- 로그인된 경우에만 댓글 작성 폼과 등록 버튼을 표시 -->
					<form action="/addReply.do?bid=${ board.bid }" method="post">
						<p><input type="hidden" name="replyer" value="${ sessionId }"></p>
						<p>
						    <textarea name="rcontent" rows="4" cols="100" placeholder="댓글을 남겨주세요."></textarea>
						</p>
						<button type="submit">등록</button>
					</form>
				</c:when>
				<c:otherwise>
					<!-- 로그인되지 않은 경우에는 경고 메시지를 출력하고 로그인 페이지로 이동 -->
					<p>댓글 작성을 위해서는 로그인이 필요합니다. 로그인 후 이용해주세요.</p>
					<i class="fa-regular fa-user"><a href="/loginForm.do" 
						style="text-decoration: none; margin-left: 8px;">로그인 페이지로 이동</a></i>
				</c:otherwise>
			</c:choose>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
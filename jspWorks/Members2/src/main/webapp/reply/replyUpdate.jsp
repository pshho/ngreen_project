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
<title></title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div id="container">
		<section id="reply_update">
			<h2>댓글 수정</h2>
			<form action="/updReply.do?bid=${ reply.bid }&rno=${ reply.rno }" method="post">
				<p><span>${ reply.rno }.</span><br><textarea 
				rows="4" cols="100" name="rcontent">${ reply.rcontent }</textarea>
				</p>
				<p class="rcontent">작성자: ${ reply.replyer }<br>작성일: <fmt:formatDate value='${ reply.rdate }'
					 	type='both'/></p>
				<button type="submit">저장</button>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
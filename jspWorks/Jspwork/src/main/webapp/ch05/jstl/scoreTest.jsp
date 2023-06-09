<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리</title>
</head>
<body>
	<c:set var="score" value="${ param.score.trim() }"/>
	<h3>시험 점수:	<c:out value="${ score }"/></h3>
	<c:set var="grade"/>
	<c:choose>
		<c:when test="${ score >= 90 and score <= 100 }">
			<c:set var="grade" value="A"/>
		</c:when>
		<c:when test="${ score >= 80 and score < 90 }">
			<c:set var="grade" value="B"/>
		</c:when>
		<c:when test="${ score >= 70 and score < 80 }">
			<c:set var="grade" value="C"/>
		</c:when>
		<c:when test="${ score >= 60 and score < 70 }">
			<c:set var="grade" value="D"/>
		</c:when>
		<c:otherwise>
			<c:set var="grade" value="F"/>
		</c:otherwise>
	</c:choose>
	<p>당신의 학점은 <c:out value="${ grade }"/>입니다.</p>
</body>
</html>
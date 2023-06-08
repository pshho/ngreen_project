<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 예제</title>
<%
	// 모델 생성
	pageContext.setAttribute("cart", "egg");
%>
</head>
<body>
	<h3>${ cart }</h3>

	<!-- <%
		int num = 11;
	
		if(num % 2 == 0) {
			out.println("짝수");
		}else {
			out.println("홀수");
		}
	%> -->
	
	<c:set var="num" value="11"></c:set>
	<!-- <c:if test="${ num % 2 == 0 }">
		<c:out value="${ '짝수입니다.' }"></c:out>
	</c:if> -->
	<c:choose>
		<c:when test="${ num % 2 == 0 }">
			<!-- <c:out value="${ '짝수입니다.' }"></c:out> -->
		</c:when>
		<c:otherwise>
			<!-- <c:out value="${ '홀수입니다.' }"></c:out> -->
		</c:otherwise>
	</c:choose>
	<br>
	<br>
	
	<c:set var="arr1" value="${{1, 2, 3, 4, 5, 6, 7, 8, 9}}"/>
	<!-- 구구단 5단 -->
	<c:set var="dan" value="4"></c:set>
	<c:forEach var="i" begin="2" end="9">
		<c:forEach items="${ arr1 }" var="j">
			<c:out value="${ i } X ${ j } = ${ j * i }"></c:out> <br>
		</c:forEach>
		<br>
	</c:forEach>
	
	<!-- 
	<c:set var="array1" value="${ {'apple', 'apple', 'banana', 'peach', 'peach'} }"></c:set>
	<c:out value="${ array1 }"></c:out>
	 -->
</body>
</html>
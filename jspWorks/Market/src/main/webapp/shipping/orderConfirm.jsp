<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 내역</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-4">
		<h2 class="text-left mx-4 my-4">주문 내역</h2>
		<div class="row">
			<c:set var="cartId" value="${shipCookieList[0]}" />
			<c:set var="shipName" value="${shipCookieList[1]}" />
			<c:set var="phone" value="${shipCookieList[2]}" />
			<c:set var="postalCode" value="${shipCookieList[3]}" />
			<c:set var="address" value="${shipCookieList[4]}" />
			<c:set var="detAddress" value="${shipCookieList[5]}" />
			<div class="form-group">
				<label for="shipName">성명</label> <input type="text"
						class="form-control" id="shipName" name="shipName" 
						value="${ shipName }" readonly>
			</div>
			<div class="form-group">
				<label for="phone">연락처</label> <input type="tel"
					class="form-control" id="phone" name="phone" 
					value="${ phone }" readonly>
			</div>
			<div class="form-group">
				<label for="postalCode">우편번호</label> <input type="text"
					class="form-control" id="postalCode" name="postalCode" 
					value="${ postalCode }" readonly>
			</div>
			<div class="form-group">
				<label for="address">주소</label> <input type="text"
					class="form-control" id="address" name="address" 
					value="${ address }" readonly>
			</div>
			<div class="form-group">
				<label for="detAddress">상세주소</label> <input type="text"
					class="form-control" id="detAddress" name="detAddress" 
					value="${ detAddress }" readonly>
			</div>
		</div><!-- row 닫기 -->
		<div style="padding-top: 50px">
			<a href="/shippingInfo.do?cartId=${ cartId }" class="btn btn-primary">&laquo; 이전</a>
			<a href="/completeOrder.do?cartId=${ cartId }" class="btn btn-secondary">&laquo; 주문 완료</a>
			<a href="/cancelOrder.do?cartId=${ cartId }" class="btn btn-secondary">&laquo; 주문 취소</a>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배송정보</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3" style="padding-top: 8px;">
		<h2 class="text-left mx-4 my-4">배송정보입력</h2>
		<div class="row mx-5" align="center" style="text-align: left;">
			<form action="/processShipping.do" method="post">
				<input type="hidden" name="cartId" value="${ cartId }">
				<div class="form-group">
					<label for="shipName">성명</label> <input type="text"
						class="form-control" id="shipName" name="shipName"
						<c:if test='${not empty cookie["Shipping_Name"]}'>value="${URLDecoder.decode(cookie["Shipping_Name"].value, "UTF-8")}"</c:if> required>
				</div>
				<div class="form-group">
					<label for="phone">연락처</label> <input type="tel"
						class="form-control" id="phone" name="phone"
						<c:if test='${not empty cookie["Shipping_Phone"]}'>value="${cookie["Shipping_Phone"].value}"</c:if> required>
				</div>
				<div class="form-group">
					<label for="postalCode">우편번호</label> <input type="text"
						class="form-control" id="postalCode" name="postalCode"
						<c:if test='${not empty cookie["Shipping_Postal"]}'>value="${cookie["Shipping_Postal"].value}"</c:if> required>
				</div>
				<div class="form-group">
					<label for="address">주소</label> <input type="text"
						class="form-control" id="address" name="address"
						<c:if test='${not empty cookie["Shipping_Addr"]}'>value="${URLDecoder.decode(cookie["Shipping_Addr"].value, "UTF-8")}"</c:if> required>
				</div>
				<div class="form-group">
					<label for="detAddress">상세주소</label> <input type="text"
						class="form-control" id="detAddress" name="detAddress"
						<c:if test='${not empty cookie["Shipping_DetAddr"]}'>value="${URLDecoder.decode(cookie["Shipping_DetAddr"].value, "UTF-8")}"</c:if> required>
				</div>
				<a class="btn btn-secondary" href="/cart.do">이전</a>
				<button type="submit" class="btn btn-primary">주문</button>
				<button type="reset" class="btn btn-secondary">취소</button>
			</form>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>
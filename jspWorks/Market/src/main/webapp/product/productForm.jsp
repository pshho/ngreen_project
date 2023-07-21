<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록페이지</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3" style="padding-top: 8px;">
		<h2 class="text-left mx-4 my-4">상품 등록</h2>
		<div class="row mx-5" align="center" style="text-align: left;">
			<form action="/addProduct.do" enctype="multipart/form-data" method="post" name="adPro" onsubmit="return checkAddProduct();">
				<div class="form-group">
					<label for="productId">상품 아이디</label> <input type="text"
						class="form-control" id="productId" name="productId" required>
				</div>
				<div class="form-group">
					<label for="productName">상품명</label> <input type="text"
						class="form-control" id="pname" name="pname" required>
				</div>
				<div class="form-group">
					<label for="unitPrice">상품 가격</label> <input type="number"
						class="form-control" id="unitPrice" name="unitPrice" required
						placeholder="숫자만 입력해 주세요.">
				</div>
				<div class="form-group">
					<label for="description">상품 설명</label>
					<textarea class="form-control" id="description" name="description"
						rows="3" required></textarea>
				</div>
				<div class="form-group">
					<label for="category">상품 분류</label> <select class="form-control"
						id="category" name="category" required>
						<option value="디지털">디지털</option>
						<option value="시계">시계</option>
						<option value="의류">의류</option>
						<option value="생필품">생필품</option>
						<option value="도서">도서</option>
					</select>
				</div>
				<div class="form-group">
					<label for="manufacturer">상품 제조사</label> <input type="text"
						class="form-control" id="manufacturer" name="manufacturer"
						required>
				</div>
				<div class="form-group">
					<label for="unitsInStock">상품 재고수</label> <input type="number"
						class="form-control" id="unitsInStock" name="unitsInStock"
						required placeholder="숫자만 입력해 주세요.">
				</div>
				<div class="form-group">
					<label for="condition">상품 상태</label> <select class="form-control"
						id="condition" name="condition" required>
						<option value="신제품">신제품</option>
						<option value="중고품">중고품</option>
					</select>
				</div>
				<div class="form-group">
					<label for="id_photo">사진:</label>
					<input type="file" name="photo"
					accept="image/*" class="form-control my-2" id="id_photo">
				</div>
				<button type="submit" class="btn btn-primary">등록</button>
				<button type="reset" class="btn btn-secondary">취소</button>

			</form>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
	<script type="text/javascript" src="../resource/js/validate.js"></script>
</body>
</html>
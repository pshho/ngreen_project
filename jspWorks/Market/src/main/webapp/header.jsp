<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/187dabceeb.js" crossorigin="anonymous" type="application/javascript"></script>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="../resource/css/style.css">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">강남쇼핑 <i class="fa-solid fa-shop"></i></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="/productList.do">상품목록</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/cart.do">장바구니</a>
        </li>
        <c:choose>
        	<c:when test="${ empty sessionId }">
		        <li class="nav-item">
		          <a class="nav-link" href="/login.do">로그인</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="/memberForm.do">회원가입</a>
		        </li>
	        </c:when>
	        <c:otherwise>
	        	<li class="nav-item">
		          <a class="nav-link" href="/memberInfo.do?mid=${ sessionId }">마이페이지</a>
		        </li>
	        	<li class="nav-item">
		          <a class="nav-link" href="/logout.do">로그아웃</a>
		        </li>
	        </c:otherwise>
        </c:choose>
        <c:if test="${ pageContext.request.remoteUser eq 'admin' }">
	        <li class="nav-item">
	          <a class="nav-link" href="/productForm.do">상품등록</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/editProduct.do?edit=update">상품수정</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/editProduct.do?edit=delete">상품삭제</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="/memberList.do">회원관리</a>
	        </li>
        </c:if>
        <c:choose>
        	<c:when test="${ pageContext.request.remoteUser eq 'admin' }">
        		<li class="nav-item">
		          <a class="nav-link" href="/logout.do">관리자 로그아웃</a>
		        </li>
        	</c:when>
        	<c:otherwise>
		        <li class="nav-item">
		          <a class="nav-link" href="/loginForm.do">관리자 로그인</a>
		        </li>
        	</c:otherwise>
        </c:choose>
      </ul>
    </div>
  </div>
</nav>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	// 상품 추가할 리스트(장바구니)
	List<String> productList = null;
	
	if(productList == null) {
		productList = new ArrayList<>();
		session.setAttribute("cartList", productList);
	}

	String product = request.getParameter("product");
	productList.add(product);
%>
<script type="text/javascript">
	alert("<%= product %>가(이) 추가되었습니다.");
	history.go(-1);
</script>
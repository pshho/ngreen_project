<!-- page directive(지시) 태그 -->
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page directive 태그</title>
</head>
<body>
	<%
		// 배열 선언
		int[] arr = new int[]{10, 20, 30};
		// out.println(arr[0]);
		
		// 전체 조회
		for(int i=0; i<arr.length; i++) {
			out.println(arr[i]);
		}
		
		out.println("<br>");
		
		// ArrayList 클래스
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("바나나");
		fruitList.add("참외");
		fruitList.add("수박");
		
		// 참외 조회
		out.println(fruitList.get(1) + "<br>");
		
		// 전체 조회
		for(int i=0; i<fruitList.size(); i++) {
			String fruit = fruitList.get(i);
			out.println(fruit);
		}
	%>
</body>
</html>
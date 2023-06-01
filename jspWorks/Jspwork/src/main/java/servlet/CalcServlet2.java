package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator/calc2")
public class CalcServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 폼 데이터 가져오기
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		String op = req.getParameter("op");
		int result = 0;
		
		// 연산
		switch(op) {
		case "+":
			result = x + y; break;
		case "-":
			result = x - y; break;
		case "x":
			result = x * y; break;
		case "/":
			result = x / y; break;
		default:
			System.out.println("올바른 계산이 아닙니다.");
		}
		
		// html 형식 응답 처리
		resp.setContentType("text/html; charset=utf-8");
		
		// 출력 객체 생성
		PrintWriter out = resp.getWriter();
		
		// 데이터 보내기
		out.append("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>정수형 계산기</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"./css/calcStyle.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<div id=\"container\">\r\n"
				+ "		<h2>계산결과</h2>\r\n"
				+ "		<hr>\r\n"
				+ "	</div>\r\n"
				+ "	<div id=\"wrap\">\r\n"
				+ "		<p>결과: " + result + "</p>\r\n"
				+ "	</div>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
	}
	
	/*
	// method 방식 get 요청 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	// method 방식 post 요청 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// doGet(req, resp);
	}
	*/

	@Override
	public void destroy() {
	}

	@Override
	public void init() throws ServletException {
	}
	
}

package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 문서 인코딩(한글)
		request.setCharacterEncoding("utf-8");
		
		// jsp 폼에 입력된 자료 수집
		String id = request.getParameter("userid");
		String pd = request.getParameter("passwd");
		String ph = request.getParameter("phone");
		
		// 문서 컨텐츠 유형
		response.setContentType("text/html; charset=utf-8");
		
		// 출력 객체 생성
		PrintWriter out = response.getWriter();
		
		String data = "<html><body>";
			   data += "<p>아이디: " + id + "</p>";
			   data += "<p>비밀번호: " + pd + "</p>";
			   data += "<p>전화번호: " + ph + "</p>";
			   data += "</body></html>";
		
		out.println(data);
		
		// System.out.println("아이디: " + id);
		// System.out.println("비밀번호: " + pd);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MVCTest2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException{
		// 짝수/홀수를 판정해서 결과를 jsp에 보내기
		int num = 0;
		String result;
		
		if(req.getParameter("num") != null) {
			num = Integer.parseInt(req.getParameter("num"));
		}
		
		if(num % 2 == 0) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
		
		// Model 생성
		req.setAttribute("result", result);
		
		// forwarding
		RequestDispatcher dispatcher = req.getRequestDispatcher("/mvc/mvc02.jsp");
		dispatcher.forward(req, rep);
		
	}

}

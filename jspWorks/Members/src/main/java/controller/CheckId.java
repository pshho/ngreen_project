package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;

/**
 * Servlet implementation class CheckId
 */
@WebServlet("/checkid")
public class CheckId extends HttpServlet {
	private static final long serialVersionUID = 1123123L;
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		MemberDAO dao = new MemberDAO();
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		int checkId = dao.duplicatedId(id);
		
		if(checkId == 1) {
			out.println("not_usable");
		}else {
			out.println("usable");
		}
		
	}
	
}

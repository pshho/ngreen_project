package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.Member;
import member.MemberDAO;

/**
 * Servlet implementation class MainController
 */
@WebServlet("*.do")	// 경로를 .do로 끝나도록 설정
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 4L;
	
	MemberDAO memberDAO;	// MemberDAO 객체 선언

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// 한글 인코딩
		req.setCharacterEncoding("utf-8");
		
		// command 패턴으로 url 설정하기
		String uri = req.getRequestURI();
//		System.out.println(uri);
		
		String command = uri.substring(uri.lastIndexOf('/'));
//		System.out.println(uri.lastIndexOf("/"));
//		System.out.println(command);
		
		String nextPage = null;
		
		// 회원 목록 조회
		if(command.equals("/memberList.do")) {
			
			ArrayList<Member> memberList;
			memberList = memberDAO.getMemberList();
			
			// Model 생성
			req.setAttribute("memberList", memberList);
			
			nextPage = "memberList.jsp";
		}else if(command.equals("/memberForm.do")) {
			nextPage = "memberForm.jsp";
		}else if(command.equals("/addMember.do")) {
			
			String id = req.getParameter("memberId");
			String pw = req.getParameter("passwd1");
			String na = req.getParameter("name");
			String gd = req.getParameter("gender");
			
			Member nmember = new Member();
			nmember.setMemberId(id);
			nmember.setPasswd(pw);
			nmember.setName(na);
			nmember.setGender(gd);
			
			memberDAO.insertMember(nmember);	// 회원을 DB에 저장
			
			nextPage = "index.jsp";
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(nextPage);
		dispatcher.forward(req, res);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

}

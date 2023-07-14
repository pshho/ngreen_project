package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import board.Board;
import board.BoardDAO;
import member.Member;
import member.MemberDAO;
import reply.Reply;
import reply.ReplyDAO;

/**
 * Servlet implementation class MainController
 */
@WebServlet("*.do")	// 경로를 .do로 끝나도록 설정
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 4L;
	
	MemberDAO memberDAO;	// MemberDAO 객체 선언
	BoardDAO boardDAO;		// BoardDAO 객체 선언
	ReplyDAO replyDAO;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();
		boardDAO = new BoardDAO();
		replyDAO = new ReplyDAO(); 
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// 한글 인코딩
		req.setCharacterEncoding("utf-8");
		
		// 콘텐츠 타입 설정(response)
		res.setContentType("text/html; charset=utf-8");
		
		// command 패턴으로 url 설정하기
		String uri = req.getRequestURI();
//		System.out.println(uri);
		
		String command = uri.substring(uri.lastIndexOf('/'));
//		System.out.println(uri.lastIndexOf("/"));
//		System.out.println(command);
		
		String nextPage = null;
		
		// 출력 스트림 객체
		PrintWriter out = res.getWriter();
		
		// session 발급 및 조회
		HttpSession session = req.getSession();
		session.setMaxInactiveInterval(1800);
		
		// 회원 목록 조회
		if(command.equals("/memberList.do")) {
			
			ArrayList<Member> memberList;
			memberList = memberDAO.getMemberList();
			
			// Model 생성
			req.setAttribute("memberList", memberList);
			
			nextPage = "/member/memberList.jsp";
		}else if(command.equals("/memberForm.do")) {
			nextPage = "/member/memberForm.jsp";
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
			
			nextPage = "/loginProcess.do";
		}else if(command.equals("/memberView.do")) {
			String id = req.getParameter("memberId");
			
			Member nmember = new Member();
			
			nmember = memberDAO.getMember(id);
			
			req.setAttribute("member", nmember);
			
			nextPage = "/member/memberView.jsp";
		}else if(command.equals("/updMember.do")) {
			
			String id = req.getParameter("memberId");
			String pw = req.getParameter("passwd1");
			String na = req.getParameter("name");
			String gd = req.getParameter("gender");
			
			Member nmember = new Member();
			nmember.setMemberId(id);
			nmember.setPasswd(pw);
			nmember.setName(na);
			nmember.setGender(gd);
			
			memberDAO.updateMember(nmember);
			
			nextPage = "/memberList.do";
			
		}else if(command.equals("/memberUpdate.do")) {
			
			String id = req.getParameter("memberId");
			
			Member nmember = new Member();
			
			nmember = memberDAO.getMember(id);
			
			req.setAttribute("member", nmember);
			
			nextPage = "/member/memberUpdate.jsp";
		}else if(command.equals("/memberDelete.do")) {
			String id = req.getParameter("memberId");
			String sessionId = req.getParameter("sessionId");
			
			if (sessionId != null && sessionId.equals(id)) {
				session.invalidate();
			}
			
			memberDAO.deleteMember(id);
			
			nextPage = "/memberList.do";
		}else if(command.equals("/loginForm.do")) {
			nextPage = "/member/loginForm.jsp";
		}else if(command.equals("/loginProcess.do")) {
			// 로그인 폼에 입력된 데이터 받아오기
			String id = req.getParameter("memberId");
			String pw = req.getParameter("passwd1");
			
			Member nmember = new Member();
			nmember.setMemberId(id);
			nmember.setPasswd(pw);
			
			boolean check = memberDAO.checkLogin(nmember);
			
			if(check) {
				session.setAttribute("sessionId", id);
				
				nextPage = "/index.do";
			}else {
				out.println("<script>\n "
						+ "alert('아이디와 비밀번호를 확인해주세요')\n "
						+ "history.go(-1)\n "	// 이전 페이지 이동
						+ "</script> ");
			}
			
		}else if(command.equals("/logout.do")) {
			session.invalidate();
			
			nextPage = "/index.do";
		}else if(command.equals("/memberEvent.do")) {
			nextPage = "/member/memberEvent.jsp";
		}
		
		// 게시판 관리
		if(command.equals("/boardList.do")) {
			// 페이지 처리
			String pageNum = req.getParameter("pageNum");
			if(pageNum == null) {	// pageNum이 없으면 기본 페이지
				pageNum = "1";
			}
			
			// 각 페이지 첫행 : 1page -> 01번, 2page -> 11번, 3page -> 21번
			int pageSize = 10;
			int currentPage = Integer.parseInt(pageNum);
			int startRaw = (currentPage - 1) * pageSize + 1;
			
			// 시작 페이지
			int startPage = startRaw / pageSize + 1;
			
			// 종료(끝) 페이지
			int total = boardDAO.getBoardCount();
			int endPage = total / pageSize;
			endPage = (total % pageSize == 0) ? endPage : endPage + 1;
			
			ArrayList<Board> boardList = boardDAO.getBoardList1(startRaw);
			
			req.setAttribute("boardList", boardList);
			req.setAttribute("currentPage", currentPage);
			req.setAttribute("endPage", endPage);
			req.setAttribute("startPage", startPage);
			
			nextPage = "/board/boardList.jsp";
		}else if(command.equals("/boardWrite.do")) {
			nextPage = "/board/boardWrite.jsp";
		}else if(command.equals("/addBoard.do")) {
			String realFolder = "C:\\ngreen_project\\jspWorks\\Members2\\src\\main\\webapp\\resources\\uploadFile";
			MultipartRequest multi = new MultipartRequest(req, realFolder, 5*1024*1024, 
					"utf-8", new DefaultFileRenamePolicy());
			
			String title = multi.getParameter("title");
			String contents = multi.getParameter("contents");
			String id = multi.getParameter("memberId");
			
			Enumeration<String> files = multi.getFileNames();
			String name = "";
			String fileName = "";
			
			if(files.hasMoreElements()) {
				name = (String)files.nextElement();
				fileName = multi.getFilesystemName(name);
			}
			
			Board nBoard = new Board();
			
			nBoard.setTitle(title);
			nBoard.setContents(contents);
			nBoard.setMemberId(id);
			nBoard.setFileUploads(fileName);
			
			boardDAO.insertBoard(nBoard);
			
			nextPage = "/boardList.do";
		}else if(command.equals("/boardView.do")) {
			int bid = Integer.parseInt(req.getParameter("bid"));
			
			Board nBoard = new Board();
			ArrayList<Reply> replyList = replyDAO.getReplyList(bid);
			
			nBoard = boardDAO.getBoard(bid);
			
			boardDAO.hitUpdateBoard(nBoard.getBid());
			
			req.setAttribute("board", nBoard);
			req.setAttribute("replyList", replyList);
			
			nextPage = "/board/boardView.jsp";
		}else if(command.equals("/boardUpdate.do")) {
			int bid = Integer.parseInt(req.getParameter("bid"));
			
			Board nBoard = new Board();
			
			nBoard = boardDAO.getBoard(bid);
			
			req.setAttribute("board", nBoard);
			
			nextPage = "/board/boardUpdate.jsp";
		}else if(command.equals("/updBoard.do")) {
			String realFolder = "C:\\ngreen_project\\jspWorks\\Members2\\src\\main\\webapp\\resources\\uploadFile";
			MultipartRequest multi = new MultipartRequest(req, realFolder, 5*1024*1024, 
					"utf-8", new DefaultFileRenamePolicy());
			
			int bid = Integer.parseInt(multi.getParameter("bid"));
			String title = multi.getParameter("title");
			String contents = multi.getParameter("contents");
			
			Enumeration<String> files = multi.getFileNames();
			String name = "";
			String fileName = "";
			
			if(files.hasMoreElements()) {
				name = (String)files.nextElement();
				fileName = multi.getFilesystemName(name);
			}
			
			Board nBoard = new Board();
			
			nBoard.setBid(bid);
			nBoard.setTitle(title);
			nBoard.setContents(contents);
			nBoard.setFileUploads(fileName);
			
			boardDAO.updateBoard(nBoard);
			
			nextPage = "/boardList.do";
		}else if(command.equals("/boardDelete.do")) {
			int bid = Integer.parseInt(req.getParameter("bid"));
			
			boardDAO.deleteBoard(bid);
			
			nextPage = "/boardList.do";
		}else if(command.equals("/addReply.do")) {
			String bid = req.getParameter("bid");
			String rcontent = req.getParameter("rcontent");
			String id = req.getParameter("replyer");
			
			Reply replys = new Reply();
			
			replys.setBid(Integer.parseInt(bid));
			replys.setRcontent(rcontent);
			replys.setReplyer(id);
			
			replyDAO.addReply(replys);
			
			nextPage = "/boardView.do?bid=" + Integer.parseInt(bid);
		}else if(command.equals("/deleteReply.do")) {
			int rno = Integer.parseInt(req.getParameter("rno"));
			String bid = req.getParameter("bid");
			
			replyDAO.deleteReply(rno);
			
			nextPage = "/boardView.do?bid=" + Integer.parseInt(bid);
		}else if(command.equals("/updateReply.do")) {
			int rno= Integer.parseInt(req.getParameter("rno"));
			
			Reply reply = replyDAO.getReply(rno);
			
			req.setAttribute("reply", reply);
			
			nextPage = "reply/replyUpdate.jsp";
		}else if(command.equals("/updReply.do")) {
			int rno = Integer.parseInt(req.getParameter("rno"));
			int bid = Integer.parseInt(req.getParameter("bid"));
			String rcontent = req.getParameter("rcontent");
			
			Reply replys = new Reply();
			
			replys.setRno(rno);
			replys.setRcontent(rcontent);
			
			replyDAO.updateReply(replys);
			
			nextPage = "/boardView.do?bid=" + bid;
		}
		
		if(command.equals("/index.do")) {
			ArrayList<Board> boardList = boardDAO.getBoardList();
			
			req.setAttribute("boardList", boardList);
			
			nextPage = "/main.jsp";
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

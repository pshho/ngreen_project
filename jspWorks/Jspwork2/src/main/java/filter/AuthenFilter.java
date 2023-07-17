package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 필터를 사용하여 한글 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html; charset=utf-8");
		
		// 필터를 사용하여 입력값 오류 출력하기
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		
		if (username == "" || username.equals("")) {
			out.println("입력되지 않았습니다.");
		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("AuthenFilter 해제..");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AuthenFilter 초기화..");
	}

}

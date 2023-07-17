package filter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogFileFilter
 */
public class LogFilter extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 로그 파일에 기록할 내용
		String clientAddress = request.getRemoteAddr();	// IP 주소 얻는 method
		System.out.printf("클라이언트 IP 주소: %s %n", clientAddress);
		
		long start = System.nanoTime();
		System.out.println("접근한 URL 경로: " + getURLPath(request));
		System.out.println("요청 처리 시작 시각: " + getCurrentTime());
		
		long end = System.nanoTime();
		System.out.println("요청 처리 종료 시각: " + getCurrentTime());
		System.out.println("요청 처리 소요 시간: " + (end-start) + "ns");
		System.out.println("=========================================");
				
		chain.doFilter(request, response);
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LogFilter 초기화..");
	}
	
	private String getCurrentTime() {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		
		return now.format(datetime);
	}

	private String getURLPath(ServletRequest request) {
		HttpServletRequest req;
		String currentPath = "";
		String queryString = "";
		
		if (request instanceof HttpServletRequest) {
			req = (HttpServletRequest) request;
			currentPath = req.getRequestURI();
			queryString = req.getQueryString();
			
			queryString = (queryString == null) ? "" : "?" + queryString;
			
		}
		
		return currentPath + queryString;
	}
}

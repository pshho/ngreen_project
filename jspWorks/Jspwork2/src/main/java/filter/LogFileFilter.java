package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LogFileFilter
 */
public class LogFileFilter extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PrintWriter writer;

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		writer.close();
		System.out.println("destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 로그 파일에 기록할 내용
		String clientAddress = request.getRemoteAddr();	// IP 주소 얻는 method
		writer.printf("클라이언트 IP 주소: %s %n", clientAddress);
		
		String contentType = response.getContentType();	// 컨텐츠 유형
		writer.printf("문서의 컨텐츠 유형: %s %n", contentType);
		
		writer.printf("현재 일시: %s %n", getCurrentTime());
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		String filename = filterConfig.getInitParameter("filename");
		
		if (filename == null) {
			throw new ServletException("로그 파일의 이름을 찾을 수 없습니다.");	// 강제 예외
		}
		
		try {
			writer = new PrintWriter(new FileWriter(filename, true), true);
		} catch (IOException e) {
			throw new ServletException("로그 파일을 열 수 없습니다.");
		}
	}
	
	private String getCurrentTime() {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		
		return now.format(datetime);
	}

}

package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.Product;
import product.ProductService;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/procontrol")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

    private ProductService service;
    
	public void init(ServletConfig config) throws ServletException {
		service = new ProductService();
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// url 설정 action 패턴 사용
		String action = request.getParameter("action");
		String nextPage = null;
		
		if (action.equals("list")) {
			
			List<Product> productList = service.getProductList();
			request.setAttribute("productList", productList);
			nextPage = "/product/productList.jsp";
			
		}else if (action.equals("info")) {
		    String pid = request.getParameter("pid");
	        Product product = service.getProduct(pid);
	        request.setAttribute("product", product);
	        nextPage = "/product/productInfo.jsp";
		}
				
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

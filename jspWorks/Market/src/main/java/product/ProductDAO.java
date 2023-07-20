package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JDBCUtil;

public class ProductDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// 상품 목록 보기
	public List<Product> getProductList(){
		List<Product> productList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "select * from product";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getString("pid"));
				product.setPname(rs.getString("pname"));
				product.setUnitPrice(rs.getInt("punitPrice"));
				product.setDescription(rs.getString("pdescription"));
				product.setCategory(rs.getString("pcategory"));
				product.setManufacturer(rs.getString("pmanufacturer"));
				product.setUnitsInStock(rs.getLong("punitsInstock"));
				product.setCondition(rs.getString("pcondition"));
				product.setProductImage(rs.getString("pproductImage"));
				productList.add(product);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return productList;
	}	// 상품 목록 보기
	
	// 상품 상세 보기
	public Product getProduct(String productId) {
		Product product = new Product();
		conn = JDBCUtil.getConnection();
		String sql = "select * from product where pid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				product.setProductId(rs.getString("pid"));
				product.setPname(rs.getString("pname"));
				product.setUnitPrice(rs.getInt("punitPrice"));
				product.setDescription(rs.getString("pdescription"));
				product.setCategory(rs.getString("pcategory"));
				product.setManufacturer(rs.getString("pmanufacturer"));
				product.setUnitsInStock(rs.getLong("punitsInstock"));
				product.setCondition(rs.getString("pcondition"));
				product.setProductImage(rs.getString("pproductImage"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return product;
	}// 상품 상세 보기
	
	// 상품 등록
		public void addProduct(Product product) {
			
			conn = JDBCUtil.getConnection();
			String sql = "INSERT INTO product \r\n"
					+ "(pid, pname, punitPrice, pdescription, pcategory, pmanufacturer, punitsInstock, pcondition, pproductImage)\r\n"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			try {
		        pstmt = conn.prepareStatement(sql);
		        pstmt.setString(1, product.getProductId());
		        pstmt.setString(2, product.getPname());
		        pstmt.setInt(3, product.getUnitPrice());
		        pstmt.setString(4, product.getDescription());
		        pstmt.setString(5, product.getCategory());
		        pstmt.setString(6, product.getManufacturer());
		        pstmt.setLong(7, product.getUnitsInStock());
		        pstmt.setString(8, product.getCondition());
		        pstmt.setString(9, product.getProductImage());

		        pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn, pstmt, rs);
			}
		
		}	// 상품 등록 끝
		
		// 상품 삭제
		public void delectProduct(String productId) {
			conn = JDBCUtil.getConnection();
			String sql = "delete from product where pid = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, productId);
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn, pstmt);
			}

		} // 상품 삭제 끝

		// 상품 수정
		public void updateProduct(Product product) {
			conn = JDBCUtil.getConnection();
			String sql = "update product set pname = ?, punitPrice = ?, pdescription = ?, "
					+ "pcategory = ?, pmanufacturer = ?, punitsInstock = ?, "
					+ "pcondition = ?, pproductImage = ? where pid = ?";
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, product.getPname());
				pstmt.setInt(2, product.getUnitPrice());
				pstmt.setString(3, product.getDescription());
				pstmt.setString(4, product.getCategory());
				pstmt.setString(5, product.getManufacturer());
				pstmt.setLong(6, product.getUnitsInStock());
				pstmt.setString(7, product.getCondition());
				pstmt.setString(8, product.getProductImage());
				pstmt.setString(9, product.getProductId());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn, pstmt);
			}
			
		}
}

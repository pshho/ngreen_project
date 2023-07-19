package products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtil;

public class ProductDAO {
	// field
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 자료 검색(게시글 전체 목록)
	public ArrayList<Product> getProductList() {
		ArrayList<Product> productList = new ArrayList<>();

		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM product";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Product product = new Product();

				product.setPid(rs.getString("pid"));
				product.setPname(rs.getString("pname"));
				product.setPdescription(rs.getString("pdescription"));
				product.setPcategory(rs.getString("pcategory"));
				product.setPmanufacturer(rs.getString("pmanufacturer"));
				product.setPcondition(rs.getString("pcondition"));
				product.setPproductImage(rs.getString("pproductImage"));
				product.setPunitPrice(rs.getInt("punitPrice"));
				product.setPunitsInstock(rs.getInt("punitsInstock"));

				productList.add(product);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return productList;

	}
}

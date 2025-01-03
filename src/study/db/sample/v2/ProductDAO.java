package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public List<Product> findProductList() {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();
		
		String sqlQuary = "select * from product";

		List<Product> productList = new ArrayList<Product>();
		
		try {

			psmt = conn.prepareStatement(sqlQuary);
			rs = psmt.executeQuery();

			while (rs.next()) {
				
				productList.add(new Product(rs.getInt("p_code"),rs.getString("p_name"),rs.getInt("p_price")));
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return productList;
	}
}

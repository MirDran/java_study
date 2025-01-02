package study.db.sample.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		
//		singleProduct(100);
//		
//		List<ProductDTO> pList = findProductList();
//		
//		if(pList != null && pList.size() > 0 ) {
//			
//			for(ProductDTO p : pList) {
//				System.out.println(p.getP_code()+" "+ p.getP_name()+" " + p.getP_price());
//			}
//		}
		
		ProductDTO pd = findProductByPcode(104);
		if(pd != null) {
			System.out.printf("%d %s %d \n", pd.getP_code(),pd.getP_name(),pd.getP_price());
		}
		
		List<ProductDTO> list = findProductList();
		if(list.size() > 0) {
			
			for(ProductDTO product : list) {
				System.out.printf("%d %s %d \n", product.getP_code(),product.getP_name(),product.getP_price());
			}
		}
		
	}

	
	public static ProductDTO findProductByPcode(int pCode) { //단일 조회
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String db_id = "scott";
		String db_pw = "tiger";
		
		//연결준비
		Connection conn = null;		 //DB 연결
		PreparedStatement psmt = null;
		ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
		
		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ProductDTO pd = null;
		
		//쿼리 준비
		String sqlQuary = "select * from product where p_code = ? ";
		
		
		try {
			
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuary);
			
			psmt.setInt(1, pCode);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) { 
				
				pd = new ProductDTO();
				
				pd.setP_code(rs.getInt("p_code"));
				pd.setP_name(rs.getString("p_name"));
				pd.setP_price(rs.getInt("p_price"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 종료
		try {
			if(rs != null) {
			rs.close();
			}
			if(psmt != null) {
			psmt.close();
			}
			if(conn != null) {
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pd;
	}

	
public static List<ProductDTO> findProductList() { //복수 리스트 조회
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	//DB 연결 정보
	String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
	String db_id = "scott";
	String db_pw = "tiger";
	
	//연결준비

	Connection conn = null;		 //DB 연결
	PreparedStatement psmt = null;
	ResultSet rs = null;			
	
	//DB 연결 
	try {
		conn = DriverManager.getConnection(db_url,db_id,db_pw);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	List<ProductDTO> productList = new ArrayList<ProductDTO>();
	
	//쿼리 준비
	String sqlQuary = "select * from product"; //? 자리에 뭘 넣겠다가 됨
	
	try {
		
		psmt = conn.prepareStatement(sqlQuary); //객체가 만들어 지고 
		rs = psmt.executeQuery(); //실행함
		
		
		while(rs.next()) { 
			
			ProductDTO pd = new ProductDTO(rs.getInt("p_code"),rs.getString("p_name"),rs.getInt("p_price"));
			
			productList.add(pd);
			
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	//DB 연결 종료
	try {
		if(rs != null) {
		rs.close();
		}
		if(psmt != null) {
		psmt.close();
		}
		if(conn != null) {
		conn.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return productList;
	
	
	}
	
//	
//	public static void singleProduct(int p_code) {
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		
//		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
//		String db_id = "scott";
//		String db_pw = "tiger";
//		
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		
//		try {
//			conn = DriverManager.getConnection(db_url,db_id,db_pw);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		String sqlQuary = "select * from product where p_code = ?";
//		ProductDTO product = null;
//		
//		try {
//			psmt = conn.prepareStatement(sqlQuary);
//			psmt.setInt(1, p_code);
//			rs = psmt.executeQuery();
//			
//		if(rs.next()) {
//			product = new ProductDTO();
//			System.out.println(rs.getInt("p_code")); // 인덱스 1 로 시작함
//			System.out.println(rs.getString("p_name"));
//			System.out.println(rs.getString("p_price"));
//		}
//		
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//		
//		try {
//			if(rs != null) {
//			rs.close();
//			}
//			if(psmt != null) {
//			psmt.close();
//			}
//			if(conn != null) {
//			conn.close();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		}
//		
//	}
//	
//public static List<ProductDTO> findProductList() {
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		
//		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
//		String db_id = "scott";
//		String db_pw = "tiger";
//		
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		
//		try {
//			conn = DriverManager.getConnection(db_url,db_id,db_pw);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		String sqlQuary = "select * from product where p_code = ?";
//		ProductDTO product = null;
//		List<ProductDTO> productList = null;
//		
//		try {
//			psmt = conn.prepareStatement(sqlQuary);
//			rs = psmt.executeQuery();
//			
//			
//			
//		if(rs.next()) {
//			if(productList == null) {
//				productList = new ArrayList<ProductDTO>();
//			}
//			
//			ProductDTO prod = new ProductDTO(rs.getInt("p_code"),rs.getString("p_name"),rs.getString("p_price"));
////			System.out.println(rs.getInt("p_code")); // 인덱스 1 로 시작함
////			System.out.println(rs.getString("p_name"));
////			System.out.println(rs.getString("p_price"));
//			
//			productList.add(prod);
//		}
//		
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//		
//		try {
//			if(rs != null) {
//			rs.close();
//			}
//			if(psmt != null) {
//			psmt.close();
//			}
//			if(conn != null) {
//			conn.close();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		}
//		return productList;
//	}
}

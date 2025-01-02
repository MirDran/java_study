package study.db.sample.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class SampleMain {

	public static void main(String[] args) {
//		System.out.println("=====Dept=====");
//		selectDept();
//		System.out.println("=====prodeuct=====");
//		findProduct();
		
//		System.out.println("=====Dept2=====");
//		selectDept2();
		
//		findDeptByDeptno(40);
//		findDeptByDeptno(20);
//		
//		findDeptByDname("RESEARCH");
//		
//		findDeptByDname("OPERATIONS");
		
//		Dept d1 = findDeptByDeptno(30);
//		if(d1 != null) {
//			System.out.println(d1.getDeptno()+" "+d1.getDname()+" "+ d1.getLoc());	
//		}
//		
		List<Dept> dList = findDeptList();
		
		if(dList != null && dList.size() >0) { // Data 있음
			
			for(Dept d : dList) {
				System.out.println(d.getDeptno()+" "+d.getDname()+" "+ d.getLoc());	
			}
		}
		
//		if(dList.size() == 0) {} //이렇게 부르려면 Null이 아니아여햠
		
	
	}
	
	
	public static void findProduct() {
		
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

		//sql 관련이라 임포트는 sql관련으로
		Connection conn = null;		 //DB 연결
//		Statement stmt = null;		 // 연결(connection)하여 sql 명령을 실행 해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
		
		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//쿼리 준비
		String sqlQuary = "select * from product";
		
		try {
			
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuary);
			rs = psmt.executeQuery();
			
//			if(rs.next()) e데이터 하나
			while(rs.next()) { //데이터가 여러개 일 때 다음 읽어올 데이터가 있는가? 있으면 true
//				System.out.println(rs.getInt(1)); // 인덱스 1 로 시작함
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
				
				System.out.println(rs.getInt("p_code")); // 인덱스 1 로 시작함
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getString("p_price"));
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
		
		
	}
	
	//					readDept 혹은 findDept(단일)  findDeptList(여러개)라는 이름을 많이 쓴다
	public static void selectDept() {
		
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

		//sql 관련이라 임포트는 sql관련으로
		Connection conn = null;		 //DB 연결
//		Statement stmt = null;		 // 연결(connection)하여 sql 명령을 실행 해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
		
		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//쿼리 준비
		String sqlQuary = "select * from dept";
		
		try {
			
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuary);
			rs = psmt.executeQuery();
			
//			if(rs.next()) e데이터 하나
			while(rs.next()) { //데이터가 여러개 일 때 다음 읽어올 데이터가 있는가? 있으면 true
//				System.out.println(rs.getInt(1)); // 인덱스 1 로 시작함
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
				
				System.out.println(rs.getInt("deptno")); // 인덱스 1 로 시작함
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
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
		
		
	}



public static void selectDept2() {
	
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

	//sql 관련이라 임포트는 sql관련으로
	Connection conn = null;		 //DB 연결
//	Statement stmt = null;		 // 연결(connection)하여 sql 명령을 실행 해주는 객체
	PreparedStatement psmt = null;
	ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
	
	//DB 연결 
	try {
		conn = DriverManager.getConnection(db_url,db_id,db_pw);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	//쿼리 준비
	String sqlQuary = "select * from dept where deptno = 30";
	
	try {
		
		//쿼리 실행 후 데이터 후속 처리
		psmt = conn.prepareStatement(sqlQuary);
		rs = psmt.executeQuery();
		
//		if(rs.next()) e데이터 하나
		if(rs.next()) { //데이터가 여러개 일 때 다음 읽어올 데이터가 있는가? 있으면 true
			
			System.out.println(rs.getInt("deptno")); // 인덱스 1 로 시작함
			System.out.println(rs.getString("dname"));
			System.out.println(rs.getString("loc"));
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
	
	
}

public static Dept findDeptByDeptno(int deftno) {
	
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

	//sql 관련이라 임포트는 sql관련으로
	Connection conn = null;		 //DB 연결
//	Statement stmt = null;		 // 연결(connection)하여 sql 명령을 실행 해주는 객체
	PreparedStatement psmt = null;
	ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
	
	//DB 연결 
	try {
		conn = DriverManager.getConnection(db_url,db_id,db_pw);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	//쿼리 준비
	String sqlQuary = "select * from dept where deptno = ? "; //? 자리에 뭘 넣겠다가 됨
	Dept dept = null;
	
	try {
		
		//쿼리 실행 후 데이터 후속 처리
		psmt = conn.prepareStatement(sqlQuary); //객체가 만들어 지고 
		
		//실행하기 전에 파라미터 셋팅
		psmt.setInt(1, deftno); //앞쪽에는 몇번째 ?가 하나라서 첫번째라 1번 뒤는 셋팅할 값
		//숫자라서 setInt
		
		rs = psmt.executeQuery(); //실행함
		
		
		
		
//		if(rs.next()) e데이터 하나
		if(rs.next()) { //데이터가 여러개 일 때 다음 읽어올 데이터가 있는가? 있으면 true
			
//			System.out.println(rs.getInt("deptno")); // 인덱스 1 로 시작함
//			System.out.println(rs.getString("dname"));
//			System.out.println(rs.getString("loc"));
			dept = new Dept();
			dept.setDeptno(rs.getInt("deptno"));
			dept.setDname(rs.getString("dname"));
			dept.setLoc(rs.getString("loc"));
			
//			return dept; //여기서 리턴하면 여기서 메소드가 여기서 끝남
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally { //무조건 실행하고 끝나기에 위에 리턴이 있어도 됨
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
	}
	
	return dept;
}




public static void findDeptByDname(String Dname) {
	
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

	//sql 관련이라 임포트는 sql관련으로
	Connection conn = null;		 //DB 연결
//	Statement stmt = null;		 // 연결(connection)하여 sql 명령을 실행 해주는 객체
	PreparedStatement psmt = null;
	ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
	
	//DB 연결 
	try {
		conn = DriverManager.getConnection(db_url,db_id,db_pw);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	//쿼리 준비
	String sqlQuary = "select * from dept where dname = ? "; //? 자리에 뭘 넣겠다가 됨
	
	try {
		
		//쿼리 실행 후 데이터 후속 처리
		psmt = conn.prepareStatement(sqlQuary); //객체가 만들어 지고 
		
		//실행하기 전에 파라미터 셋팅
//		psmt.setInt(1, deftno); //앞쪽에는 몇번째 ?가 하나라서 첫번째라 1번 뒤는 셋팅할 값
		psmt.setString(1, Dname);
		//숫자라서 setInt
		
		rs = psmt.executeQuery(); //실행함
		
//		if(rs.next()) e데이터 하나
		if(rs.next()) { //데이터가 여러개 일 때 다음 읽어올 데이터가 있는가? 있으면 true
			
			System.out.println(rs.getInt("deptno")); // 인덱스 1 로 시작함
			System.out.println(rs.getString("dname"));
			System.out.println(rs.getString("loc"));
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
	
	
}

public static List<Dept> findDeptList() {
	
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

	//sql 관련이라 임포트는 sql관련으로
	Connection conn = null;		 //DB 연결
//	Statement stmt = null;		 // 연결(connection)하여 sql 명령을 실행 해주는 객체
	PreparedStatement psmt = null;
	ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
	
	//DB 연결 
	try {
		conn = DriverManager.getConnection(db_url,db_id,db_pw);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	List<Dept> deptList = null;
	
	//쿼리 준비
	String sqlQuary = "select * from dept"; //? 자리에 뭘 넣겠다가 됨
	
	try {
		
		//쿼리 실행 후 데이터 후속 처리
		psmt = conn.prepareStatement(sqlQuary); //객체가 만들어 지고 
		
		//실행하기 전에 파라미터 셋팅
//		psmt.setInt(1, deftno); //앞쪽에는 몇번째 ?가 하나라서 첫번째라 1번 뒤는 셋팅할 값
//		psmt.setString(1, Dname);
		//숫자라서 setInt
		
		rs = psmt.executeQuery(); //실행함
		
//		if(rs.next()) e데이터 하나
		while(rs.next()) { //데이터가 여러개 일 때 다음 읽어올 데이터가 있는가? 있으면 true
			
			if(deptList == null) {
				deptList = new ArrayList<Dept>();
			}
			
			Dept dept = new Dept(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
			deptList.add(dept);
			
			
//			System.out.println(rs.getInt("deptno")); // 인덱스 1 로 시작함
//			System.out.println(rs.getString("dname"));
//			System.out.println(rs.getString("loc"));
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
	
	
	return deptList;
	
}


}


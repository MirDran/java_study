package study.db.sample.v2;

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

		DeptDAO deptDAO = new DeptDAO();
		
		deptDAO.removeDept(81);
		
		int r1=deptDAO.removeDept(81);
		if(r1 > 0) {
			System.out.println("삭제 잘됨");
		}
		
		Dept dd = new Dept(82, null, null);
		int r2 = deptDAO.removeDept(dd);
		if(r2 > 0) {
			System.out.println("삭제 잘됨");
		}
		
		/*
		List<Dept> saveList = new ArrayList<Dept>();
		saveList.add(new Dept(81,"이름1","지역1"));
		saveList.add(new Dept(82,"이름2","지역2"));
		saveList.add(new Dept(83,"이름3","지역3"));
		
		int count = 0;
		for(Dept d : saveList) {
			int result = deptDAO.saveDept(d);
			count += result;
			if(result > 0)
				System.out.println("저장 잘됨");
		}
		
		System.out.println("총 "+ count + "개 저장됨");
		
		*/
//		Dept newD = new Dept();
//		newD.setDeptno(90);
//		newD.setDname("개발팀");
//		newD.setLoc("서울");	
//		
//		int result = deptDAO.saveDept(newD);
//		if(result > 0) {
//			System.out.println("데이터 저장 성공");
//		}
		
		
		
		List<Dept> dList = deptDAO.findDeptList();
		
		if(dList != null && dList.size() >0) {
			
			for(Dept d : dList) {
				System.out.println(d.getDeptno()+" "+d.getDname()+" "+ d.getLoc());	
			}
		}
		
		ProductDAO productDAO = new ProductDAO();
		List<Product> productList = productDAO.findProductList();
		
		for(Product p : productList) {
			System.out.println(p.toString());
		}
		
		
		
		
	
	}
	
	
	
	
	//					readDept 혹은 findDept(단일)  findDeptList(여러개)라는 이름을 많이 쓴다
	public static void selectDept() {
		
		Connection conn = null;		 //DB 연결
		PreparedStatement psmt = null;
		ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
		
		conn=DBConnectionManager.connectDB();
		
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
		}finally {
			//DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
	}



public static void selectDept2() {

	Connection conn = null;		 //DB 연결
	PreparedStatement psmt = null;
	ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
	
	conn=DBConnectionManager.connectDB();
	
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
	}finally {
		//DB 연결 종료
		DBConnectionManager.disconnectDB(conn, psmt, rs);
	}
	
	
}






public static void findDeptByDname(String Dname) {
	
	Connection conn = null;		 //DB 연결
	PreparedStatement psmt = null;
	ResultSet rs = null;			 // sql 실행 결과 저장하는 객체c
	
	conn=DBConnectionManager.connectDB();

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
	}finally {
		//DB 연결 종료
		DBConnectionManager.disconnectDB(conn, psmt, rs);
	}
	
	
}


}


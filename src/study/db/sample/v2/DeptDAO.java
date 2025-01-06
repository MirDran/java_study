package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Data Access Object
public class DeptDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	
	// 83 이름3 지역3 을
	// 83 재무팀 부산 으로 고칠거임
	
//	public int modifyDept(int deptno, String dname, String loc) {
	public int modifyDept(Dept dept) {
			// modifyDept(deptno, "재무팀", "부산")
		
		conn = DBConnectionManager.connectDB();

		int result = 0;
		// 쿼리 준비
		String sqlQuary = " update dept "
						+ "set dname = ?, loc = ? "
						+ "where deptno = ? ";

		try {

			psmt = conn.prepareStatement(sqlQuary);

			

			psmt.setString(1,dept.getDname());
			psmt.setString(2,dept.getLoc());
			psmt.setInt(3,dept.getDeptno());

			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
			

	//saveDept(50,"개발팀","서울");
	
	// insert update delete -> 실행 후 적용된 행의 갯수로 인해 리턴값이 int
//	public int saveDept(int deptno, String dname, String loc) {
	public int saveDept(Dept dept) {
		
		conn = DBConnectionManager.connectDB();

		int result = 0;
		// 쿼리 준비
		String sqlQuary = " insert into dept (deptno, dname, loc) values(?,?,?) ";

		try {

			psmt = conn.prepareStatement(sqlQuary);

			rs = psmt.executeQuery(); // 실행함

			psmt.setInt(1,dept.getDeptno());
			psmt.setString(2,dept.getDname());
			psmt.setString(3,dept.getLoc());


			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	
	
	public List<Dept> findDeptList() { // select 조회

		// DB 연결
		conn = DBConnectionManager.connectDB();

		List<Dept> deptList = new ArrayList<Dept>();
		// 쿼리 준비
		String sqlQuary = "select * from dept";

		try {

			psmt = conn.prepareStatement(sqlQuary);

			rs = psmt.executeQuery();

			while (rs.next()) {

				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return deptList;

	}

	public int findDeptByDeptno(int deftno) {

		conn = DBConnectionManager.connectDB();

		int result = 0;
		// 쿼리 준비
		String sqlQuary = "select * from dept where deptno = ? ";
		Dept dept = null;

		try {

			psmt = conn.prepareStatement(sqlQuary);

			rs = psmt.executeQuery(); // 실행함

			psmt.setInt(1,dept.getDeptno());
			psmt.setString(2,dept.getDname());
			psmt.setString(3,dept.getLoc());


			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	
	public int removeDept(int deptno) {
		
		conn = DBConnectionManager.connectDB();

		int result = 0;
		// 쿼리 준비
		String sqlQuary = "delete from dept where deptno = ? ";

		try {

			psmt = conn.prepareStatement(sqlQuary);

			psmt.setInt(1, deptno);

			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
		
	}
	
	public int removeDept(Dept dept) {
		int deptno = dept.getDeptno();
		
		return removeDept(deptno);
	}
	
}

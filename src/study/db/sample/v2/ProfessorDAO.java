package study.db.sample.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.practice.moning_01_03.ProfessorDTO;


public class ProfessorDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	
	
	public  List<ProfessorDTO> findProfessorListByDeptno(int deptno) {
		
		conn = DBConnectionManager.connectDB();
		
		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();
		
		//쿼리 준비
		String sqlQuary = "select prono, name, id, position, pay, deptno "
				+ "TO_CHAR(horedate, 'YYYY-MM-DD') from professor where deptno = ? ";
		
		try {
			
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuary);
			
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) { // 
								
				
				//선생님 코드 
				ProfessorDTO pf = new ProfessorDTO();
				
				pf.setProfno(rs.getInt("profno"));
				pf.setName(rs.getString("name"));
				pf.setId(rs.getString("id"));
				pf.setPosition(rs.getString("position"));
				pf.setPay(rs.getInt("pay"));
				pf.setDeptno(rs.getInt("deptno"));
//				pf.setHiredate(rs.getDate("hiredate").toLocalDate());
//				rs.getTimestamp("hiredate"); //DB (Date, Timestamp)-> 값으로도 받을 수 있다.
				
				//Timestamp => s.getTimetamp
				ConvertDateUtill.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate"));
				// java.sql -> java.time.LocalDateTime으로 변경해야한다
				 //자바에서 주로 쓰는 데이트 타입은 아니다
				
				professorList.add(pf);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return professorList;
	}
}

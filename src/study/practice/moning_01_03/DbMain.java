package study.practice.moning_01_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DbMain {

	public static void main(String[] args) {
		
		List<ProfessorDTO> list = findProfessorListByDeptno(102);
		if(list.size() > 0) {
			
			for(ProfessorDTO pr : list) {
				// toString으로 가능
//				System.out.printf("%d %s %s %s %d %d\n",
//						pr.getProfno(),pr.getName(),pr.getId(),pr.getPosition(),pr.getPay()
//						,pr.getDeptno());
				
				System.out.println(pr.toString());
				
			}
		}
		

	}

	
	public static List<ProfessorDTO> findProfessorListByDeptno(int deptno) {
		
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
		Connection conn = null;	
		PreparedStatement psmt = null;
		ResultSet rs = null;			 
		
		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();
		
		//쿼리 준비
		String sqlQuary = "select * from professor where deptno = ? ";
		
		
		try {
			
			//쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuary);
			
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) { // 
								
				
				//선생님 코드 
				ProfessorDTO pf = new ProfessorDTO();
				//좀더 보기 명확하고 불러오는걸 확인 할 수 있다.
				//getter setter를 만들어 놓는것도 
				//이것을 하기 위한 조건
				pf.setProfno(rs.getInt("profno"));
				pf.setName(rs.getString("name"));
				pf.setId(rs.getString("id"));
				pf.setPosition(rs.getString("position"));
				pf.setPay(rs.getInt("pay"));
				pf.setDeptno(rs.getInt("deptno"));
				
				
				// 생성자를 만들 었을 경우 밑에 나의 코드
//			(rs.getInt("profno"),rs.getString("name"),rs.getString("id"),
//			rs.getString("position"),rs.getInt("pay"),rs.getInt("deptno"));
				
				//professorList 에 pf 한줄 (객체 하나)를 넣는다
				
				professorList.add(pf);
				
				
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
		
		return professorList;
	}
}
	


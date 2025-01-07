package study.practice_01_07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v2.ConvertDateUtill;
import study.db.sample.v2.DBConnectionManager;
import study.practice.moning_01_03.ProfessorDTO;

public class StudentDAO {
	
	//DB에 접근해서 정보를 읽어 오는 객체

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public List<StudentDTO> selectStudent() { //전체 조회 여러개 이므로 리스트
		//findStudentList
		

		List<StudentDTO> studList = new ArrayList<StudentDTO>();
		//리턴을 위해서 리스트 타입 만들어줌 

		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		String sqlQuary = " select * from student ";

		try {

			psmt = conn.prepareStatement(sqlQuary);
			rs = psmt.executeQuery();

			while (rs.next()) {

				StudentDTO stud = new StudentDTO();

				stud.setStudno(rs.getInt("studno"));
				stud.setName(rs.getString("name"));
				stud.setId(rs.getString("id"));
				stud.setGrade(rs.getInt("grade"));
				stud.setJumin(rs.getString("jumin"));
				stud.setBirthday(rs.getDate("birthday").toLocalDate());
				stud.setTel(rs.getString("tel"));
				stud.setHeight(rs.getInt("height"));
				stud.setWeight(rs.getInt("weight"));
				stud.setDeptno1(rs.getInt("deptno1"));
				stud.setDeptno2(rs.getInt("deptno2"));
				stud.setProfno(rs.getInt("profno"));

				studList.add(stud);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studList;
	}

	public List<StudentDTO> findStudentListByGrade(int grade) {

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> studList = new ArrayList<StudentDTO>();

		// 쿼리 준비
		String sqlQuary = "select *"
				+ "from student where grade = ? ";

		try {
			
			// 쿼리 실행 후 데이터 후속 처리
			psmt = conn.prepareStatement(sqlQuary);

			psmt.setInt(1, grade);

			rs = psmt.executeQuery();

			while (rs.next()) { //

				// 선생님 코드
				
				StudentDTO stud = new StudentDTO();

				stud.setStudno(rs.getInt("studno"));
				stud.setName(rs.getString("name"));
				stud.setId(rs.getString("id"));
				stud.setGrade(rs.getInt("grade"));
				stud.setJumin(rs.getString("jumin"));
				stud.setBirthday(rs.getDate("birthday").toLocalDate());
				stud.setTel(rs.getString("tel"));
				stud.setHeight(rs.getInt("height"));
				stud.setWeight(rs.getInt("weight"));
				stud.setDeptno1(rs.getInt("deptno1"));
				stud.setDeptno2(rs.getInt("deptno2"));
				stud.setProfno(rs.getInt("profno"));

				studList.add(stud);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studList;
	}

}

package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.sample.v2.DBConnectionManager;
import study.db.sample.v2.Dept;

public class ArplDAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public int saveArplInfo(ArplInfo arplInfo) {

		conn = DBConnectionManager.connectDB();

		int result = 0;
		// 쿼리 준비
//		String sqlQuary = " insert into ARPLINFO values ( (select NVL (MAX(ARPLNO),0) +1"
//				+ "from ARPLINFO), ?, ?, ?, ?, ?, ?) ";

		
		String sqlQuary = " insert into ARPLINFO values ( arplinfo_pk_seq.nextval , ?, ?, ?, ?, ?, ?) ";
		
		try {
			
			
			
			psmt = conn.prepareStatement(sqlQuary);

			//파라미터 셋팅
			psmt.setString(1, arplInfo.getInformCode());
			psmt.setString(2, arplInfo.getActionKnack());
			psmt.setString(3, arplInfo.getInformCause());
			psmt.setString(4, arplInfo.getInformData());
			psmt.setString(5, arplInfo.getInformGrade());
			psmt.setString(6, arplInfo.getImageUrl1());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

}

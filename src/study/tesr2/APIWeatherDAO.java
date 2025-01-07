package study.tesr2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.api.ArplInfo;
import study.db.sample.v2.DBConnectionManager;

public class APIWeatherDAO {

	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int resultCode;
	String resultMsg;
	
	/*
	 * 
	CREATE TABLE WEATHERINFO(
    weatherno  NUMBER Primary key,
    resultCode varchar2(64),
    resultMsg varchar2(1024),
	);
	
	
	Create SEQUENCE weatherno_pk_seq
	start with 1
	increment by 1
	nocycle;
	 * */
	
	
	
	public int saveWeatherInfo(ApiWeatherInfo apiWeatherInfo) {

		conn = DBConnectionManager.connectDB();

		int result = 0;
		
		String sqlQuary = " insert into WEATHERINFO values ( arplinfo_pk_seq.nextval , ?, ?) ";
		
		try {
			
			psmt = conn.prepareStatement(sqlQuary);

			//파라미터 셋팅
			psmt.setInt(1, apiWeatherInfo.getResultCode());
			psmt.setString(2, apiWeatherInfo.getResultMsg());

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

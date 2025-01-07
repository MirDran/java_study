package study.tesr2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ApiWeatherInfo {

	

	int resultCode;
	String resultMsg;
	
	
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	@Override
	public String toString() {
		return "ApiWeatherInfo [resultCode=" + resultCode + ", resultMsg=" + resultMsg + "]";
	}
	
	
	
		
	
}

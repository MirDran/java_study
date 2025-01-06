package study.api;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
	public static void main(String[] args) {

		List<ArplInfo> arplList = null;
		try {
		arplList = ArplApiService.forecastDustArplInfoList("2024-12-11");
	
		
			//json -> 자바 arplInfo 객체로 변환 완료
			for (ArplInfo info : arplList) {
				System.out.println(info.toString());
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		ArplDAO arplDAO = new ArplDAO();
		
		int count = 0;
		for(ArplInfo ai : arplList) {
			count += arplDAO.saveArplInfo(ai);
		}
		System.out.println(count + "개 저장 성공");
			
		//API -> 데이터 확보 -> 저장
		//누적해서 데이터를 계속 활용 하기 위해서는 
		//1번 기존 데이터 delete -> 새로 insert
		//2번 혹은 MERGE 처리
		
//		int resutl = arplDAO.saveArplInfo(arplList.get(0));
//		
		
	}
		
	
	//메소드 요청 응답 예시
	public String aprlDustInfoToday(int code) { // 100 or 200 or 300 으로 주면 그게 맞게 밑에 보내줌
		//요걸 기반 요런 형식 요청하면 리턴한다 형식으로 되어있다.
		if(code == 00) {
			return "오늘은 먼지가 깨끗합니다.";
		}else {return "잘못된 요청";}
		
	}
	
	
}
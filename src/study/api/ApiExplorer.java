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

		List<ArplInfo> arplList;
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
		
	}
		

	public static String convertValueToString(Object obj) {
		return obj == null ? " " : obj.toString();
	}
}
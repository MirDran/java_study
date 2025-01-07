package study.tesr2;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import study.api.ArplApiService;
import study.api.ArplDAO;
import study.api.ArplInfo;

public class APIWeatherMain {

	public static void main(String[] args) {



		APIWeatherDAO ApiDAO = new APIWeatherDAO();
		ApiWeatherInfo apList = new ApiWeatherInfo();
		List<ApiWeatherInfo> aList = null;
		
		try {
			aList = ApiExplorer.weatherInfoList("20250106");
			ApiDAO.saveWeatherInfo(apList);
			
				for (ApiWeatherInfo info : aList) {
					System.out.println(info.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		
		
		
	}	

}

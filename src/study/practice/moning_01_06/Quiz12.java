package study.practice.moning_01_06;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import study.api.ArplInfo;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}"
				;
		
		
		try {
			
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(str);
			//선생님 코딩
			JSONArray emplyees = (JSONArray)jsonObj.get("employees");
			
			for (int i = 0; i<emplyees.size(); i++ ) {
				JSONObject employee = (JSONObject) emplyees.get(i);
				
				System.out.println("id : " +employee.get("id"));
				System.out.println("name : " +employee.get("name"));
				System.out.println("position : " +employee.get("position"));
				System.out.println("salary : " +employee.get("salary"));
				
				JSONArray skills = (JSONArray) employee.get("skills"); // 스킬도 배열이기에
																	   //arr 추가
				
				System.out.println("skills : ");
				for(int j = 0; j <skills.size();j++) {
					System.out.println(skills.get(j) + " ");
				}
				System.out.println();
			}
			
			
			JSONObject company = (JSONObject) jsonObj.get("company");
			System.out.println(company.get("name"));
			System.out.println(company.get("address"));
			System.out.println(company.get("established"));
			
			JSONArray departments =(JSONArray) company.get("departments");
	
			for (int i = 0; i<departments.size(); i++ ) {
				JSONObject department = (JSONObject) departments.get(i);
				
				System.out.println("name : " +department.get("name"));
				
				System.out.print("employees : ");
				JSONArray emps = (JSONArray) department.get("employees");
				for(int j = 0; j <emps.size();j++) {
					System.out.println(emps.get(j) + " ");
				}
				System.out.println();
			}
			
			JSONArray projectsArr =(JSONArray) jsonObj.get("projects");
//			
			for (int i = 0; i<projectsArr.size(); i++ ) {
				JSONObject project = (JSONObject) projectsArr.get(i);
				
				System.out.println("title : " +project.get("title"));
				System.out.println("budget : " +project.get("budget"));
				
				
				JSONArray proj = (JSONArray) project.get("team");
				System.out.print("team : ");
				for(int j = 0; j <proj.size();j++) {
					System.out.println(proj.get(j) + " ");
				}
				System.out.println();
			}
			
			
			//밑은 내가 한 코딩
//			JSONArray employeesArr =(JSONArray) jsonObj.get("employees");
//			
//			
//			for (int i = 0; i<employeesArr.size(); i++ ) {
//				JSONObject item = (JSONObject) employeesArr.get(i);
////				System.out.println(">>> index : " + i);
//				
//				System.out.println(item.get("id"));
//				System.out.println(item.get("name"));
//				System.out.println(item.get("position"));
//				System.out.println(item.get("salary"));
//				System.out.println(item.get("skills"));
//			}
//			
//			JSONObject company = (JSONObject) jsonObj.get("company");
//			System.out.println(company.get("name"));
//			System.out.println(company.get("address"));
//			System.out.println(company.get("established"));
//			
//			JSONArray departmentsArr =(JSONArray) company.get("departments");
//			
//			for (int i = 0; i<departmentsArr.size(); i++ ) {
//				JSONObject item = (JSONObject) departmentsArr.get(i);
////				System.out.println(">>> index : " + i);
//				
//				System.out.println(item.get("name"));
//				System.out.println(item.get("employees"));
//			}
//			
//			JSONArray projectsArr =(JSONArray) jsonObj.get("projects");
//			
//			for (int i = 0; i<projectsArr.size(); i++ ) {
//				JSONObject item = (JSONObject) projectsArr.get(i);
////				System.out.println(">>> index : " + i);
//				
//				System.out.println(item.get("title"));
//				System.out.println(item.get("budget"));
//				System.out.println(item.get("team"));
//			}
//			

			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}

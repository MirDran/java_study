package study.practice.quiz.moning_01_07;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz13 {

	public static void main(String[] args) {
		
		try {
			
			CustomerDTO customerDTO = OrderApiService.orderInfo();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //json 포맷 텍스트
		//DTO로 정보를 가공해서 주면 밑에 DAO로 정보를 DB에 저장한다
		
		//가공하여  = Parse 분석 (Integer.parseInt Double.parseDouble) 등..
		//DB 저장하려면
		
		OrderDAO orderDAO = new OrderDAO();
		//orderDAO 이거 저장해라
		//DAO 가 DB관련 객체
		
	}
}
	
//	String str ="{\r\n"
//			+ "\"id\": 1,\r\n"
//			+ "\"name\": \"John Doe\",\r\n"
//			+ "\"contacts\": [\r\n"
//			+ "{\r\n"
//			+ "\"type\": \"email\",\r\n"
//			+ "\"value\": \"john.doe@example.com\"\r\n"
//			+ "},\r\n"
//			+ "{\r\n"
//			+ "\"type\": \"phone\",\r\n"
//			+ "\"value\": \"01023456789\"\r\n"
//			+ "}\r\n"
//			+ "],\r\n"
//			+ "\"address\": {\r\n"
//			+ "\"street\": \"123 Main Street\",\r\n"
//			+ "\"city\": \"Seoul\",\r\n"
//			+ "\"zipcode\": \"12345\"\r\n"
//			+ "},\r\n"
//			+ "\"orders\": [\r\n"
//			+ "{\r\n"
//			+ "\"orderId\": \"ORD-001\",\r\n"
//			+ "\"date\": \"2024-07-09\",\r\n"
//			+ "\"items\": [\r\n"
//			+ "{\r\n"
//			+ "\"id\": 1,\r\n"
//			+ "\"name\": \"Smartphone\",\r\n"
//			+ "\"quantity\": 2\r\n"
//			+ "},\r\n"
//			+ "{\r\n"
//			+ "\"id\": 2,\r\n"
//			+ "\"name\": \"Laptop\",\r\n"
//			+ "\"quantity\": 1\r\n"
//			+ "}\r\n"
//			+ "]\r\n"
//			+ "},\r\n"
//			+ "{\r\n"
//			+ "\"orderId\": \"ORD-002\",\r\n"
//			+ "\"date\": \"2024-07-10\",\r\n"
//			+ "\"items\": [\r\n"
//			+ "{\r\n"
//			+ "\"id\": 3,\r\n"
//			+ "\"name\": \"Headphones\",\r\n"
//			+ "\"quantity\": 1\r\n"
//			+ "}\r\n"
//			+ "]\r\n"
//			+ "}\r\n"
//			+ "]\r\n"
//			+ "}"
//			;
//	
	
	

//	try {
//		
//	JSONParser jsonParser = new JSONParser();
//	JSONObject jsonObj = (JSONObject) jsonParser.parse(str);
//	System.out.println(jsonObj.get("id"));
//	System.out.println(jsonObj.get("name"));
//	
//	JSONArray contacts =(JSONArray)jsonObj.get("contacts");
//	
//	for(int i=0; i<contacts.size();i++) {
//		JSONObject contact =(JSONObject)jsonObj.get(i);
//		
//		System.out.println(contact.get("type"));
//		System.out.println(contact.get("value"));
//	}
//	
//	JSONObject address = (JSONObject)jsonObj.get("address");
//	System.out.println(address.get("street"));
//	System.out.println(address.get("city"));
//	System.out.println(address.get("zipcode"));
//	
//	JSONArray orders =(JSONArray)jsonObj.get("orders");
//	
//	for(int i=0; i<orders.size();i++) {
//		JSONObject order =(JSONObject)orders.get(i);
//		
//		System.out.println(order.get("orderId"));
//		System.out.println(order.get("date"));
//		
//		
//		JSONArray items = (JSONArray) order.get("items");
//		for(int j=0; j<items.size();i++) {
//			JSONObject item =(JSONObject)items.get(i);
//			
//			System.out.println(item.get("id"));
//			System.out.println(item.get("name"));
//			System.out.println(item.get("quantity"));
//		}
//		
//	}
//	
//	}catch (ParseException e){
//		e.printStackTrace();
//	}finally {
//		


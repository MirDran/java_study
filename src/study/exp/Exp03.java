package study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {
		Sample s = new Sample();
		
		try {
		s.addItem1("하나");
		} catch (Exception e) {
			System.out.println("main에서 하나 예외처리");
		}
		
		try {
		s.addItem2("둘");
		} catch (Exception e) {
			System.out.println("main에서 둘 예외처리");
		}
//		
//		s.addItem1("1");
//		s.addItem2("2");
//		s.addItem3("3");
		
		try {
			s.addItem3("3");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("main에서 addItem3 호출 후 예외 처리");
		}
		
		try {
			s.addItem4("4");
		} catch(NullPointerException e) {
			
		}
		
		s.addItem2("저장");
		System.out.println(s.list.get(0));
		System.out.println(s.list.get(1));
		
		try {
		s.addItem5("55");
		} catch (Exception e) {
			System.out.println("main에서 addItem5에 throw e 처리");
		}
		
		
		int result = s.addItem6("66");
		if(result == 1) {
			//정상 상황
		}else { //if result -1
			// 예외 상황
		}
		
		
	
		try {
			s.addItem7("77");
		} catch (InvalidParameterValueException | ListFullException e) {// or 둘 중에 하나 면 이거다
			//하나로 처리할꺼면 Exception 으로 처리
			e.printStackTrace();
		}
		
		try {
			s.addItem7("77"); //서라운드 개별로 
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
			
		} catch (ListFullException e) {
			e.printStackTrace();
			
		}
		
	}
}


class Sample{
	
	
	List<String> list;
	
	void addItem1(String s) {
		list.add(s);
	}
	
	void addItem2(String s) {
		try {
		list.add(s); //예외 발생
		} catch (Exception e){
			System.out.println("Sample addItem2 에서 예외 처리 ");
			
			if(list == null) {
				list = new ArrayList<String>();
				list.add(s);
			}
		}
	}
	
	void addItem3(String s) throws Exception {
		list.add(s);
	}
	
	void addItem4(String s) throws NullPointerException{
		list.add(s);
	}
	
	void addItem5(String s) throws Exception {
		
		try {
//			list.add(s); //예외 발생
			list.get(10);
			} catch (Exception e){
				System.out.println("Sample addItem5 에서 예외 처리 "); //쓰로우가 없으면 그냥 진행
				throw e; // 예외를 던진다 - 예외를 발생시킨다.
		}
	}
	
	int addItem6(String s) {
		
		try {
			list.add(s);
		} catch(Exception e) {
			//오류 상황
			return -1; // 예외 발생
		}
		
		return 1; //1 반환 : 정상
		
		// return 1 or 2 or 3 정상이라고 지정 가능
		// Exception -1 예외상황 발생 이라고 전달 용 가능
	}
	
	void addItem7(String s) throws InvalidParameterValueException,ListFullException {
		
		if(s == null) {// || || || or
			throw new InvalidParameterValueException();
		}
		
		try {
		list.add(s);
		} catch (Exception e) {
			//new list [10] = list[10] 저장시도
			throw new ListFullException();
		}
		
	}
}

class ListFullException extends Exception { } //상속을 예외로 둬서 사용 가능

class InvalidParameterValueException extends Exception {} //유효하지 않는 값





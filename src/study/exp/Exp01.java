package study.exp;

import java.util.Scanner;

public class Exp01 {
	//Exception 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp tt = null; // 널 포인트 인셉션 발동
						// 언체크드 인셉션  실행 전까지는 예외인지 모름
		if(tt != null) {
		tt.t= 10; //변수 만 선언하고 초기화를 하지 않음
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		
//		int in = scanner.nextInt();
		
		String s = scanner.nextLine();
		
		int n = 0;
		try {
			System.out.println("parseInt 전");
			n = Integer.parseInt(s); // 오류 나는 순간 바로 catch 로 넘어감
			System.out.println("parseInt 후");
		} catch (Exception e) { //
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("여기 finally");
		}
		System.out.println("입력한 숫자는 : " + n);
		
		try {
			Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class Temp{
	int t;
}
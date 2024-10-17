package study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		System.out.println(num);
		System.out.println(num == 10); // true false로 대답
		// == 같다 비교연산자 
		
		scanner.nextLine(); // 남은 엔터까지 입력 받음 
		//위에 있는 int의 10 \n 중 \n 청소용
		
		String str = scanner.nextLine();
		
		System.out.println(str);	//밥
		System.out.println(str == "밥"); //문자열 비교는 equals()를 사용.
		
		System.out.println(str.equals("밥"));
		System.out.println("밥".equals(str)); // 반대도 가능
		
		

	}

}

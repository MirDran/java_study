package study.var;

import java.util.Scanner;
//java 패키지 안에 util 안에 Scanner; 가지고 온 것

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);
	
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print(s);
		
		int hour = 10;
		int minute = 26;
		//현재 10시 26분 입니다.
		System.out.println("현재 " + hour + "시 " + 
		minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute);
		
		double rate = 1.181523;
		
		System.out.printf("%.2f %%\n", rate);
		
		Scanner scanner = new Scanner(System.in);
		//하나의 셋업 위쪽에 import java.util.Scanner; 생김
		
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine(); //"아무거나 입력"
		System.out.println(input);
		
		System.out.println("당신이 입력한 값 은 : " + input);
		System.out.printf("당신이 입력한 값 은 :\n %s\n", input);
		
		System.out.print("점수를 입력하세요 : ");
		int point = scanner.nextInt();
					//scanner.next Line Int Double etc...
		
		
		
	}

}

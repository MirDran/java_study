package study.practice;

import java.util.Scanner;

public class A_10_22_moning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
//		System.out.print("출생년도를 입력하세요 : ");
//		int year = scanner.nextInt();
//		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
//		int number = scanner.nextInt();
//		
//		int today = 2024;
//		int age = today - year +1;
//			
//		if(year != 0) {
//			
//			if(year < 2000 && number == 1) {
//				System.out.println(age + "살 " + "남성 입니다.");
//			}else if
//			(year >= 2000 && number == 3) {
//				System.out.println(age + "살 " + "남성 입니다.");
//			}else if
//			(year < 2000 && number == 2) {
//				System.out.println(age + "살 " + "여성 입니다.");
//			}else if
//			(year >= 2000 && number == 4) {
//				System.out.println(age + "살 " + "여성 입니다.");
//			}else {System.out.println("잘못된 입력 입니다.");
//			}
//		
//		}
		// 밑은 선생님
		
		System.out.println("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.println("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		//SSN
		//RRN
		int number = scanner.nextInt();
		
//		if(year >= 1901 && year <=2024) {
//		else {
//		} 연도 제한 (살아있는 사람 기준)
		
		int age = 2024 - year +1; 
		
		if( year < 2000 && number == 1) {
			System.out.println(age + "살 남성 입니다.");
		}else if( year < 2000 && number == 2) {
			System.out.println(age + "살 여성 입니다.");
		}else if( year >= 2000 && number ==3 ) {
			System.out.println(age + "살 남성 입니다.");
		}else if( year >= 2000 && number == 4) {
			System.out.println(age + "살 여성 입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
			
		
		if((year < 2000 && (number == 1 || number == 2))
				||
			((year >= 2000 && (number == 3 || number == 4)))){
			
			if(number == 1 || number == 3) {
				System.out.println(age + "살 남성 입니다.");
			}
			
			if(number == 2 || number == 4) {
				System.out.println(age + "살 여성 입니다.");
			}
			
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
		
		
		
	}// main end

}

package study.practice;

import java.util.Scanner;

public class A_10_21_quiz02_EX_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = scanner.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("윤년 O");
		}else if (year%100 == 0) {
			System.out.println("윤년 X");
		}else if(year%4 == 0) {
			System.out.println("윤년 O");
		}else {System.out.println("윤년 x");
	}
		//방식 2
//		if(year%4 == 0) {
//			
//			if(year%400 == 0) {
//				System.out.println("윤년 O");
//			}else {
//				if(year%100 ==0) {
//					System.out.println("윤년 x");
//				}else {
//					System.out.println("윤년 O");
//				}
//			}			
//		}else {
//			System.out.println("윤년 x");
//		}
		
		//방식 3 
//		if(year % 400 == 0 || (year%4==0 && year%100!=0) )
//		if(year % 400 == 0 || (year%4==0 && !(year%100==0)) ){
//			System.out.println("윤년 o");
//		}else {
//			System.out.println("윤년 x");
//		}
		
		// for / while 반복
		
		//단순 횟수만 반복 vs 연산 (실행문)
		// 문제 12345 랑 11111
		//i는 출력 x j만 출력
		System.out.println("=======================");
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("======================");
		// 11111
		
		for(int i = 1; i <=5; i++) {
			System.out.println(11111*i);
		}
		
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(i);
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}

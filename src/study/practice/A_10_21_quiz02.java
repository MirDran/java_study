package study.practice;

import java.util.Scanner;

public class A_10_21_quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("연도를 입력하세요 : ");
//		int num = scanner.nextInt();
//			if(num % 400 == 0 || num % 4 == 0) {
//				System.out.println("윤년 이다.");
//			}else if(num % 100 == 0) {
//				System.out.println("윤년 아니다.");
//			}else System.out.println("윤년 아니다");
// 	2100년 윤년이다 라고 나옴
//		
			System.out.println("연도를 입력하세요 : ");
			int num1 = scanner.nextInt();
				if(num1 % 400 == 0) {
					System.out.println("윤년 이다.");
				}else if(num1 % 100 == 0) {
					System.out.println("윤년 아니다.");
				}else if(num1 % 4 == 0) {
					System.out.println("윤년 이다.");
				}else System.out.println("윤년 아니다");

		

			System.out.println();
			System.out.println();
			System.out.println();
			
		
		
		
		
		
		
		
		
//		//1.
//		12345	
//		12345	
//		12345	
//		12345	
//		12345	
//		
			
		int i = 1;
		int j = 0;
		
		for(i=1;i<=5;i++) {
			j= 1;
			System.out.print(j);
			int a;
			a = j+1;
			System.out.print(a);
			int b;
			b = j+2;
			System.out.print(b);
			int c;
			c = j+3;
			System.out.print(c);
			int d;
			d = j+4;
			System.out.print(d);
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		while(true) {

			for(i=1;i<=5;i++) {
				j= 1;
				System.out.print(j);
				int a;
				a = j+1;
				System.out.print(a);
				int b;
				b = j+2;
				System.out.print(b);
				int c;
				c = j+3;
				System.out.print(c);
				int d;
				d = j+4;
				System.out.print(d);
				System.out.println();
			}
			if(i == 6) {
				break;
			}
		}
		
		System.out.println();
		
		
//		
//		
////
////		//2.
////		11111
////		22222
////		33333
////		44444
////		55555
//		
		for(i=1; i<=5;i++) {
			
			j = i*(11111);
			System.out.println(j);
		}
	
		System.out.println();
		System.out.println();
		
		
		while(true) {

			for(i = 1; i<=5; i++)
			System.out.println(i*11111);
			
			if(i == 6) {
				break;
			}
		}
		
		
		
			}		
	}



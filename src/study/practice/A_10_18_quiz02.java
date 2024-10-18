package study.practice;

import java.util.Scanner;

public class A_10_18_quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("삼각형의 밑변 입력 : ");
		double wid = scanner.nextDouble();
		System.out.println("입력한 밑변  : " + wid);
		System.out.print("삼각형의 높이 입력 : ");
		double hei = scanner.nextDouble();
		System.out.println("입력한 높이  : " + hei);
		double trd = (wid * hei) / 2 ;
		System.out.printf("삼각형의 넓이 = %.2f",trd);
		
		//System.out.println("삼각형의 넓이는" + (wid*hei/2.0) or 
		// ((double)wid*hei/2) + "입니다";
		
		
		System.out.println(" ");
		System.out.println(" ");

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
		
		System.out.print("사다리꼴의 윗변 입력 : ");
		double uwid = scanner.nextDouble();
		System.out.println("입력한 윗변  : " + wid);
		System.out.print("사다리꼴의 밑변 입력 : ");
		double dwid = scanner.nextDouble();
		System.out.println("입력한 밑변  : " + hei);
		System.out.print("사다리꼴의 높이 입력 : ");
		double hei2 = scanner.nextDouble();
		System.out.println("입력한 높이  : " + hei);
		double total = (uwid * dwid) * hei2 / 2 ;
		System.out.printf("사다리꼴의 넓이 = %.2f",total);
		
		System.out.println(" ");
		System.out.println(" ");

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.

		int snac = 100;
		int human = 24;
		int eat = snac / human;
		int ath = snac % human;
		System.out.printf("한명당 받는과자 %d 남은 과자 %d", eat, ath);
		
		System.out.println(" ");
		System.out.println(" ");

		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		// 내가 한 것
//		System.out.print("입력 : ");
//		int number = scanner.nextInt();
//		System.out.println(number);
//		
//		int don = number % 10 ;
//		int ten = (number % 100) - (number % 10) ;
//		int hund = (number % 1000) - (number % 100) ;
//		
//		System.out.println("백의자리 : " + hund /100 );
//		System.out.println("십의자리 : " + ten / 10  );
//		System.out.println("일의자리 : " + don );
		
		System.out.println("세자리 정수 입력 : ");
		int num = scanner.nextInt();
		
		// 158 
		// 158 / 100 = 1.58-> 1
		// 158 % 100 = 58 / 10 = 5.8 -> 5
		// 158 / 10 = 15.8 -> 15 %10 -> 5
		// 158 % 10 = 8
		
		System.out.println("백의자리 : " + num / 100);
		System.out.println("십의자리 : " + ( num / 10 % 10 ));
		System.out.println("일의자리 : " + num % 10);
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println(" ");


		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		int c = x;
		x = y;
		y = c;

		System.out.println("x="+x+ " y="+y);
	}

}

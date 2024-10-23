package study.practice;

import java.util.Scanner;

public class A_10_23_quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		System.out.println("===홀짝====");
		
		System.out.print("정수를 입력하세요 : ");
		int number = scanner.nextInt();
		
		if(number%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		System.out.println();
		
		
		System.out.println("ex1");
		
		

//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		System.out.println("=====7배=====");

		System.out.println("7의배수 를 입력하세요 : ");
		int num7 = scanner.nextInt();
		
		if(num7 % 7 == 0) {
			System.out.println("7의 배수입니다.");
		}else {
			System.out.println("아닙니다.");
		}
		
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		System.out.println("=======5배=======");
		
		int sum = 0;
		for(int i = 1; i<=1000;i++) {
			if(i%5 == 0) {
				sum = sum + i;
				if(i==1000) {
					System.out.println(sum);
				}
			}else continue;
		}
		
		//ver. 선생님
		sum = 0;
		for(int i=5; i<=1000; i=i+5) {
			sum = sum + 1;
		}
		// ver. 선생님
		sum=0;
		int y = 1;
		while(y<=1000) {
			if(y%5 == 0) {
				sum = sum + y;
				y++;
			}
		}
		
		
		System.out.println();
		System.out.println();
		
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
//			
//		int[] starArr = new int[50];
//		String str = "*";
//	
//		System.out.print("입력 : ");
//		int star = scanner.nextInt();
//		
//		
//		if(star >50 || star <0) {
//			System.out.println("잘못입력하셨습니다.");
//		}else {
//			for(int i=1;i<=star;i++)
//			System.out.print(str+"");
//		}
//		
		
		//ver. 선생님
		System.out.println("1~50 정수 입력 하세요 : ");
		int wjdtn = scanner.nextInt();
		
		for(int i=1; i<=wjdtn; i++) {
			System.out.print("*");
		}
		
		
		System.out.println();
		System.out.println();
//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4
		
		System.out.println("======홀수 짝수=====");
		
		int add = 0;
		
		for(int i = 1; i<=10; i++) {
			
			if(i%2 == 0) {
				add = add + 1;
			}else {
				add = add - 1;
			}
			
		}System.out.print("결과 : " + (add));
		
				
		//ver. 선생님
//		
//		int wjatn = 1-2+3-4+5-6+7-8+9-10;
//		System.out.println(wjatn);
		
		int wjatn = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				wjatn = wjatn -1;
			}else {
				wjatn = wjatn -1;
			}
		}
		
		
		wjatn = 0;
		for(int i=1; i<=10; i=i+2) { //홀수
			wjatn = wjatn +i;
		}
		
		wjatn = 0;
		for(int i=1; i<=10; i=i+2) { //짝수
			wjatn = wjatn -i;
		}
		
		System.out.println();
		System.out.println();
		
	
		
//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		System.out.println("======1000보다=====");
		int h = 0;
		for(int i = 0; i <2000; i++) {
			h = h + i;
			
			if(h > 1000) {
				System.out.println(h);
				break;
			}
		}
		
//		//ver. 선생님
//			
//		
//		
//		int total = 0;
//		int l = 1;
//		
//		while(total<1000) {
//			total = total+l;
//					l++;
//		}
//		
//		
//		while(total<1000) {
//			total = total+l;
//					l++;
////				if(total >= 1000) {
////					break;
//				}
//		}
		
//		System.out.println("누적 값 : " + total);
		
		
		
			
				System.out.println();
				System.out.println();
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		System.out.println("======99단======");
		System.out.print("몇단까지 할까요?");
		int gugu = scanner.nextInt();
		
		
		for(int i=1;i<=gugu;i++) {
			System.out.println(i+"단");
			for(int z=1;z<=9;z++) {
				System.out.println(i+"*"+z+"="+i*z);
			}
			}
		
		
		
		//ver. 선생님
		

		System.out.print("몇단까지 할까요?");
		int rneks = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d * %2d = %3d\n",rneks,i,rneks*i );
		}
		
		
		
		
		
	}

}

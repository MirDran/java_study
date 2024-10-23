package study.practice;

import java.util.Scanner;

public class A_10_23_quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
		System.out.println("=======1번문제=======");
		
		for(int x=0 ; x<=10 ; x++){
			  
			for(int y=0 ; y<=10 ; y++ ){
			   
				if(2*x+4*y==10)
			     System.out.println("x="+x+", y="+y);
			 }
		 }
		// 위 방식은 0부터 시작이라 0도 포함함
		//.ver 선생님
		//2x + 4y = 10
		// 2+ 8 =10	\x:1 y:2
		// 6+4 =10 	x:3 y:1
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				//x y
				if(2*x+4*y==10) {
					System.out.printf("(x:%d y:%d)\n",x,y);
				}
			}
		}
		
		
		
		
		System.out.println();
		System.out.println();

//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수
		System.out.println("=======2번문제=======");
		
		System.out.print("입력1 : " );
		int num1 = scanner.nextInt();
		System.out.print("입력2 : " );
		int num2 = scanner.nextInt();
		int anser;
		if(num1 < num2) {
			anser = num2 - num1;
		}else {
			anser = num1 - num2;
		}
		System.out.println(anser);
		
		
		//ver. 선생님
		System.out.print("입력1 : " );
		int num11 = scanner.nextInt();
		int num21 = scanner.nextInt();
		if(num11 > num21) {
			System.out.printf("%d - %d =%d\n",num11,num21,num11-num21);
		}else {
			System.out.printf("%d - %d =%d\n",num11,num21,num21-num11);
		}
		
		

		System.out.println();
		System.out.println();
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		System.out.println("=======3번문제=======");
	
	
		System.out.print("첫번째 윷 입력 : " );
		int min1 = scanner.nextInt();
		System.out.print("두번째 윷 입력 : " );
		int min2 = scanner.nextInt();
		System.out.print("세번째 윷 입력 : " );
		int min3 = scanner.nextInt();
		System.out.print("네번째 윷 입력 : " );
		int min4 = scanner.nextInt();
		int sum = 0 + min1+min2+min3+min4;
		if(sum == 0) {
			System.out.println("결과 : 모");
		}else if(sum == 1) {
			System.out.println("결과 : 도");
		}else if(sum == 2) {
			System.out.println("결과 : 개");
		}else if(sum == 3) {
			System.out.println("결과 : 걸");
		}else if(sum == 4) {
			System.out.println("결과 : 윷");
		}else {
			System.out.println("다시 던지세요");
		}
		
		int y1, y2, y3, y4;
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();

//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
		
		System.out.println("=======4번문제=======");
		
		
		System.out.print("입력 : ");
		int star = scanner.nextInt();
		
		
		for(int i=1;i<=star;i++) {
			System.out.print("*");
		}
		
		//for(int i=0;i<=star;i++) {
		//System.out.print("*");
	//}
		
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
	}

}

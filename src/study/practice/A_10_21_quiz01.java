package study.practice;

public class A_10_21_quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	//1. i가 0~10번 11번 반복
//		
//		
//		for(int i = 1; i <= 11; i++) {
//			for(int k = 0; k <= 10 ;k++) {
//				System.out.println(k);
//			}
//		}
//		
//		
//	//i가 1~9로 9번 반복	
//		
//		for(int i = 1; i <= 9; i++) {
//			for(int k = 0; k <= 9 ;k++) {
//				System.out.println(k);
//			}
//		}
//		
//	//i가 10~100으로 10번 반복
//		
//		for(int i = 1; i <= 10; i++) {
//			for(int k = 10; k <= 100 ;k++) {
//				System.out.println(k);
//			}
//		}
//		
//		
//	//i가 25 50 75 100 해서 4번 반복	
//		
//		for(int i = 1; i <= 4; i++) {
//			for(int k = 0; k <= 100 ;k=k+25) {
//				System.out.println(k);
//			}
//		}
//		
//	//	while.
//	//	5) i가 50 ~ 55로 6번 반복
//		
//		int i = 50;
//		int k = 1;
//		
//		
//			while(i<=55) {
//				
//				System.out.println(i);
//				i++;
//				
//					
//					}
//				}
//
//		}
//
//		
//		6) i가 10 ~ 1로 10번 반복
//		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
//		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
//		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		
//반복문 샘플 연습
//출력은 반복되는 숫자(i) 를 출력

//		for.
//		1) i가 0~10으로 11번 반복
		
			for(int i=0; i<=10;i++) {
				System.out.print(i+" "); // 뒤 ""은 띄어쓰기
			}
 
 			System.out.println(); //줄바꿈
		
		
//		2) i가 1~9로 9번 반복
//		
 			
 			for(int i=1; i <=9; i++) {
 				System.out.print(i+" ");
 			}
 			
 			System.out.println( );
 			
 			
//		3) i가 10 ~ 100 으로 10번 반복
//		
 			
// 			for(int i=10; i<=100; i= i+10) {
// 				System.out.print(i+" ");
// 			}
 			
 			for(int i=1; i<=10; i++) {
 				System.out.print(i*10 +" ");
 			}
 			
 			System.out.println( );
 			
//		4) i가 25 50 75 100 해서 4번 반복
//		
 			for(int i = 25; i <= 100; i = i+25) {
 				System.out.print(i+" ");
 			}
 			System.out.println( );
//		
//		while.
//		5) i가 50 ~ 55로 6번 반복
 			
 			int i = 50;
 			while(i <= 55){
 				System.out.print(i+" ");
 				i++;
 			}
 			System.out.println( );
 			
 			
// 			i=50;
// 			while(true) {
// 				System.out.println(i+ " ");
// 				i++;
// 				
// 				if(i==55)
// 					break;
// 			}
 			
//		
//		6) i가 10 ~ 1로 10번 반복
 			
 			i = 10;
 			while(i >= 1){
 				System.out.print(i+" ");
 				i--;
 			}
 			System.out.println( );
//		
//		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
//		
 			i = 30;
 			while(i >= 0){
 				System.out.print(i+" ");
 				i = i-7; 
 			}
 			System.out.println( );
 			
//		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
//		
 			i = 30;
 			while(i >= 5){
 				System.out.print(i+" ");
 				i = i-5;
 			}
 			System.out.println( );
 			
//		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
//		
 			i = 25;
 			while(i >= 0){
 				System.out.print(i+" ");
 				i = i-5;
 			}
 			System.out.println( );
 			
//		
				
		
		
		
	}

}

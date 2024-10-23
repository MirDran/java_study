package study.practice;

import java.util.Scanner;

public class A_10_22_quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
		
//	
//		
		Scanner scanner = new Scanner(System.in);
	
		int result = 0;
		int[] number = new int[5];
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int fir = scanner.nextInt();
		number[0] = fir;
		System.out.print("두번째 숫자를 입력하세요 : ");
		int sec = scanner.nextInt();
		number[1] = sec;
		System.out.print("세번째 숫자를 입력하세요 : ");
		int thi = scanner.nextInt();
		number[2] = thi;
		System.out.print("네번째 숫자를 입력하세요 : ");
		int foh = scanner.nextInt();
		number[3] = foh;
		System.out.print("다섯번째 숫자를 입력하세요 : ");
		int fiv = scanner.nextInt();
		number[4] = fiv;
		System.out.print("몇번째 수 인가요? : ");
		int what = scanner.nextInt();
		
		if(what == 1) {
			result = number[what-1];
		}else if(what == 2) {
			result = number[what-1];
		}else if(what == 3) {
			result = number[what-1];
		}else if(what == 4) {
			result = number[what-1];
		}else if(what == 5) {
			result = number[what-1];
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		System.out.print("결과 : "+ result);
		
		
		
		System.out.println();
		System.out.println();
		
//
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		

		int result2 = 0;
		int[] number2 = new int[5];
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int fir2 = scanner.nextInt();
		number[0] = fir2;
		System.out.print("두번째 숫자를 입력하세요 : ");
		int sec2 = scanner.nextInt();
		number[1] = sec2;
		System.out.print("세번째 숫자를 입력하세요 : ");
		int thi2 = scanner.nextInt();
		number[2] = thi2;
		System.out.print("네번째 숫자를 입력하세요 : ");
		int foh2 = scanner.nextInt();
		number[3] = foh2;
		System.out.print("다섯번째 숫자를 입력하세요 : ");
		int fiv2 = scanner.nextInt();
		number[4] = fiv2;
		
		System.out.print("결과 : "+number[4] +" "+number[3] +" "
				+number[2] +" "+number[1] +" "+number[0] +" ");

		
		System.out.println();
		System.out.println();
		
			
		
		
		
//
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
		
		
		int[][]nArr1 = {{1,2,3,4},{5,6,7,8},{7,8,9,10},{11,12,13,14}};
		
		for(int i=0;i<nArr1.length;i++) {
			
			for(int j = 0; j <nArr1[i].length; j++) {
				System.out.print(nArr1[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}

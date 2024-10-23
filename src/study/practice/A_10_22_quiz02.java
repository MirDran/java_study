package study.practice;

import java.util.Scanner;

public class A_10_22_quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
//
//	System.out.print("국어의 점수를 입력 하세요 : ");
//	int lan = scanner.nextInt();
//	System.out.print("수학의 점수를 입력 하세요 : ");
//	int math = scanner.nextInt();
//	System.out.print("영어의 점수를 입력 하세요 : ");
//	int eng = scanner.nextInt();
//	
//	int sum = lan + math + eng;
//	double avg = (double)sum / 3;
//	
//	if(!(lan>=40 && math >=40 && eng>=40 && avg >= 60)) {
////		System.out.println("실행 화면 1");
//		System.out.println("국어점수 : "+lan);
//		System.out.println("수학점수 : "+ math);
//		System.out.println("영어점수 : "+eng);
//		System.out.println("불합격입니다.");
//			
//	}
////	
////	
//
//	if(lan>=40 && math >=40 && eng>=40 && avg >= 60) {
////		System.out.println("실행 화면 2");
//		System.out.println("국어점수 : "+lan);
//		System.out.println("수학점수 : "+ math);
//		System.out.println("영어점수 : "+eng);
//		System.out.println("국어 : "+lan);
//		System.out.println("수학 : "+ math);
//		System.out.println("영어 : "+eng);
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
//		System.out.println("축하합니다, 합격입니다!");
//	}
//	
//	
	
	System.out.print("국어점수 :" );
	int lang = scanner.nextInt();
	
	System.out.print("수학점수 :" );
	int math = scanner.nextInt();
	
	System.out.print("영어점수 :" );
	int eng = scanner.nextInt();
	
	int total = lang + math + eng;
	double avg = (double)total / 3 ;
	
	if( lang>=40 && math>=40 && eng>=40 && avg>=60) {
		//합격
		System.out.println("국어 : " + lang);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다. 합격입니다!");
	}else {
		//불합격
		System.out.println("불합격입니다.");
	}
	
	if( lang<40 || math<40 || eng<40 || avg<60) {
		//불합격
		System.out.println("불합격입니다.");
	}else {
		//합격
		System.out.println("국어 : " + lang);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다. 합격입니다!");
	}
	
	
	
	}// main end

}

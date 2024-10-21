package study.practice;

import java.util.Scanner;

public class A_10_18_quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

		Scanner scanner = new Scanner (System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int num = scanner.nextInt();
//		
//		if (num > 0 && num <= 6) {
//			System.out.println("오전 입니다.");
//			System.out.println("이른 오전 입니다.");
//		} else if(num >= 7 && num <= 12){
//			System.out.println("오전 입니다.");
//			System.out.println("늦은 오전 입니다.");
//		} else if(num >= 13 && num <=18) {
//			System.out.println("오후 입니다.");
//			System.out.println("이른 오후 입니다.");
//		} else if(num >= 19 && num <= 24) {
//			System.out.println("오후 입니다.");
//			System.out.println("늦은 오후 입니다.");
//		} else if(num < 0 || num > 24) {
//			System.out.println("잘못 입력 하셨습니다.");
//		} else {
		//	System.out.println("정수를 입력하세요.");
//		}
		
		//else 로 끝내는게 좋다.
		// 실행은 해야 하므로 
//		
		System.out.println(" ");
		System.out.println(" ");
		
		
		int time = scanner.nextInt();
		
		if( time >= 1 && time <= 24) {
			if( time <=12) { //1~12
				//오전
				// 이른 / 늦은
				System.out.println("오전 입니다.");
				if( time <=6 ) {
					
					System.out.println("이른 오전입니다.");
				} else {
					System.out.println("늦은 오전 입니다.");
				}
			} else { // 13~24
				//오후
				// 이른 / 늦은
				System.out.println("오후 입니다.");
				if( time <= 18){
					System.out.println("이른 오후 입니다.");
				} else {
					System.out.println("늦은 오후 입니다.");
				}
			}			
			//정상범위	
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		

		System.out.println(" ");
		System.out.println(" ");
		
		

		//2번 아래 코드를 if문으로 변경

		int diceNum = 3; //주사위 수 1~6

		// if문 변환
		
		if (diceNum == 1) {
			System.out.println("1");
		} else if (diceNum == 2) {
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 5) {
			System.out.println("5");
		} else if (diceNum > 1 || diceNum > 5) {
			System.out.println("6");
		} 
		// 이것도 else로 걸어버리면 된다
		// 끝나는건 else!
		

		
		System.out.println(" ");
		System.out.println(" ");
		
//		switch(diceNum) {
//		case 1: // diceNum == 1
//		System.out.println("1");
//		break;
//		case 2:
//		System.out.println("2");
//		break;
//		case 3:
//		System.out.println("3");
//		case 4:
//		System.out.println("4");
//		case 5:
//		System.out.println("5");
//		break;
//		default:
//		System.out.println("6");
//		case 6:
//		}



		//3번 아래 코드를 swtich 문으로 변경

//		int localNum = 041 ;
//		// switch 문으로 변경
//		if ( localNum.equals("031") ){
//		System.out.println("경기도입니다");
//		}
//		if ( localNum.equals("02") ){
//		System.out.println("서울입니다.");
//		}
//		if ( localNum.equals("041") ){
//		System.out.println("충남입니다");
//		}
//		if ( localNum.equals("051") ){
//		System.out.println("부산입니다");
//		}
		
		String localNum = "02" ;
		
		switch(localNum) {
		case "031" :
		System.out.println("경기도입니다");
		break;
		case "02" :
		System.out.println("서울입니다");
		break;
		case "041" :
		System.out.println("충남입니다");
		break;
		case "051" :
		System.out.println("부산입니다");
		break;
		}
		
		System.out.println(" ");
		System.out.println(" ");

		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.
//
//		if( score >= 90) {
//		System.out.println("학점 A");
//		} else if ( score >= 80) {
//		System.out.println("학점 B");
//		} else if (score >= 70) {
//		System.out.println("학점 C");
//		} else if (score < 70) {
//		System.out.println("학점 F");
//		}
		System.out.print("학점을 입력 하세요 : ");
		int score = scanner.nextInt();
		
		
		// 100 / 10 = 10.0 -> 10
		// 99 / 10 = 9.9 -> 9
		// 75 / 10 = 7.5 -> 7
		
		//int score10 = score/10;
		
		switch( score/10 ) {
			case 10:
			case 9:
				System.out.println("학점 A");
				break;
			case 8 :
				System.out.println("학점 B");
				break;
			case 7 :
				System.out.println("학점 C");
				break;
			default:
					System.out.println("학점 F");
					break;
		}
		
		
		
		
		switch(score) {
			case 100 :
			case 99 :
			case 98 :
			case 97 :
			case 96 :
			case 95 :
			case 94 :
			case 93 :
			case 92 :
			case 91 :
			case 90 :
				System.out.println("학점 A");
				break;
			case 89 :
			case 88 :
			case 87 :
			case 86 :
			case 85 :
			case 84 :
			case 83 :
			case 82 :
			case 81 :
			case 80 :
				System.out.println("학점 B");
				break;
			case 79 :
			case 78 :
			case 77 :
			case 76 :
			case 75 :
			case 74 :
			case 73 :
			case 72 :
			case 71 :
			case 70 :
				System.out.println("학점 C");
				break;
			default:
				System.out.println("학점 F");
				break;
				
				
				// 예전에는 안되었지만 
				// 버전 높은곳은 case100, case99 : 등이 가능함
				// 다만 낮은곳의 경우 적용이 안되므로 주의!
				
		}
		
	}

}

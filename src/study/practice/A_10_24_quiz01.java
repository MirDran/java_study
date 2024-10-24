package study.practice;

import java.util.Scanner;

public class A_10_24_quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int sell = 0;
		
//		while(true) {
//
//		
//			System.out.println("1. 입력");
//			System.out.println("2. 수정");
//			System.out.println("3. 조회");
//			System.out.println("4. 삭제");
//			System.out.println("5. 종료");
//			System.out.print("메뉴 번호를 입력하세요 : ");
//			sell = scanner.nextInt();
//	
	//		if(sell == 1) {
	//			System.out.println("입력 메뉴 입니다.");
	//			System.out.println();
	//		}else if(sell == 2) {
	//			System.out.println("수정 메뉴 입니다.");
	//			System.out.println();
	//		}else if(sell == 3) {
	//			System.out.println("조회 메뉴 입니다.");
	//			System.out.println();
	//		}else if(sell == 4) {
	//			System.out.println("삭제 메뉴 입니다.");
	//			System.out.println();
	//		}else if(sell <=0 || sell >5 ) {
	//			System.out.println("잘못 입력하셨습니다.");
	//			System.out.println();
	//		}else if(sell == 5) {
	//			System.out.println("프로그램이 종료 됩니다.");
	//			System.out.println();
	//		}
//		
//	}
		
		
		
		//ver. 선생님
		
		String[] menuArr = {"입력", "수정","조회","삭제","종료"};
		
		while(true) {	
	 
			for(int i=0;i<menuArr.length;i++) {
				//: 0 1 2 3 4
				// 1 2 3 4
				//menuArr[i] 값에 접근
				System.out.printf("%d. %s\n", (i+1),menuArr[i]);
			}
			System.out.print("메뉴 번호를 입력하세요 : ");
			int menu = scanner.nextInt();
			
			if(menu >=1 && menu <=4) {
				System.out.println(menuArr[menu-1]+" 메뉴입니다.");
			}else if(menu == 5) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
			
			
			
			
//			---------------------------------------------
			
//			System.out.println("1. 입력");
//			System.out.println("2. 수정");
//			System.out.println("3. 조회");
//			System.out.println("4. 삭제");
//			System.out.println("5. 종료");
//			System.out.print("메뉴 번호를 입력하세요 : ");
//			int menu = scanner.nextInt();
//			
//			if(menu ==1) {
//				System.out.println("입력 메뉴 입니다.");
//			}else if(menu == 2) {
//				System.out.println("수정 메뉴 입니다.");
//			}else if(menu == 3) {
//				System.out.println("조회 메뉴 입니다.");
//			}else if(menu == 4) {
//				System.out.println("삭제 메뉴 입니다.");
//			}else if(menu == 5){
//				System.out.println("프로그램을 종료 합니다.");
//				break;
//			}else {
//				System.out.println("잘못 입력 하셨습니다.");
//			}
			
			/*
			if(menu >=1 && menu <=5 ) {
				if(menu ==1) {
					System.out.println("입력 메뉴 입니다.");
				}else if(menu == 2) {
					System.out.println("수정 메뉴 입니다.");
				}else if(menu == 3) {
					System.out.println("조회 메뉴 입니다.");
				}else if(menu == 4) {
					System.out.println("삭제 메뉴 입니다.");
				}else {
					System.out.println("프로그램을 종료 합니다.");
					break;
				}
				
			}else {
				System.out.println("잘못 입력 하셨습니다.");
			}*/
			System.out.println();
		
 }
		
	}//main end

}// class end


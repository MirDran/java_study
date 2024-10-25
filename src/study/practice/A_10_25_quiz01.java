package study.practice;

import java.util.Scanner;

public class A_10_25_quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
	
		/*
		String[] menu = {"아메리카노","카페라떼","바닐라라떼"};
		int[] price = {3500, 4100, 4300};
		int[] menusel = new int [10];
		int[] add = new int [10];
		int count = 1;
		while(true) {
			System.out.println("===========메뉴========");
			System.out.println("1. 아메리카노   	3500원");
			System.out.println("2. 카페라떼     	4100원");
			System.out.println("3. 바닐라라떼   	4300원");
			System.out.println("======================");
			System.out.print("메뉴 선택 : ");
			int input = scanner.nextInt();
			for(int i=0; i<count;i++) {
			menusel[i] = input;}
			System.out.print("수량 선택 : ");
			int input1 = scanner.nextInt();
			for(int i=0; i<count;i++) {
			add[i] = input1;}
			System.out.print("추가주문 하시겠습니까?(y/n) : ");
			String clear = scanner.nextLine();
			String more = scanner.nextLine();
			
				if(more.equals("y")||more.equals("Y")) {
					count = count +1;
					continue;
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
			
				if(more.equals("n")||more.equals("N")) {
					System.out.println("=======================");
					for(int i=0; i <= count ; i++) {
						System.out.println(menu[i]+" "+add[i]+"잔 : "+ (price[i] * add[i])+"원");
					}
				
					System.out.println("=======================");
					break;
				}*/
					
			
			
		//ver. sense
		// 기본타입 개별 계산
		/*
		int menu;
		int count;
		String addOrder;
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		while(true) {
			
			System.out.println("=========메뉴=========");
			System.out.println("1.아메리카노 	   3500원");
			System.out.println("2.카페라떼 	   4100원");
			System.out.println("3.바닐라라떼 	   4300원");
			System.out.println("=====================");		
			
			System.out.print("메뉴 선택 : "); // 1, 2, 3 
			menu = scanner.nextInt();
			if(menu == 1 || menu == 2 || menu == 3 ) {
				
				System.out.print("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1)
					menu1Count += count; // menu1Count = menu1Count + count
				if(menu == 2)
					menu2Count += count;
				if(menu == 3)
					menu3Count += count;
				
				
				scanner.nextLine(); //입력값 청소용
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine();
				if(addOrder.equals("y")||addOrder.equals("n")) 
					break;
					else
						System.out.println("잘못입력했습니다. 다시 입력하세요");
				
			}
				//잘못된 입력, 정상입력
				
				//y 진행
				
				if(addOrder.equals("n")){
					//입력받는 반복문 끝
					//주문한 메뉴 보여주고
					//아메 몇개 * 가격
					if(menu1Count>0) // 주문 안했을 경우 (0이므로) 안보이게
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					//라떼 몇개 * 가격
					if(menu2Count>0)
					System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					//바닐라 몇개 * 가격
					if(menu3Count>0)
					System.out.printf("바닐라라떼 %d잔 : %d원\n",menu3Count, menu3Count*4300);
					//누적합 계산 -> 총액 ->총 금액 보여주기 -> 끝.
					int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("총액 : "+total+"원");
					break;
				}
			}else {
					System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
			
		
		}
		*/
		
		//배열 활용
		
		int menu;	//몇번 메뉴 입력
		int count;	// 몇개 주문
		String addOrder; // y/n
		
		String[] menuArr = {"아메리카노","카페라떼","바닐라라떼"}; //메뉴 이름
		int[] priceArr = {3500,4100,4300}; //메뉴 가격
		
		int[] countArr = new int[menuArr.length]; //메뉴 주문 수
		
		while(true) {
			
			while(true) {
			System.out.println("=========메뉴=========");
			for(int i=0; i<menuArr.length;i++) { //0~
				//1. 메뉴이름 메뉴 가격
				//2. 메뉴이름 메뉴 가격
				//3. 메뉴이름 메뉴 가격
				System.out.printf("%d.%-8s	%d원\n",i+1,menuArr[i],priceArr[i]);
			} //메뉴판
			/*System.out.println("1.아메리카노 	   3500원");
			  System.out.println("2.카페라떼 	   4100원");
			  System.out.println("3.바닐라라떼 	   4300원");*/
			
			System.out.println("=====================");		
			
			System.out.print("메뉴 선택 : "); // 1, 2, 3 
			menu = scanner.nextInt();
			if((menu >= 1 && menu <= menuArr.length)) {
				break;
			}else {
				System.out.println("잘못입력했습니다. 다시 입력하세요.");
			}
			//1~3 정상인 경우
//			if( !(menu >= 1 && menu <= menuArr.length)) {
//				continue;
//			}
			}// 내부 while 종료

			
			System.out.print("수량 선택 : ");
			count = scanner.nextInt(); //몇개

			countArr[menu-1] += count; // 수량 증가 시키기
			
			//추가주문 여부
			
			scanner.nextLine();
			while(true) {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine();
				System.out.println();
				
				if(addOrder.equals("y")||addOrder.equals("n")) 
					break;
					else
						System.out.println("잘못입력했습니다. 다시 입력하세요");
				
			}
			int total = 0;
			if(addOrder.equals("n")){
				//입력받는 반복문 끝
				//주문한 메뉴 보여주고
				//아메 몇개 * 가격
				
				for(int i=0;i<menuArr.length;i++) {
					
					
					if(countArr[i]> 0) {
						System.out.printf("%s %d잔 : %d원\n",menuArr[i],countArr[i],countArr[i]*priceArr[i]);
						total = total + (countArr[i]*priceArr[i]);
					}
				}
				// total 총액 저장
				System.out.println("=====================");	
				System.out.println("총액 : "+ total + "원");
				break;
			}
			
			
			//				scanner.nextLine(); //입력값 청소용
//			while(true) {
//				System.out.print("추가 주문하시겠습니까?(y/n) : ");
//				addOrder = scanner.nextLine();
//				if(addOrder.equals("y")||addOrder.equals("n")) 
//					break;
//					else
//						System.out.println("잘못입력했습니다. 다시 입력하세요");
//				
//			}
//				//잘못된 입력, 정상입력
//				
//				//y 진행
//				
//				if(addOrder.equals("n")){
//					//입력받는 반복문 끝
//					//주문한 메뉴 보여주고
//					//아메 몇개 * 가격
//					if(menu1Count>0) // 주문 안했을 경우 (0이므로) 안보이게
//					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
//					//라떼 몇개 * 가격
//					if(menu2Count>0)
//					System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
//					//바닐라 몇개 * 가격
//					if(menu3Count>0)
//					System.out.printf("바닐라라떼 %d잔 : %d원\n",menu3Count, menu3Count*4300);
//					//누적합 계산 -> 총액 ->총 금액 보여주기 -> 끝.
//					int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
//					System.out.println("총액 : "+total+"원");
//					break;
//				}
//			}else {
//					System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
//			}
			
		
		}
	}//main end
		
}//class end


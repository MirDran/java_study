package study.practice.practice12_27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	
	//필드
	
	List<Food> foods = new ArrayList<Food>();
	Scanner scanner = new Scanner(System.in);
	
	String truckName; //트럭이름 (매장 이름)
	int totalSales; // 총 매출액
	boolean isOpened; // 영업 중 여부
	List<Food> foodList; //판매하는 메뉴 음식 리스트
	
	public FoodTruck(String truckName)
	{
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(String name, int price) {
		foodList.add( new Food(name, price) ); // food 객체가 들어가야 한다 객체를 올린다.
	}
	
	public void startBusiness() {
		isOpened = true;
		System.out.println("영업 시작");
	
		while(isOpened) {
		
			System.out.println();
		System.out.println("메뉴 선택");
		System.out.println("1.메뉴보기  2.주문하기 3.재고관리 4.마감하기");
		System.out.print(">>>입력 : ");
		String input = scanner.nextLine();
		int menu;
		try {
			menu = Integer.parseInt(input);
		} catch (Exception e) {
			menu = 0; //오류 나면 메뉴 0이라고 함
		}
		
		switch(menu) {
		case 1: //메뉴보기
			//index : 0 1 2
//			//사용자 번호 1 2 3
//			for(Food f : foodList) {
//				System.out.println(f.getFoodInfo()); 
//			}
			for(int i = 0; i<foodList.size(); i++) {
				System.out.printf("[%d] %s\n",i+1,foodList.get(i).getFoodInfo());
			}
			break;
		case 2: //주문하기
			for(int i = 0; i<foodList.size(); i++) {
				System.out.printf("[%d] %s\n",i+1,foodList.get(i).getFoodInfo());
			}
			System.out.println(">>주문 메뉴를 선택하세요 : ");
			int orderMenu = scanner.nextInt();
			
			//주문 함 => 재고 처리
			
			// 예외처리 -> 숫자 범위를 벗어났나?, 잘못된 값이 입력 되었나?
			
			//조건 : 재고가 없으면 주문 불가 -> 해당 메뉴의 재고를 확인
			
			if(foodList.get(orderMenu-1).stock > 0) // 재고가 0보다 커야 주문 가능
			{
				//재고가 잇으면 ? 주문 1개 처리
				//주문 완료 정보 출력
				System.out.printf("[주문정보] %s 메뉴 1개 주문완료!\n",foodList.get(orderMenu-1).name );
				//private 면 getName 
				
				//재고-1개 처리
//				foodList.get(orderMenu-1).stock -= -1;
				foodList.get(orderMenu-1).modifyStock(-1);
				
				//매출액 중기
				totalSales += foodList.get(orderMenu-1).price;
				
			}else {
				System.out.println("[품절] 해당 메뉴는 품절입니다.");
			}
			
			
			break;
		case 3: //재고관리
			
			for(int i = 0 ; i <foodList.size(); i++) {
				System.out.printf("[%d] %s \n",i +1, foodList.get(i).getFoodInfo());
			}
			
			System.out.print(">>> 재고 관리할 메뉴를 선택하세요 : ");
			orderMenu = scanner.nextInt(); // 123
			
			System.out.println(">>> 재고 조정 개수를 입력하세요 ");
			int changeStockCount = scanner.nextInt(); // 추가 혹은 빼기 
			
			foodList.get(orderMenu-1).modifyStock(changeStockCount);
			System.out.println("[재고 적용 완료]");
			System.out.println(foodList.get(orderMenu-1).getFoodInfo());
			
			
			
			break;
		case 4: //마감하기
			//매출 /원가 차감 -> 최종 수익
			int lossSales = 0;
			for(Food food : foodList) {
				lossSales += (food.price * 0.3) * food.stock;
			}
			
			System.out.println("[마감 정보]");
			System.out.println(">>[총 메출] : " + totalSales);
			System.out.println(">>[폐기손해] : " + lossSales);
			System.out.println(">> [최종수익] : " + (totalSales - lossSales));
			
			isOpened = false;
			System.out.println("푸드트럭 영업 마감");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다\n");
			
		}
		}// while 끝
		
	}
	
	
	
	
//	
//	String name;
//	int price;
//	int stock;
//	int selNum;
//	
//	
//
//	
//	public void startBusiness() { // 장사 시작 프린트
//		System.out.println("장사 시작!");
//		
//		while(true) {
//			
//			System.out.println("1.메뉴보기  2.주문하기 3.재고관리 4.마감하기");
//			System.out.print("무엇을 하시겠습니까?");
//			int select = scanner.nextInt();
//			if(select == 1) {
//				theMenu();
//				continue;
//			}else if(select == 2) {
//				theMenu();
//				
//				System.out.println("무엇을 주문 하시겠습니까?");
//				int orderSelect = scanner.nextInt();
//				System.out.println();
//				System.out.println("몇개를 주문 하시겠습니까?");
//				int orderIndexSelect = scanner.nextInt();
//				System.out.println();
//				System.out.println(orderSelect+"번 메뉴 "+orderIndexSelect+"개 주문하였습니다.");
//				continue;
//			}else if(select == 3) {
//				System.out.println("어떤 메뉴의 재고를 추가 하시겠습니까?");
//				int stockSelect = scanner.nextInt();
//				System.out.println();
//				System.out.println("몇개를 주문 하시겠습니까?");
//				int stockIndexSelect = scanner.nextInt();
//				System.out.println(stockSelect+"번 메뉴 "+stockIndexSelect+"개 제고 추가 하였습니다.");
//				System.out.println();
//				continue;
//			}else if(select == 4) {
//				System.out.println("마감을 시작합니다.");
//				break;
//			}else {}
//			System.out.println("1~4번 사이를 선택해 주세요");
//			System.out.println();
//			continue;
//			
//		}
//		
//		
//	}
//	
//	
//	public void addMenu(String name, int price) { // 메뉴 추가 메소드
//		
//		this.name = name;
//		this.price = price;
//		foods.add(new Foods(this.name,this.price));
//	}
//	
//	public void theMenu() {
//		System.out.println();
//		System.out.println(foods);
//		System.out.println();
//	
//	}
//	
//	public void order() {
//		
//	}
//	
//	public void stock() {
//		
//	}
//	
//	public void deadLine() {
//		
//	}
	
	
	
} //FoodTruck

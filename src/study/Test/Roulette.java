package study.Test;

import java.util.Scanner;

public class Roulette {

	String machineName;
	String spotName;
	int totalPoint;
	int successCount;
	int failCount;
	int tryCount;
	int totalMoney;
	int rouletteRoom;
	int inputMoney;
	int selectGameMenu;
	boolean machineOn;
	boolean isRun;
	
	Roulette(String machineName, String spotName){
		this.machineName = machineName;
		this.spotName = spotName;
		this.totalPoint = 0;
		this.successCount = 0;
		this.failCount = 0;
		this.tryCount = 0;
		this.totalMoney = 0;
	}
	
	Scanner scanner = new Scanner(System.in);
	
	
	void startRoulette() {
		machineOn = true;
		
		while(machineOn) {
		
		selcetMenu();
		
		if(selectGameMenu == 1) {
			insertCoin();
			System.out.println();
		}else if(selectGameMenu == 2) {
			machineOn = false;
			isRun = true;
		}else if(selectGameMenu == 3) {
			if(tryCount > 0) {
				System.out.println("잔여횟수가 남았습니다.");
			}else {
			isRun = false;
			System.out.println("종합 소득 : "+totalMoney+"원");
			System.out.println("기계를 종료합니다.");
			machineOn = false;
			}
		}
	
		
		
		while(isRun) {
			
			int rouletteRoomNumber = (int)(Math.random()*6+1);
			
		switch(rouletteRoomNumber) {
			case 1:
				System.out.println("1점 성공");
				totalPoint += 1;
				successCount += 1;
				--tryCount;
				break;
			case 2:
				System.out.println("2점 성공");
				totalPoint += 2;
				successCount += 1;
				--tryCount;
				break;
			case 3:
				System.out.println("3점 성공");
				totalPoint += 3;
				successCount += 1;
				--tryCount;
				break;
			case 4:
				System.out.println("4점 성공");
				totalPoint += 4;
				successCount += 1;
				--tryCount;
				break;
			case 5:
				System.out.println("5점 실패");
				failCount += 1;
				--tryCount;
				break;
			case 6:
				System.out.println("6점 실패");
				failCount += 1;
				--tryCount;
				break;
			
			default :
					System.out.println("게임 종료");
					break;
					
			}
		
		if(tryCount == 0) {
			isRun = false;
			rouletteResult();
			machineOn = true;
		}
		
		}
		}
	}
	

	void insertCoin() {
		
		System.out.println("충전 금액을 입력하세요. (1000원 1회)");
		// 나중에 예외처리
		
		inputMoney = scanner.nextInt();
		if(inputMoney % 1000 != 0) {
			System.out.println("1000원 단위로 입력 해주세요.");
		}else if(tryCount > 1){
			System.out.println("이미 충전되어 있습니다");
		}else {
			System.out.printf("입력하신 금액은 %d원 입니다.\n",inputMoney);
			totalMoney += inputMoney;
			tryCount += inputMoney/1000;
			System.out.printf("전여 시도 횟수는 %d회 입니다.", tryCount);
			System.out.println();
		}
	}
	
	void rouletteResult() { //기기명, 지역명, 총매출 제외 리셋
		System.out.println("성공 횟수 : " + successCount);
		System.out.println("실패 횟수 : " + failCount);
		System.out.println("종합 점수 : " + totalPoint);
		this.totalPoint = 0;
		this.successCount = 0;
		this.failCount = 0;
		this.tryCount = 0;
		this.successCount = 0;
		this.failCount = 0;
	}
	
	void selcetMenu() {
		System.out.println("=====메뉴를 선택하세요.=====");
		System.out.println("1. 충전 2.게임시작 3.마감");
		System.out.print(">>>선택 : ");
		selectGameMenu = scanner.nextInt();
		
	}
	
}

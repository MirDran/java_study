package study.solo;

import java.util.Random;
import java.util.Scanner;

public class Yakyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		- 기본 문제
		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
		사용자의 입력도 1 ~10까지 이며,
		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
		해당 게임은 3아웃이면 종료됩니다.
		
		
		- 레벨 1
		1회부터 3회까지만 진행합니다.
		각 회는 3아웃 마다 회가 넘어가며, 회가 시작 할 때마다 0아웃으로 시작합니다.
				
				
		- 레벨 2
		9명의 타자(선수)를 등록합니다.
		각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
		9번 타자 다음 순서는 1번 타자로 9명이 로테이션 됩니다.
		
		1회차가 끝나는 기준이 3아웃입니다.
		타자(선수)는 1아웃이면 다음 선수로 넘어갑니다.
		타자가 안타를 쳐도, 출루 했다고 가정하고 다음 선수로 넘어갑니다.
		
		*/
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		//변수 선언 공간
		int pitcherBall; // 투수가 던진 공의 값
		int playerBall;  // 타자(사용자가)가 선택한 값
		int outCount = 0; //아웃 갯수
		
		//9명의 선수의 등록
		//9명 선수의 이름 배열		0~8 까지 가능
		String[] playerArr = {"A","B","C","D","E","F","G","H","I"};
//		String[] playerArr = new String[9];
//		배열 선언 후 , 각각 값 배정
		int playerIndex = 0; //선수 순번(차례)를 저장하는 변수
		
		
		//i : 회차를 의미
		for (int round= 1; round <=3; round++) {	//1회부터 3회차 까지 게임 진행
			
			System.out.println("============"+round+"회차 시작============");
			outCount = 0; // 회차 시작시 아웃 개수 0으로 시작 질문이 회가 시작할 떄 였으므로;
			
			while(true) { //1회차 (3아웃까지)
				
				//타자 입장 / 타순 및 타자명이 출력
				System.out.printf(">>> %d번 타자 %s 입장! <<<\n", (playerIndex+1),playerArr[playerIndex] );
				
				//투수가 던진 공 (1~10)
				pitcherBall = (int)(Math.random()*10)+1;
				
				//사용자 입력 (1~10)
				System.out.print("타자 입력(1~10) : ");
				playerBall = scanner.nextInt();
				
				//투수 및 사용자 플레이어 숫자 표기
				System.out.printf("투수:%d 플레이어:%d \n",pitcherBall, playerBall);
				
				//안타 or 아웃
				//투수공 == 사용자 입력 (안타) else 아웃
				if(pitcherBall == playerBall) {
					System.out.println("안타!");
				}else {
					outCount++;
					System.out.println("아웃!");
				}
				
				playerIndex++; //다음 선수로 인덱스 변경
				
				//9번 선수 다음은 1번선수
				//index : 8 다음은 0
				if(playerIndex == 9) {
					playerIndex=0;
				}
				
				//아웃 == 3개 게임 끝
				if( outCount == 3){
					System.out.println("============"+round+"회차 종료============");
					System.out.println();
//					outCount = 0; // 회차 종료시 아웃 개수 0으로 초기화
					break;
				}
			}//while문 종료
		}//for문 종료
		
		System.out.println("============게임종료============");
		
	}//main end

}// class end

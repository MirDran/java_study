package study.solo;

import java.util.Random;
import java.util.Scanner;

public class Solo_yakyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//게임 변수
		Random r = new Random(); //난수 생성
		Scanner s = new Scanner(System.in); // 입력

		int com1;
		int user;
		int out = 0;
		int over= 0;
		String[][] proArr = {{"기안","비안","수안"},{"마루","하루","시우"},{"요메","수네","스요"}};
		int[][] pNumArr = new int [3][3];
		double[][] recode = new double [3][3];
		int swing = 1;
		int hit = 0;
		int strike = 0;
		int bol = 0;
		int checkArr[] = {1,2,3,4}; //1루 2루 3루 홈   0 1 2 3
		int anta = 0; //안타 카운트용
		int homeCount = 0; // 점수용
		int base1,base2,base3,base4;
		int base = 0;
		
		while(over != 3){// 게임 전체 반복
			
			for(int j=0; j<3; j++) {
				for(int i=0; i<3; i++) {
					com1 = r.nextInt(1,101); //1-10 난수생성 , level 4 로인한 1-100
					
					
					if(over == 3) {break;}
					
					pNumArr[j][i]= (j*3)+(i+1); //숫자
					System.out.print(pNumArr[j][i]+"번 "+proArr[j][i]+"선수 ");
					System.out.println();
					
					System.out.println("타율 : " + recode[j][i]);
					
					
					
					//System.out.print("숫자 입력 : "); 	시뮬레이션으로 변경하여 
					//user = s.nextInt(); // 숫자 받기		대신 난수 설정
					user = r.nextInt(1,101); //level 4
					
					if(1<=com1&&com1<=20 || 50<=com1&&com1<=60||90<=com1&&com1<=100) {
						System.out.println("스트라이크");
						System.out.println();
						strike++;
						swing++;
						
						if(strike == 3) {
							out++;
							anta = 0;
							}
					}else if(com1 - user == 3 || user - com1 == 3 || bol == 4) { // level 4 이전 com1 == user
						System.out.println("안타");
						System.out.println();
						hit = 1;
						swing = 1;
						recode[j][i] = recode[j][i] + (hit/swing);
						strike = 0;
						bol = 0;
						anta++;	
						
						if(base == 0) {
							
						}
						
						if(anta == 1 ) {
							System.out.println(proArr[j][i]+" 선수 1루 도착");
							System.out.println();
						}else if(anta == 2) {
							System.out.println(proArr[j][i]+" 선수 2루 도착");
							System.out.println();
						}else if(anta == 3) {
							System.out.println(proArr[j][i]+" 선수 3루 도착");
							System.out.println();
						}else if(anta == 4) {
							System.out.println(proArr[j][i]+"선수 홈 도착");
							System.out.println();
							homeCount++;
						}else {
							System.out.println();
						}
						
						
					}else if(!(1<=com1&&com1<=20 || 50<=com1&&com1<=60||90<=com1&&com1<=100)||!(com1 - user == 3 || user - com1 == 3 || bol == 4)){ 
						System.out.println("볼");
						System.out.println();
						swing++;
						bol++;
					}else {
						System.out.println("아웃");
						System.out.println();
						hit = 0;
						recode[j][i] = recode[j][i]+(hit/swing);
						anta = 0;
						
						out++;
					}
					
			
					
					
					if(out == 3) {
						out = 0;
						over++;
						
						System.out.println(over+"회차 종료");
						System.out.println();
					}
				} // for end
			}//외부 for end
			System.out.println("게임 종료");
			System.out.println("총 점수 : "+homeCount);
			
			
			
			
			
			
			
			
			
			
		
		}//게임 전체 while end
	}// main end
}// class end

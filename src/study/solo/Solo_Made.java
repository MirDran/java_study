package study.solo;

import java.util.Random;
import java.util.Scanner;

public class Solo_Made{

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
		int anta = 0; //안타 카운트용
		int homeCount = 0; // 점수용
		int homeRun;
		int homeRunCrt = 0;
		int anta2 = 0;
		int anta3 = 0;
		int ruta;
		
		String base1 = " ";
		String base2 = " ";
		String base3 = " ";
		String base4 = " ";
		
		int[][] anArr = new int [3][3];
		int[][] boArr = new int [3][3];
		int[][] ouArr = new int [3][3];
		int[][] stArr = new int [3][3];		
		int[][] perArr = new int [3][3];
		
		int show = 0;
		
		while(over != 3){// 게임 전체 반복
			
			for(int j=0; j<3; j++) {
				for(int i=0; i<3; i++) {
					com1 = r.nextInt(1,101); //1-10 난수생성 , level 4 로인한 1-100
					
					
					if(over == 3) {break;}
					
					if(base1 == proArr[j][i]){//선수 스킵
						continue;
					}else if(base2 == proArr[j][i]) {
						continue;
					}else if(base3 == proArr[j][i]) {
						continue;
					}
					
					
					pNumArr[j][i]= (j*3)+(i+1); //숫자
					System.out.println("===================");
					System.out.print(pNumArr[j][i]+"번 "+proArr[j][i]+"선수 ");
					System.out.println();
					
					System.out.println("타율 : " + recode[j][i]);
					System.out.println("===================");
					if(show == 0) {
					System.out.println("안타 : "+ anArr[j][i]);
					System.out.println("볼넷 : "+ boArr[j][i]);
					System.out.println("아웃 : "+ ouArr[j][i]);	
					System.out.println("홈런 : "+ perArr[j][i]);
					System.out.println("===================");
					System.out.println();
					
					}
					
					//System.out.print("숫자 입력 : "); 	시뮬레이션으로 변경하여 
					//user = s.nextInt(); // 숫자 받기		대신 난수 설정
					user = r.nextInt(1,101); //level 4
					
					homeRun = r.nextInt(1,60);
					
					ruta = r.nextInt(1,100);
					
					if(!(1<com1&&com1<20 || 50<com1&&com1<60||90<com1&&com1<100) &&
					 com1 - user <= 3 &&  com1 - user > -3 || bol == 3) { // level 4 이전 com1 == user
//						System.out.println("안타");
//						System.out.println();
						
						if(bol == 3) {
							System.out.println("볼 안타");
							System.out.println();
						}
						

						if(bol !=3 && homeRun <= com1) {
							perArr[j][i] = +1;
							System.out.println();
							System.out.println("홈런");
							System.out.println();
							homeRunCrt++;
						}
						
							
						if(1<= ruta && ruta <= 70 && bol != 3 && !(homeRun <= com1)) {
							System.out.println("1루타");
							System.out.println();
						}else if(70<ruta && ruta <= 90 && bol != 3 && !(homeRun <= com1)) {
							System.out.println("2루타");
							System.out.println();
							anta2 = 2;
						}else if(90< ruta&& ruta <= 100 && bol != 3 && !(homeRun <= com1)) {
							System.out.println("3루타");
							System.out.println();
							anta3 = 3;
					}
						
						hit++;
						swing++;
						recode[j][i] = recode[j][i] + ((double)hit/swing); 
						strike = 0;
						bol = 0;
						anta++;	
						anArr[j][i] =  anta;
						show = 0;

					
						
						
						if(homeRunCrt == 1) {
							System.out.println();
							System.out.println("=========="+proArr[j][i]+" 선수 홈런==========");
							System.out.println();
							homeCount = homeCount + anta;
							homeRunCrt = 0;
							anta = 0;
							
							base1 = " ";
							base2 = " ";
							base3 = " ";
							base4 = " ";
							
						}else if(anta2 == 2) {
							
							anta2 = 0;
							
							System.out.println("2루타");
							
							if(base3 != " ") {
							base4 = base3;
							System.out.println(base4+"선수 홈 도착");
							base4 = " ";
							homeCount = homeCount + 1;}
							
							if(base2 != " ") {
							base4 = base2;
							System.out.println(base4+"선수 홈 도착");
							base4 = " ";}
							
							if(base2 != " ") {
							base3 = base1;
							homeCount = homeCount + 1;}
							
							if(base3 != " ") {
							System.out.println(base3+" 선수 3루 도착");}
							base2 = proArr[j][i];
							
							
							System.out.println(base2+" 선수 2루 도착");
							System.out.println();
							base4 = " ";
							anta = 2;
							
						}else if(anta3 == 3) {
							anta3 = 0;
							
							System.out.println("3루타");
							
							if(base3 != " ") {
							base4 = base3;
							System.out.println(base4+"선수 홈 도착");
							base4 = " ";
							homeCount = homeCount + 1;}
							
							if(base2 != " ") {
							base4 = base2;
							System.out.println(base4+"선수 홈 도착");
							base4 = " ";
							homeCount = homeCount + 1;}
							
							if(base1 != " ") {
							base4 = base1;
							System.out.println(base4+"선수 홈 도착");
							base4 = " ";
							homeCount = homeCount + 1;}
							
							base3 = proArr[j][i];
							System.out.println(base3+" 선수 3루 도착");
							System.out.println();
							base4 = " ";
							anta=3;
							
						}else if(anta == 1 ) { // base 로직
							
							System.out.println(proArr[j][i]+" 선수 1루 도착");
							base1 = proArr[j][i];
							System.out.println();
						}else if(anta == 2) {
							
							base2 = base1;
							System.out.println(base2+" 선수 2루 도착");
							
							base1 = proArr[j][i];
							System.out.println(proArr[j][i]+" 선수 1루 도착");
							
							System.out.println();
						}else if(anta == 3) {
							
							if(base2 != " ") {
							base3 = base2;
							System.out.println(base3+" 선수 3루 도착");}
							if(base1 != " ") {
							base2 = base1;
							System.out.println(base2+" 선수 2루 도착");}
							
							base1 = proArr[j][i];
							System.out.println(proArr[j][i]+" 선수 1루 도착");
							System.out.println();
						}else  {
							if(base3 != " ") {
							base4 = base3;
							System.out.println(base4+"선수 홈 도착");}
							if(base2 != " ") {
							base3 = base2;
							System.out.println(base3+" 선수 3루 도착");}
							if(base1 != " ") {
							base2 = base1;
							System.out.println(base2+" 선수 2루 도착");}
							base1 = proArr[j][i];
							homeCount = homeCount + 1;
							System.out.println(proArr[j][i]+" 선수 1루 도착");
							System.out.println();
							base4 = " ";
						}
						
						
					}else if(1<=com1&&com1<=20 || 50<=com1&&com1<=60||90<=com1&&com1<=100) {
						System.out.println(strike+1 + " 스트라이크");
						System.out.println();
						strike++;
						swing++;
						i--;
						show++;
						
						if(strike == 3) {
							out++;
							i++;
							ouArr[j][i] = out;
							System.out.println();
							System.out.println("=======아웃=======");
							System.out.println();
							bol = 0;
							show = 0;
							strike = 0;
							homeRunCrt = 0;
							}
						
					}else if(!(1<=com1&&com1<=20 || 50<=com1&&com1<=60||90<=com1&&com1<=100)&&!(com1 - user == 3 || user - com1 == 3 || bol == 4)){ 
						System.out.println();
						System.out.println(bol+1 +" 볼");
						System.out.println();
						swing++;
						bol++;
						boArr[j][i] = bol ;
						i--;
						show++;
					}else {
						System.out.println();
					}
					
			
					
					
					if(out == 3) {
						out = 0;
						anta = 0;
						bol = 0;
						over++;
						homeRunCrt = 0;
						
						base1 = " ";
						base2 = " ";
						base3 = " ";
						base4 = " ";
						System.out.println("========"+over+"회차 종료========");
						System.out.println();
					}
				} // for end
			}//외부 for end
		}//게임 전체 while end
		System.out.println("게임 종료");
		System.out.println("총 점수 : "+homeCount);
		
	}// main end
}// class end
package study.practice.practice_class;

import java.util.Random;
import java.util.Scanner;

public class Test_yakyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[][] sArr = new int [3][3];
		String[][] nArr = {{"카인","케인","알리"},{"모나","오비","닐라"},{"로이","세인","과인"}};
		double[][] aArr = new double [3][3];
		
		int count = 0; // 아웃 카운트
		int sie = 1; //회차
		int anta = 0; // 안타
		int swing = 1; // 타석
		int bol = 0; //볼
		int strike = 0; // 스트라이크
		
		while(true) {
			for(int j=0; j<3; j++) {
				for(int i=0; i<3; i++) {
					int tusu = random.nextInt(1,101); //투수 (공던지기) 1-10
					
					sArr[i][j] = i+1+j*3;
					System.out.println(sArr[i][j]+"번 "+ nArr[i][j]+ " 선수");// 선수 등장
					System.out.println("타율 : "+ aArr[i][j]);
					//System.out.print("공을 치세요 : ");
					//int user = scanner.nextInt(); // 공 치기
					
					int user = random.nextInt(1,101);
					
					if(1<=tusu&&tusu<=20||50<=tusu&&tusu<=60||90<=tusu&&tusu<=100 ) {
						System.out.println("스트라이크");
						strike++;
					}else if(tusu - user == 3 || user - tusu == 3 || bol == 4) {
						System.out.println("안타");
						anta = 1;
						swing = 1;
						
						aArr[i][j] = aArr[i][j] + anta/swing;
						anta = 0;
						swing = 0;
						bol = 0;
					}else if(strike == 3){
						System.out.println("아웃");
						count++;
						swing = -1;
						aArr[i][j] =aArr[i][j] + anta/swing +swing;
						swing = 0;
						strike = 0;
						if(aArr[i][j] < 0) {
							aArr[i][j] = 0;
						}
					}else {
						System.out.println("볼 입니다.");
						bol++;
						swing = 1;
						aArr[i][j] =aArr[i][j] + anta/swing +swing;
						swing = 0;
					}
					if(count == 3) {
						System.out.println(sie++ +"회로 넘어갑니다.");
						count = 0;
					continue;
				}	
			}
		}
	}

		
		
		
	} // class end

}//main end

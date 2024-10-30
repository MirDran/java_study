package study.practice.practice_class;

import java.util.Random;
import java.util.Scanner;

public class Level03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int tusu = 0;
		int taja = 0;
		int anta = 0;
		int mount = 0;
		double avg = 0;
		
		int[][] tArr = new int[3][3];
		int[][] anArr = new int [3][3];
		int[][] moArr = new int [3][3];

	while(true) {
			for(int j=0; j<3; j++) {
				System.out.println(j+1+"회 시작");
				for(int i=0; i<3; i++) {
					
					tArr[j][i] = i+j+1;
					
					moArr[j][i] = taja;
					mount = moArr[j][i]  + mount ;
					System.out.println(tArr[j][i]+"번 타자");
					System.out.print("타율 : ");
					avg = (anta / mount);
					System.out.println(avg);
					System.out.print("강도를 입력하세요 : ");
					int user = scanner.nextInt();
					if(tusu == user) {
						System.out.println("안타 입니다.");
						
						anta  = anArr[j][i] +1;
						mount = moArr[j][i] +1;
					}else if(tusu != user) {
						System.out.println("스트라이크 입니다.");
						mount = moArr[j][i] +1;
					}
				}
			}
		}	
	}
}

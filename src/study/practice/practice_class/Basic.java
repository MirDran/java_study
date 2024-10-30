package study.practice.practice_class;

import java.util.Random;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[][] nArr = new int [3][4];
		int taja = 0;
		int tusu = 0;
		
		while(true) {
			for(int j=0; j<3; j++) {
				for(int i=0; i<3; i++) {
					tusu = random.nextInt(1,11);
					System.out.println(tusu);
					
					taja = i+j;
					taja++;
					System.out.println(taja+"번 타자 입니다.");
					System.out.print("강도를 입력하세요 : ");
					int user = scanner.nextInt();
					if(tusu == user) {
						System.out.println("안타 입니다.");
					}else if(tusu != user) {
						System.out.println("스트라이크 입니다.");
					}
				}
			}		
		}	
	}
}

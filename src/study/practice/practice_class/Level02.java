package study.practice.practice_class;

import java.util.Random;
import java.util.Scanner;

public class Level02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int tusu = 0;
		int taja = 0;
		
		int[][] tArr = new int[3][3];
			
		for(int j=0; j<tArr.length; j++) {
			System.out.println(j+1+"회 시작");
			for(int i=0; i<tArr.length; i++) {
				tusu = random.nextInt(1,11);
				tArr[j][i] = taja+1;
				taja++;
				
				System.out.println(tArr[j][i]+"번 타자");
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

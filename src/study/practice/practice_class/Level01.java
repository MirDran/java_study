package study.practice.practice_class;

import java.util.Random;
import java.util.Scanner;

public class Level01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int tusu = 0;
		
		for(int j=1; j<4; j++) {
			System.out.println(j+"회 시작");
			for(int i=0; i<3; i++) {
				tusu = random.nextInt(1,11);
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

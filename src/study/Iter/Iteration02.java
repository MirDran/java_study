package study.Iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 피곤하다 출력

		for(int i = 1; i <=5; i++) {
			System.out.println("피곤하다");
		}
		
		int j = 1;
		while(j<=5) {
			System.out.println("졸리다");
			j++;
		}
		// j++ 이 없을 경우 경우 무한루프
		// false가 되는 순간 반복문 종료
		// false 조건도 걸어줘야함
		
		//조건식
//		while(true) {
//			System.out.println("무한");
//		}
		
		int k = 10;
		do {
			System.out.println("k do while");
		} while(k < 5);
		
		
		k=1;
		while(true) {
			//무한루프
			System.out.println(k);// 1234567
			k++; // sysout 위로 가면 결과는 2부터 시작
			
			if(k == 10) {
				break; //멈추기
			}
			
		}
		
		System.out.println("===============");
		
		for(int i=1; i<=10; i++) {
			
			if(i == 5) 
				continue;
			
				System.out.println(i);	
			if (i==5) {
				break;
			}
				
		}
		
		
		
		
		
		
		
	}

}

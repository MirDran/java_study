package study.Iter;

public class Iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("월요일");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("월요일");
		}
		
		for (int i = 35; i <45; i++) {
			System.out.println("수요일");
		}
		
		
		for (int j=1; j<=5; j++) {
			System.out.println("오늘은 공부 " + j +"일 차");
		}
		
		
		int sum = 0;
		// 10 ~ 100까지 10단위 합
		// 10 + 20+ 30 + ... +100
		
		for(int n = 10; n <= 100; n=n+10) {
			sum = sum + n;
		}
//		 내가 한 것
//		for(int n = 1; n <= 10; n++) {
//			
//			sum = sum + (n*10);
//			
//		}
		System.out.println("10~100까지(10단위) 합 : "+sum);
		
		for(int k=2; k<20; k=k*2) {
			System.out.println(k);
		}
		for(int k=400; k>=100;k=k-50) {
			System.out.println(k);
		}
		
		for(int k=100; k>=90;k--) {
			System.out.println(k);
		}
		
		
		
	}

}

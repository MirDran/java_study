package study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문
		//참 또는 거짓이 나오도록 작성

		int num = 15;
		int x = 10;
		
		if(num> 10) {
			System.out.println("확인해 보니");
			System.out.println("10보다 크다");
		} else {
			System.out.println("10보다 작다");
		}
		
		boolean b = num == 15; // true / false
		
		if(b) {
			System.out.println("자세히 보니");
			System.out.println("15 였다");
		}
		
		System.out.println("끝");
		
		
		
	}

}

package study.practice.practice12_16;

public class JavaCafe {

		public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
		}
		// 시급과 일한 시간을 입력받아, 주급을 출력
		public static void printPay(double basePay, int hours) {
		
		/* 해당 메소드를 완성하세요. */
		if(basePay < 8) {
			System.out.println("최저 시급 에러");
			return; // void 라 끝내는 거임 안되는 경우 미리 빼놓기
		}
		
		if(hours > 60) {
			System.out.println("초과 근무시간 에러!");
			return;
		}
		
		double pay = 0.0;
		if(hours <= 40) {
			pay = basePay * hours;
		}else {
			pay = (basePay *40) + (basePay *1.5*(hours-40));
		}
		
		
		System.out.printf("$ %.2f\n", pay);
		}
		
	
}

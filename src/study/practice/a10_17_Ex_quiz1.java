package study.practice;

public class a10_17_Ex_quiz1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		
//		1. 아래 1), 2) 에 맞게 풀이.
//	int x = 10;
//	int y = 4;
//	___result = ___x/y;
//	System.out.println(result);
//
//	1) 결과가 2가 나오도록 작성하세요
//	2) 결과가 2.5가 나오도록 작성하세요
		
		int x = 10;
		int y = 4;
		int result =  x/y;
		System.out.println(result);
		
		 x = 10;
		 y = 4;
		double result1 = (double) x/y;
		System.out.println(result1);
		
		
//	2. 결과가 7.5가 나오도록 작성하세요
//	double a = 3.5;
//	double b = 4.7;
//	double result = _______________;
//	System.out.println(result);

		double a = 3.5;
		double b = 4.7;
		double result2 = a + (int) b;
		System.out.println(result2);
		
		
//	3. 계산결과가 12가 나오도록 작성하세요
	String a3 = "3.4";
	String b3 = "4";
	int result3 = (int) Double.parseDouble(a3) * Integer.parseInt(b3);
	System.out.println(result3);

//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a4 = "10";
	int b4 = 3;
	double c = 4.5;
	String result4 = a4 + (int) (b4*c);
	System.out.println(result4);
//
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a5 = 4;
	double b5 = 3.4;
	String c5 = "6.8";
	String result5 = a5 * (int)Double.parseDouble(c5) + String.valueOf((int)b5)  ;
	System.out.println(result5);
//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int x2 = 111;
	int y2 = 13;
	int result6 = x2%y2;
	System.out.println(result6);
//
//	1) 출력결과 : 7
	int x3 = 111;
	int y3 = 13;
	int result7 = x3/y3;
	System.out.println(result7);
	
//	2) 출력결과 : 8
	
	
	
	

	}

}
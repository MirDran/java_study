package study.practice;

public class a_10_17_quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 아래 1), 2) 에 맞게 풀이.
	int x = 10;
	int y = 4;
//	___result = ___x/y;
//	System.out.println(result);
//
//	1) 결과가 2가 나오도록 작성하세요
	
	x = 10;
	y = 4;
	int result = x/y;
	System.out.println(result);
	
	
//	2) 결과가 2.5가 나오도록 작성하세요
	
	x = 10;
	y = 4;
	Double result1 = (double) x/y;
	System.out.println(result1);
//
//	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result2 = a + (b - 0.7);
	System.out.println(result2);
//
//	3. 계산결과가 12가 나오도록 작성하세요
	String a1 = "3.4";
	String b1 = "4";
	double a2 = Double.parseDouble(a1);
	int aa1 = (int) a2;
	int b2 = Integer.parseInt(b1);
	int result3 = aa1 * b2;
	System.out.println(result3);
//
//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a4 = "10";
	int b4 = 3;
	double c = 4.5;
	int c1 = (int) c;
	int c2 = b4 * c1;
	String result4 = a4 + ++c2;
	System.out.println(result4);

//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a5 = 4;
	double b5 = 3.4;
	String c5 = "6.8";
	
	double cc1 = Double.parseDouble(c5);
	
	int result5 = (int) cc1* a5 * ((int)b5 + (a5 + (int) b5)) + (int) b5;
	System.out.println(result5);
	
	//String cheat = "243"
	//System.out.println(cheat);
	
//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int x6 = 111;
	int y6 = 13;
//
	
	
//	1) 출력결과 : 7
	int result7 = (x6/y6) - (x6/y6) / (x6/y6);
	System.out.println(result7);
	
	
		//String cheat = (x6/y6)
		//System.out.println(cheat-1);
	
//	2) 출력결과 : 8
//		
	int result8 = x6/y6;
	System.out.println(result8);
	}

}

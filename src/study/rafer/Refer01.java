package study.rafer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n ; // 값이 없움
		int num = 0; // 값이 0
		
		String s1; // 값이 없음
		String s2 = null; // 값이 null = 빈주소

//		System.out.println(n);
		System.out.println(num);
//		System.out.println(s1);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		String str4 = new String("아침");

		System.out.println();
		System.out.println();

		System.out.println(str1 == str2); //t
		System.out.println(str1.equals(str2)); //t
		
		System.out.println();
		System.out.println();
		
		System.out.println(str3 == str2); //f
		System.out.println(str3.equals(str2));  //t
		
		System.out.println();
		System.out.println();
		
		System.out.println(str1 == str4); //f
		System.out.println(str1.equals(str4)); //t
		
		String test = null;
		System.out.println(test.equals("널이냐"));
		//NullPointException
		
		int n1 = 10;
		int n2 = n1;
		
		String ss1 = "점심"; // ex) 주소 h5
		String ss2 = ss1; // ex) 같은 주소 h5 
		
		
	
		
	}// main end

}

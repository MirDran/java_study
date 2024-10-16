package study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1231";
		
		int n1 = 50;
		int n2 = Integer.parseInt(s1); //"1231" -> 123
		System.out.println(s1 + n1);
		
		System.out.println( n1 + n2);
		
		System.out.println( n1 + Integer.parseInt(s1));
		
		String s2 = "13.15";
		//int n3 = Integer.parseInt(s2);
		// 문자와 실수는 int라서 넣지 못함
		double d1 = Double.parseDouble(s2);
		
		System.out.println(d1);
		
		boolean b1 = true;
		
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3); 
		// 문자를 값으로 변경 
		System.out.println(b2);
		
		String s4 = String.valueOf(true);
		String s5 = String.valueOf(123);
		String s6 = String.valueOf(1354.115);
		
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		String s7 = 213 + "";
		// 			int + String = 213+"" = String
		
		System.out.println(s7);
		
	}

}

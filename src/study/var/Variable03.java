package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 3.14;
		double d2 = d1;
		
		int i1 = (int)d1;
		int i2 = i1;
		
		System.out.println(i1);
		
		float f1 = 4.43f;
		double d3 = f1; // 자동 타입변환 double 이 더욱 크기 때문
		
		double d4 = 300; //자동 타입 변환이라 가능함 int 보다 큼
		//300.0으로 인식중 
		System.out.println(d4);
		
		//연산에서 형 변환

		int intvalue = 10;
		double doublevalue = 5.5;
		
//		int result = intvalue + doublevalue; 잘못case
		// int에 넣는다 해서 자동으로 안일어남
		//강제 형변환 
		
		int result = intvalue + (int)doublevalue;
		//								값 5;
		// int  =  10  + 5 
		
		result = (int) (intvalue + doublevalue);
		//			int 10 + double 5.5 -> double 15.5
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2;
		System.out.println(rt);
//		 5 6 = 11
		rt = (int)(dv1 + dv2); 
		System.out.println(rt);
//		12
		
		
		
		
	}	

}

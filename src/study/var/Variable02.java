package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		int num2 = 0b10;	//2
		int num8 = 012;		//10
		int num10 = 10;		//10
		int num16 = 0x30;	//40
		
		char var1 = 'A';
		char var2 = 86;
		char var3 = 0x0123;
				
		
		System.out.println(num16);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴";
		String subMenu ="123123"; // 123123; 숫자 불가능 아니면 ""
		
		System.out.println(menu);
		System.out.println(subMenu);
		
		System.out.println(var2 + 10);
		System.out.println(menu + subMenu);
		System.out.println(menu + 300 + 200);
		System.out.println(menu + (300 + 200));
		//괄호시 계산 없을시 문자로 인식
		System.out.println(subMenu + 500);
		
		String msg ="\"안녕\" 하세요";//강조 \ 혹은 끼어 들기\"\"
		System.out.println(msg);
		
		double d1 = 12.11;
		double d2 = 0.1211e2;
		float f1 = 12.12f;
		System.out.println(d2);
		
		boolean stop = false;
		boolean open = true;
		boolean close = false;
		
		
		
		
	}

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //main에 x가 있어서 main2는 인식 못함
	}
	
}

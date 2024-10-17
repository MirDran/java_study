package study.oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술 연산
		System.out.println(1+1);
		System.out.println(9-4);
		System.out.println(3*1);
		System.out.println(7/3.0); //기본 세팅이 int 라서 정수로 값이 나옴
	//숫자를 소수점 까지 붙이면 double로 인식하여 값이 double로 나옴
		System.out.printf("%.2f",7 / 3.0);
		System.out.println(9%5);
		//부호 연산
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		
		System.out.println("=============================");
		//증감 연산자
		
		int x = 10;
		System.out.println( ++x ); 	// ++변수 앞에 붙으면 +먼저
		//변수++ 뒤에 붙으면 변수 계산 먼저
		System.out.println( x );
		
		int y = 20;
		System.out.println( ++y );	// y=20 ++gotj y=21;
		System.out.println( y );	//21
		
		
		int z = 30;
		System.out.println( z+1 );	// 30+1 => 31
		System.out.println( z );	// 30
		
		int q = 1;	//2
		int w = 3;	//2
		int e = 10 + ++q; // Q가 증가에 따라 첫번째 Q도 증가하여 2 e = 12
		int r = 3 + w--; // W가 계산후 떨어져서 r은 6이지만 w는 2
		
		System.out.printf("%d %d %d %d \n", q,w,e,r);
		
		
		boolean isFinished = false;
		System.out.println( !isFinished );
		System.out.println( isFinished );


		System.out.println( 1 == 2 );
		System.out.println( 1 != 2 );
		System.out.println( 3 < 5 );
		System.out.println( 4 <= 4 );
		System.out.println( 5 > 10 );
		System.out.println( 9 >= 8 );
		boolean b1 = (9 >= 8); 
		//논리
		System.out.println("--------------======================");
		
		boolean b2 = ( 10 > 6 ) && ( 10 > 5 );
		System.out.println(b2);
		
		
		boolean b3 = ( 5 != 1) || ( 10 < 4 );
		
		System.out.println(b3);
		
		boolean b4 = (2 >= 1 ) && !( 3 < 4 );
		
		System.out.println( b4 );
		//System.out.println( !b4 );
		
		//대입
		
		int a = 30;
		
		a += 30; // a= a + 30;
		a -= 5; // a = a - 5;
		a *= 3; // a = a * 3;
		a /= 2; // a = a / 2;
		a %= 4; // a = a % 4;
		
		//삼항
		int point = -50;
		// 0 ~ 200 : 생수
		//201 ~ : 커피
		
		String eventItem = (point <= 200) ? "생수":"커피" ;
		System.out.println( eventItem );
		
		eventItem = (point > 200 ) ? "커피" : "생수";
		
		//0 ~ 200 : 생수
		// 201 ~ 300 : 커피
		// 301 ~ : 맥주
		
		// String Item = (point >= 301) ? "맥주" : (point >=201 ? "커피" : "생수") ;
		// System.out.println( Item );
		
		eventItem = (point > 200 ) ? ( point > 300 ? "맥주" : "커피" ) : (point >= 0 ) ? "생수" : "꽝";
		
		System.out.println(eventItem);
		
		eventItem = (point > 200 ) ? ( point>=201 && point<=300 ? "맥주" : "커피" ) : "생수";
		
		//( point >= 0 && point <= 200)
		
		
		
		
	}

}

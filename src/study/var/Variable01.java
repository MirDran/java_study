package study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 선언
		int number1;	//int 정수형 변수
		int floor;
		
		int x,y,z;
		
		int score; //선언
		int point = 50; //선언 + 값 저장 = 초기화 및 초기 값
		
		score = 90;
		
//		lever=99; 는 선언하지 않았기 때문에 사용 불가
		
		//변수 선언 이전에는 사용 불가 선언 이후 사용 서순 지켜!
//		time = 16;
		int time;
		time = 16;
		
		int minute = time + 9;
					// 16 + 9
		
		floor = 0;
		
		int myFloor = floor + 7; 
		//  floor 값이 없다면 초기화가 되지 않으므로 오류 발생
		
		int totalScore = score + point + point;
		
		System.out.println("최종 점수 : "+totalScore);
		System.out.println("기본 점수 : "+score); // sysout -> Ctrl + Space
		System.out.println("추가 점수 : "+point);
		
		totalScore = totalScore +  point;
		
		System.out.println(totalScore);
		
		x = 10;
		y = x;
		z = x + y;
		
		int a = 10; //이것이 리터널(정해진 값) 
		int b = 20;
		
		/* b = a;
		a = 20; */
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println(b);
	}

}

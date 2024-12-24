package study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Temp t = new Temp(); // 인터페이스는 생성 불가능
		TempObject t1 = new TempObject();
		
		Temp t = new TempObject();
		Temp2 t2 = new TempObject();
		
		Temp[] tArr = new Temp[3]; //3개짜리 Temp타입의 배열을 만드는 거라 가능
//		tArr[0] = new Temp(); // 생성이 안됨
		tArr[0] = new TempObject();
		
		
		//상속 : 부모클래스 타입 = 자식 객체
		// 인터페이스 : 인터페이스 타입 = 구현객체 (해당 인터페이스를 구현한)
		
		
	}

}

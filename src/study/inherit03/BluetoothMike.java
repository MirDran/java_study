package study.inherit03;

public class BluetoothMike extends Mike{

	boolean isConnect;
	
	
	//부모클래스 생성자는 super();
	
	public void connect() {
		
	}
	
	public void volumeUp() { //재정의 할려면 오버라이딩 할려면 같은 걸로 선언해야함
//		super.volumeUp(); // 부모클래스 함수 호출
		System.out.println("BluetoothMike 볼륨업 재정의");
	}
	
	public int voluemUp(String s) {
		System.out.println("String 매개변수 잇는 볼륨 업");
		return 0;
	}
	
	// 메소드 선언 -> 재정의 오버라이딩(overriding) 재정의는 접근제한을 지정이 제한된다
	public String toString() {
		String s = "나는 BluetootsMike 입니다.";
		return s;
	}
	
//	부모클래스 Mike에 이미 정의 되어 있음
//	public void check() {	
//	}
//	
//	public void volumeUp() {
//	}
}

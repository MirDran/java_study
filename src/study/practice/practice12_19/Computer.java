package study.practice.practice12_19;

public class Computer {
	
	
	//정적 static
	//상수 final 값이 바뀌지 않음 -> 상수인 경우 -> 모두 대문자로 표기
	//쓸때 보통 static final
	
//	public static final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	
	int index;
//	String os;
	int memory;
	
	
	public Computer(int x, int y){
		index = x;
//		this.os = OS_TYPE[x];
		memory = y;
	}
	
	public void print() {
//		System.out.println("운영체제 : " + os + ", 메인메모리 : " + memory);
		System.out.println("운영체제 : " + Computer.OS_TYPE[index] + ", 메인메모리 : " + memory);
		
	}
	
}

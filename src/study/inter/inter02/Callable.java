package study.inter.inter02;

//OO을 할 수 있는 
//전화를 걸 수 있는 기능
//인터페이스 이름 그래서 전화를 거는 기능이므로 Call + able
public interface Callable {

	//전화 상태
	int CALL_ON = 1; //전화 중인 상태
	public static final int CALL_OFF = 2;
	
	
	public void call(); //전화 관련 기능
}

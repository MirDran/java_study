package study.practice.practice28.v2;

public abstract class Unit { //추상클래스

	int x,y ;
	abstract void move(int x, int y);
	//기능을 할 것은 아니고 
	//필요에 의해 호출은 해야 하므로
	//추성메소드로 만들었음
	void stop() { /* 현재 위치에 정지 */ } 
}


//public interface Unit { // 인터페이스

	//내부에 들어 있는게
	//기본적으로 상수형에 추상 메소드 처리
//	int x,y ; // 상수가 되어서 공통 변수가 되지 못함
	
//	abstract void move(int x, int y)
//	void stop() { /* 현재 위치에 정지 */ } 
//	void stop(); 
	//인터페이스의 경우 추상이 되어
	//각각 가지고 있어야 함
//}
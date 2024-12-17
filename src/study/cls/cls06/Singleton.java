package study.cls.cls06;

public class Singleton {

	private static Singleton singleton = new Singleton(); //밑에서 static 이라 접근이 불가능 하여 static 붙임
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() { //외부에서 생성을 하지 못하여 호출을 못하니까 스태틱을 붙여서 고정으로 부름
		return singleton;
	}
}

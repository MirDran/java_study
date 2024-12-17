package study.cls.cls06;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 외부 생성 불가
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
		
		Singleton st = Singleton.getInstance();
		
	}

}

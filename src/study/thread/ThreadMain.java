package study.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
//		for(int i = 0; i< 10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i = 11; i<20 ; i++) {
//			System.out.println(i);
//		}
		
		//스레드 작동 방법
		//run 이라는 메소드가 있지만 호출은 start로 호출
		Thread01 t1 = new Thread01(); //스레드가 아니라 스레드 방식으로 작동하는 [객체]라서 가능함
		Thread01 t12 = new Thread01();
		Thread t13 = new Thread01(); //부모타입 = 자식객체
		
		
//		t1.run(); //부르는 건 가능하지만 스레드 처리는 되지 않음
		t1.start(); // 스레드로 실행 -> 알아서 run()를 사용.
					//하여 만들때는 run()을 만들고 실행은 start
		t12.start();
		t13.start(); //Thread 라는 클래스에 들어있어서 스타트가 있고 상속이 받아 사용 가능함
		
		Thread02 t2 = new Thread02();
		Thread t22 = new Thread(t2); //원본 스레드 new Thread(Runnable,Task)
		t22.start();
//		t2.start(); //인터페이스에는 없으므로 사용이 불가능함
		
		Thread t23 = new Thread ( new Thread02());
		t23.start();
		
		System.out.println(t23.getName()); //Thread - 4 생성된 스레드는 Thread - n 으로 설정 됨
		
		
		
	}

}

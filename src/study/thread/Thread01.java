package study.thread;

public class Thread01 extends Thread {

	// 스레드 만들기 방법 1 - 스레드 상속 받기
	//상속 받을려면 run 메소드 만들어야 함
	//스레드로 작동시킬 코드는 run 안에 넣어준다
	public void run() {
		for(int i = 0 ; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
				//1000 미리 세컨드 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

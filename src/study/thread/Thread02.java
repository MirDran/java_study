package study.thread;

public class Thread02 implements Runnable{

	//스레드 만드는 방법 2 = 인터페이스
	//스레드 만드는것은 아니고 정확히는 역할을 하게 만드는 것
	
	@Override
	public void run() {
		for(int i = 11; i <= 20 ; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

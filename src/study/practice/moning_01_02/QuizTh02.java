package study.practice.moning_01_02;

public class QuizTh02 implements Runnable{

	int a = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<=100; i++) {
			
			if(i%2 == 0) {
				a = i;
				System.out.println(a);
				
				try {
					Thread.sleep(500);
					//1000 미리 세컨드 = 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

	
}

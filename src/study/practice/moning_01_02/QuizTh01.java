package study.practice.moning_01_02;

public class QuizTh01 extends Thread{

	int a = 0;
	
	public void run() {
		
		for(int i = 0 ; i<=100; i++) {
			
			if(i%2 != 0) {
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

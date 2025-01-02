package study.practice.moning_01_02;

public class QuizMain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("=====홀수 스레드 1 ======");
//		QuizTh01 q1 = new QuizTh01();
//		q1.start();
//		
//		System.out.println("=====짝수 스레드 2 ======");
//		QuizTh02 q2 = new QuizTh02();
//		Thread q22 = new Thread(q2); // 스레드 새롭게
//		q22.start();
//		
		
		//이하 선생님 코딩
		// 스레드 상속
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
//		et.start();
//		ot.start();
//		
		//implements 인터페이스
		
		EvenRunnable er = new EvenRunnable();
		Thread t1 = new Thread(er);
		Thread t2 = new Thread(new OddRunnable());
		
//		t1.start();
//		t2.start();
//		
		
		NumberThread nt1 = new NumberThread(true);
		NumberThread nt2 = new NumberThread(false);
		
		nt1.start();
		nt2.start();
		
		
	}
}

//쓰레드 하나?

class NumberThread extends Thread{
	
	boolean isOdd;
	int remain;
	
	public NumberThread(boolean isOdd) {
		this.isOdd = isOdd;
		if(isOdd) {
			remain = 1;
		}else {
			remain = 0;
		}
	}
	
	public void run() {
		for(int i =1; i<=100;i++) {
			
				if(i%2== remain) {
					System.out.println(i);
				
//				}else {
//					if(i%2 == 0) {
//						System.out.println(i);
//					}
//				}
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



// 이하 선생님 코딩

class EvenThread extends Thread{ 
	
	public void run() {
		for(int i=2; i<=100; i++) {
			if(i%2 ==0) {
				System.out.println(i);
				
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

class OddThread extends Thread{
	
	public void run() {
		for(int i=1; i<=100; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(500);
					//1000 미리 세컨드 = 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}
}


class EvenRunnable implements Runnable{
	
	public void run() {
		for(int i=2; i<=100; i++) {
			if(i%2 ==0) {
				System.out.println(i);
				
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

class OddRunnable implements Runnable{
	
	public void run() {
		for(int i=1; i<=100; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(500);
					//1000 미리 세컨드 = 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}
}
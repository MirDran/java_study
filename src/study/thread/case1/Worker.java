package study.thread.case1;

public class Worker extends Thread {
	
	String name;
	int workLoad;
	Work work;
	
	public Worker(String name, int workLoad, Work work) {
		this.name = name;
		this.workLoad = workLoad;
		this.work = work;
	}
	
	public void run() {
		
		for(int i = 1 ; i <= workLoad; i++) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (work) { //STR에는 객체 flag 공유 개체 
									//공유 객체 기준으로 스레드 동기화
			work.addCount();
			System.out.println(name + " : " + work.workCount);
			}
		}
	}
}

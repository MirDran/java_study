package study.practice.practice_class;

public class Monitor {

	//속성 (필드)
	int inch; //인치수
	String company; // 제조사
	String model; //모델명
	
	//생성자(초기화)
	Monitor(int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
	
	//메소드 (동작/기능)
	
	void printInfo() {
		System.out.printf("제조사:%s 모델명:%s 인치%d\n",company,model,inch);
	}
}

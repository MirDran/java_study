package study.practice;

public class Monitor {

	
	int inch;
	String inder;
	String model;
	

	
	Monitor(String inder, String model, int inch){
		this.inder = inder;
		this.model = model;
		this.inch = inch;
	}
	
	
	
	void spec () {
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치",this.inder, this.model, this.inch);
		System.out.println();
	}
//	Phone(String model){
////		this.model = model;
//		this(model,100,3000);
	
	
}

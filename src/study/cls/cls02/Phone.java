package study.cls.cls02;

public class Phone {

	
	//필드
	String model;//기본값x, 무조건 필요
	int price; //기본값 : 100
	int battrey;// 기본 3000
	
	//기본생성자\
	
//	Phone(){
//		
//	}
	
	Phone(String model){
//		this.model = model;
		this(model,100,3000);
	}
	
	Phone(String model, int price){
		this(model, price, 3000);
//		this.model = model;
//		this.price = price;
//		this.battrey = 3000;
	}
	
	
	Phone(String model, int price, int battery){
	this.model = model;
	this.price = price;
	this.battrey = battery;
	}
}

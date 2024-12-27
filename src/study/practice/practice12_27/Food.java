package study.practice.practice12_27;

public class Food {

	String name; //이름
	int price;  //가격
	int stock; // 재고
	
	
//생성자
	Food(String name, int price){
		this.name = name;
		this.price = price;
		this.stock = 10; // 음식 재고 초기화 
	}
	
	//재고 
	
	void modifyStock(int q) {
		if( (stock + q) < 0 ) {
			stock = 0;
		}else {
			stock += q;
		}
	}
	
	//음식 정보 스트링
	String getFoodInfo() {
//		String srt = name + " : " + price +"원 "+"재고 : "+stock;
		String srt = String.format("%5s:%5d원 재고:%d",name, price,stock);
		return srt;
	}
}


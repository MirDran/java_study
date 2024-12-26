package study.practice.practice12_26;

import java.util.ArrayList;
import java.util.List;

public class InterfaceType {
	public static void main(String[] args) {
// 객체 생성
		Food f1 = new Food("족발",19800);
		Electronics e1 = new Electronics("에어팟",199000);
		Clothing c1 = new Clothing("셔츠",49900);
		
		List<Orderable> orderList = new ArrayList<Orderable>();
		orderList.add(new Food("족발",19800)); //새로운 객체를 생성하여 넣는 것
//		orderList.add(f1); //기존에 만든 객체를 넣는 것
		
		orderList.add(new Electronics("에어팟",199000));
		orderList.add(new Clothing("셔츠",49900));
		
		int sum =0;
		
		for (int i = 0; i < orderList.size(); i++) {
			sum += orderList.get(i).discountedPrice();
		} //일반 for문
		
		sum = 0;
		for(Orderable oa : orderList ) {
			sum += oa.discountedPrice();
		} //향상 for문
		
// 총합 계산 
		int result =
		f1.discountedPrice() +
		e1.discountedPrice() +
		c1.discountedPrice() ;
		
// 결과 출력
		
		System.out.println(
				"총합 : " + sum +"원"
				);
		
		System.out.println(
				"총합 : " + result +"원"
				);
	}
}

interface Orderable {// 할인 할 수 있는  //할인 적용 or 할인된 금약을 확인
	public int discountedPrice();// 할인 된 금액 리턴 형태
}

class Food implements Orderable {
	private String name; // private getter setter
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int discountedPrice(){
		
		//원래 금액의 10% 할인된 금약 반환
		return price - (int)(price*0.1);
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int discountedPrice() {
		return  price - (int)(price*0.2);
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int discountedPrice() {
		return price - (int)(price*0.3);
		
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
}
package study.inherit.inherit05;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
	public static void main(String[] args) {
		
	Tire t1 = new HankookTire("앞왼쪽",15);
	Tire t2 = new HankookTire("앞오른쪽",15);
	Tire t3 = new HankookTire("뒤왼쪽",15);
	Tire t4 = new HankookTire("뒤오른쪽",15);
	
	
	Car car = new Car(t1,t2,t3,t4);

		
//		List<Tire> tire = new ArrayList<Tire>();
//		tire.add(new HankookTire());
//		tire.add(new KumhoTire());
//		tire.add(new HankookTire());
//		tire.add(new NexenTire());
//		
		
				
		
		for (int i = 1; i <= 10; i++) {
			int problemLocation = car.run();
			//변경전 1 2 3 4 : 0은 정상
			//변경 후 0 1 2 3 :ㅣ 10이 정상
			switch (problemLocation) {
			case Car.FRONT_LEFT_TIRE: //스태틱이라 Car라고 바로 선언 가능
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.tireArr[Car.FRONT_LEFT_TIRE] = new HankookTire("앞왼쪽", 15);
				break;
			case Car.FRONT_RIGHT_TIRE:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.tireArr[Car.FRONT_RIGHT_TIRE] = new KumhoTire("앞오른쪽", 13);
				break;
			case Car.BACK_LEFT_TIRE:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.tireArr[Car.BACK_LEFT_TIRE] = new HankookTire("뒤왼쪽", 14);
				break;
			case Car.BACK_RIGHT_TIRE:
				System.out.println("뒤오른쪽 NexenTire로 교체");
				car.tireArr[Car.BACK_RIGHT_TIRE] = new NexenTire("뒤오른쪽", 25);
				break;
			}
			System.out.println("----------------------------------------");
		}
	}
}

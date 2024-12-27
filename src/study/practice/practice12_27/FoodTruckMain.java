package study.practice.practice12_27;

import java.util.ArrayList;
import java.util.List;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		FoodTruck ft = new FoodTruck("푸드가게");
		
		ft.addMenu("치콜",9000);
		ft.addMenu("치치콜",11000);
		ft.addMenu("양치콜",10000);
		
		ft.startBusiness();
		
	}

}

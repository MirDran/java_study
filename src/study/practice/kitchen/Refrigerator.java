package study.practice.kitchen;

import java.util.ArrayList;

class Refrigerator {
	
	String company;
	String model;
	int price;
	int door;
	boolean power;
	int useWatt;
	boolean hasFreezer;
	int Temperature;
	boolean isOpen;
	int timer;
	boolean light;
	
	boolean isPowerOn;
	
	IceTray iceTray;
	ArrayList<IceTray> iceTrayList;
	
	
	//온도 : -5 ~ 4 -10~ 6
	
	int maxTemperature;	// 최대 온도
	int minTemperature; // 최저 온도
	
	public Refrigerator() {
		maxTemperature = 4;
		minTemperature = -5;
	}
	
	public void powerOn(){
		isPowerOn = true;
	}
	
	public void tempUp(int tempValue) { //온도 n도 올리가 tempUp(5) = 5도 올리기
		if(Temperature + 1 <= maxTemperature) {
		this.Temperature += 1;
		}
	}
	
	public void tempUp() { //온도 1도 올리기
		this.Temperature += 1;
	}
	
	public int tempDown() { //온도 1도 내리고 최종온도를 반환
		this.Temperature -= 1;
		return Temperature;
	}
	
	// modifyTemp(1) 1도 올리기
	// modifyTemp(-2) -2도 내리기
	public void modifyTemp(int tempValue) { //온도 조절
		this.Temperature += tempValue;
	}
	
	// modifyTemp(true) 1도 올리기
	// modifyTemp(false) 1도 내리기
	public void modifyTemp(boolean isUp) {
		if(isUp) {
			this.Temperature += 1;
		}else {
			this.Temperature -= 1;
		}
	}

}

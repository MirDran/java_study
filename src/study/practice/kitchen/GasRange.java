package study.practice.kitchen;

public class GasRange {

		/*
		 -가스렌지
		- 화구가 몇인지
		- 어디 브랜드인지
		- 가격이 얼마인지
		- 불을 켠다
		- 불을 끈다
		- 불세기르 조절한다.
*/
	
	
	int fireCount;
	String brand;
	int price;
	
	int fireLevel; //불 세기 단계 (0~10)
	
	public void fireOn() {
		fireLevel = 1;
	}
	
	public void fireOff() {
		fireLevel = 0;
	}
	
	public void setFireLevel(int fireLevel) { //setFireLevel(int)
		this.fireLevel = fireLevel;
	}
	
}



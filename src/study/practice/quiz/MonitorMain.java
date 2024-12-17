package study.practice.quiz;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//선생님 하신 것
		
		Monitor m1 = new Monitor("삼성",27,150000);
		m1.setColor("검은색");
		
		Monitor m2 = new Monitor("LG",32,330000);
		
		m1.setXY(1080,780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.printInfo();
		m2.printInfo();
		
		int returnPrice = m2.addprice(70000);
		System.out.println("인상된 금액 : " + returnPrice);
		
		m1.printInfo();
		m2.printInfo();
		
		/* 내가 한 것
		Monitor samsungEle = new Monitor("SAMSUMG",27,150000,"검정색");
		Monitor lgEle = new Monitor("LG",32,330000);
		
		samsungEle.setPixelX(1080);
		samsungEle.setPixelY(780);
		
		lgEle.setColor("흰색");
		lgEle.setPixelX(4096);
		lgEle.setPixelY(2048);
		
		System.out.println("SAMSUNG 모니터 정보");
		samsungEle.MonitorInfo();
		System.out.println();
		
		System.out.println("LG 모니터 정보");
		lgEle.MonitorInfo();
		System.out.println();
		
		System.out.println("LG 모니터 금액 인상");
		lgEle.setPrice(70000);
		System.out.println();
		
		System.out.println("SAMSUNG 모니터 정보");
		samsungEle.MonitorInfo();
		System.out.println();
		
		System.out.println("재조정 된 LG 모니터 정보");
		lgEle.MonitorInfo();*/
	}

}

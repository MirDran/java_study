package study.practice.quiz;

public class Monitor {

	//선생님 하신 것
	String company;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	Monitor(String company, int inch, int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setXY(int x , int y) {
		this.maxResolutionX = x;
		this.maxResolutionY = y;
	}
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	public int addprice(int tempPrice) {
		this.price = this.price + tempPrice;
		return this.price;
	}
	
	public void printInfo() {
		System.out.printf("제조사: %s %d인치 모니터 가격: %d원 색상:%s 해상도: %d*%d \n",
				company,inch,price,color,maxResolutionX,maxResolutionX);
	}
	
	/* 내가 한 것
	String Company;
	int Inch;
	int Price;
	String Color;
	int PixelX;
	int PixelY;
	
	public Monitor (String Company, int Inch, int Price) {
		this.Company = Company;
		this.Inch = Inch;
		this.Price = Price;
	}
	
	public Monitor (String Company, int Inch, int Price,String Color) {
		this.Company = Company;
		this.Inch = Inch;
		this.Price = Price;
		this.Color = Color;
	}
	
	public void setColor(String Color) {
		this.Color = Color;
	}
	
	public String getColor() {
		return this.Color;
	}
	
	public void setPixelX(int PixelX) {
		this.PixelX = PixelX;
	}
	
	public int getPixelX() {
		return this.PixelX;
	}
	
	public void setPixelY(int PixelY) {
		this.PixelY = PixelY;
	}
	
	public int getPixelY() {
		return this.PixelY;
	}
	
	public void PowerOn() {
		System.out.print("전원이 켜졌습니다.");
	}
	
	public int setPrice(int Price) {
		this.Price = this.Price + Price;
		return this.Price;
	}
	
	
	public void MonitorInfo() {
		System.out.println("제조사 : " + this.Company);
		System.out.println("크기 : " + this.Inch + "인치");
		System.out.println("가격 : " + this.Price + "원");
		System.out.println("색상 : " + this.Color);
		System.out.println("해상도 : " + this.PixelX + "*"+ this.PixelY);
		
	}*/
	
}

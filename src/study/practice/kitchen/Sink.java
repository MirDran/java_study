package study.practice.kitchen;

public class Sink {

	int width;	// 2000mm
	int height; // 450mm
	int depth;
	String color;
	String material;
	
	public Sink() {
		
	};
	
	public int getWidth() { //mm
		return width;
	}
	
	public double getWidthAsCm() { //기본은 mm 이나 Cm로 알고 싶을 경우 기본 패턴은 아님
		return width/10; // 450mm -> 45cm
		//1280 -> 128com   1305 -> 130.5cm 의 경우가 있으니 기본 int 에서 double로 변경
	}
	
}

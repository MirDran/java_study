package study.practice.practice_class;

public class Circle {

	int radius;
	double result;
	
	Circle(){
	}
	
	
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		result = radius*radius*3.14;
		
		return result;
	}
	
}

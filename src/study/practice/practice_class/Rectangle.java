package study.practice.practice_class;

public class Rectangle {

	int lowWid;
	int height;
	double result;
	
	Rectangle(int lowWid, int height){
		this.lowWid = lowWid;
		this.height = height;
	}
	
	double getArea() {
		
	result = (double)lowWid * height;
	
	return result;
	}
	
}

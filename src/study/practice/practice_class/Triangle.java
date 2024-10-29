package study.practice.practice_class;

public class Triangle {

	int lowwid;
	int height;
	double result;
	
	Triangle(){
		
	}
	
	void setSize(int lowwid, int height) {
		this.lowwid = lowwid;
		this.height = height;
	}
	
	double getArea() {
		result = ((double)lowwid*height)/2;
		
		return result;
	}
	
}



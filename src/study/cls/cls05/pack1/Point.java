package study.cls.cls05.pack1;

public class Point {

	int math;
	int eng;
	private int com;
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setCom(int com) {
		if(com <100) {
			this.com = 100;
		}else if(com < 0) {
			this.com = 0;
		}else {
			this.com = com;
		}
	}
	
	public int getCom() { //제한자 리턴타입 변수 매개변수
		return this.com;
	}
	
	public Point getPoint() { //리턴 타입에 클래스도 가능
		return new Point();
	}
}

package study.inherit.inherit01;

public class Child extends Parent{

	int grade;
	String schoolName;
	
	
	public Child (int grade, String schoolName, int money){
		super(money);
		this.grade = grade;
		this.schoolName = schoolName;
	}
	
	
	public Child (int grade, String schoolName){
		super(0);
		this.grade = grade;
		this.schoolName = schoolName;
	}
	
	
	public Child() {
		super(); // 부모클래스의 생성자를 호출  자동으로 부름 생략 가능; 조건 부모에 기본생성자가 존재 할 시
		// 부모클래스에 기본 생성자가 없을 경우 super 작성 후 조건 같이 붙여야함
		System.out.println("Child 클래스 생성자");
	}
	
	public void play() {
		System.out.println("뛰어놀기");
	}
	
	public void printInfo() {
		System.out.println(grade + " " + schoolName + " " + money);
	}
}

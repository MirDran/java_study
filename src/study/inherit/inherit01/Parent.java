package study.inherit.inherit01;

public class Parent {

//	int money;
	protected int money;
	// protected = defalut + 자식 클래스 접근 가능
	
	public Parent() {
		System.out.println("Parent 클래스 성상자");
	}
	
	
	public Parent(int money) {
		super();
		this.money = money;
	}
	
	
	public void say() {
		System.out.println("부모님 말씀");
	}
}

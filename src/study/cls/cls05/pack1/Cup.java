package study.cls.cls05.pack1;

public class Cup {
	private String type;
	
	
	private Cup(){ //생성자를 막음 
		
	}
	
	public Cup(String type) {
		this.type = type;
	}
	
	public void method() {
		System.out.println("pack1.Cup method() 111");
	}
}

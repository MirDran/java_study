package study.inter.inter02;

public class Person {

//	GalxyPhone gp;
//	Iphone ip;
	
	Callable callPhone; //new GalxyPhone() new IPhone()
	
	public void call(String phoneNumber) {
		// phoneNumber 쪽으로 전화번호를 전화를 걸자
		callPhone.call();
	}
}

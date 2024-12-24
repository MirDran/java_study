package study.inter.inter02;

//아이폰
public class IPhone implements Callable{

	@Override
	public void call() {
		System.out.println("IPhone 전화 검"); //차이를 위해 콜 스테이터스 넘어감
	}

}

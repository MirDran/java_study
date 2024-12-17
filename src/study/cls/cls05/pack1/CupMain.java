package study.cls.cls05.pack1;

import study.cls.cls05.pack2.Cup;

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup c1 = new Cup();
		c1.method();
		
		study.cls.cls05.pack2.Cup c2 = new study.cls.cls05.pack2.Cup(); 
		c2.method();
		
		study.cls.cls05.pack1.Cup c3 = new study.cls.cls05.pack1.Cup("유리컵"); 
		c3.method();
		//c3.type = "유리컵"; //디폴트 같은 패키지 안이라서 적용 가능
		//프라이베이트는 같은 패키지도 안댐 외부공개 X 
		
		Cup cc = new Cup();
		cc.type = "머그컵";  //default 라서 안됨 (다른패키지라서) 디폴트는 같은 패키지만 가능
		// public 으로 변경하여 오류 사라짐
		cc.method();
	}

}

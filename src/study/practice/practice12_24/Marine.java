package study.practice.practice12_24;

class Marine extends Unit{ // 보병

	public void move (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("재정의 걸어가는 마린"); //공격 타입에 의한 다른 개체에 관련 하여 
		//재정의가 되어야 하므로 중복 되어도 각기 다른 Move 타입이다
	}
	
	void stimPack() {
		/* . */} // 스팀팩을 사용한다
}

class Tank extends Unit { // 탱크
	
	public void move (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("재정의 굴러가는 탱크");
	}


	void changeMode() {
		/* . */} // 공격모드를 변환한다
}

class Dropship extends Unit { // 수송선

	public void move (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("재정의 날아가는 수송선");
	}


	void load() {
		/* . */ } // 선택된 대상을 태운다

	void unload() {
		/* . */ } // 선택된 대상을 내린다
}

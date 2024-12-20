package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HideChild extends Parent {
	
	public HideChild(int money) {
		super(money);
	}
	
	public void printInfo() {
		System.out.println(money); // 부모가 디폴트라서 다른 패키지라 불러올 수 없음
	}
}

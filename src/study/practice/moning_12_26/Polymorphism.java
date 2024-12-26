package study.practice.moning_12_26;

public class Polymorphism {
	public static void main(String[] args) {
// 성기사 객체 생성
		HolyKnight uther = new HolyKnight("우서", 180);

// 탱커로서의 역할 수행
		Tanker t = uther;
		t.increaseHp();

// 힐러로서의 역할 수행
		Healer h = uther;
		h.heal();
	}
}

interface Tanker { //has a 가질 수 있는 혹은 가지고 잇는
	public void increaseHp();
}

interface Healer {//has a 가질 수 있는 혹은 가지고 잇는
	public void heal();
}

/* 1. 탱커와 힐러 역할을 부여하세요. */
class HolyKnight implements Tanker, Healer{ //홀리나이트는 둘다 가지고 있다.
	private String name;
	private int hp;
	

public HolyKnight(String name, int hp) {
this.name = name;
this.hp = hp;

}


@Override
public void increaseHp() {
	System.out.println("전체 체력 +"+ 50 + " 증가 시킵니다.");
	hp += 50;
}


@Override
public void heal() {
	System.out.println("체력 +"+ 30 + " 회복합니다.");
	hp += 30;
}
}

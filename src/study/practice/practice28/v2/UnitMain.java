package study.practice.practice28.v2;

public class UnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank t1 = new Tank();
		Dropship d1 = new Dropship();
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		Unit[] bd1 = {t1, d1, m1, m2, m3};
		bd1[0].stop();
		bd1[0].move(0, 0);
		
		Unit[] bd2 = {m1, m2, m3};
		((Marine)bd2[0]).stimPack(); //명시적 변경
		
		Marine mm = (Marine)bd2[1];
		mm.stimPack();
		
		Marine[] mrbd = {m1,m2,m3};
		mrbd[0].stimPack();
	
//		Unit u1 = new Unit(); //클래스라 가능
		//abstract 추상으로 변경되어 주석 처리
		
		
	}

}

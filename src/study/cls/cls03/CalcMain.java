package study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c1 = new Calc();
		
		c1.powerOn();
		
		Calc c2 = new Calc();
		
		c2.powerOn();
		
		c1.setOwner("my name");    //리턴 void
		
		c1.setOwner("you'er name");
		
		c1.divide(10, 5);
		
		double result1 = c2.divide(10, 5);
		System.out.println(result1);
		
		System.out.println(c2.divide(3, 2));
		
		String result2 = c1.madeInfo();
		System.out.println(result2);
		
		System.out.println(c2.madeInfo());
	}

}

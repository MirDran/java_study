package study.inherit.inherit06;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Taxi ta =takeTaxi();
		Bus bu = takeBus();
		
		Vehicle v = new Taxi();
		Vehicle v2 = takeBus(); //return Bus
		
//		Bus b3 = takeBus2(); 리턴 타입이 Vehicle 이라서 자식인 Bus는 담지를 못함
		Vehicle b3 = takeBus2();
		
		
		//-------------------
		
		Taxi t5 = new Taxi();
		Vehicle v5 = t5;
		v5.run();
		t5.bsOn();
		
		Taxi t6 = (Taxi)v5;
		t6.bsOn();
		
		Vehicle v6 = new Vehicle();
		
		if (v6 instanceof Taxi) {
		Taxi t7 = (Taxi)v6; // vehicle이 몸통까지 라서 자식이 없음..
		}
	}

	
	public static Taxi takeTaxi() {
		return new Taxi();
	}
	
	public static Bus takeBus() {
		return new Bus();
	}
	
	public static Vehicle takeBus2() {
		return new Bus();
	}
}

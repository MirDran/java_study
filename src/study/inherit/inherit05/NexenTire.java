package study.inherit.inherit05;

public class NexenTire extends Tire {
	// 필드
	// 생성자
	
	public NexenTire(){
		
	}
	
	public NexenTire(String location) {
		super(location);
	}
	
	public NexenTire(int maxRotation) {
		super(maxRotation);
	}
	
	public NexenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " NexenTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " NexenTire 펑크 ***");
			return false;
		}
	}
}


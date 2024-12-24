package study.practice.practice12_24;

class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
		
		
		
	} // main

	private static void action(Robot robot) {
		
		if(robot instanceof DanceRobot) {
			DanceRobot DanceRobot = (DanceRobot)robot;
			DanceRobot.dance();
		} if(robot instanceof SingRobot) {
			SingRobot SingRobot = (SingRobot)robot;
			SingRobot.sing();
		} if(robot instanceof DrawRobot) {
			DrawRobot DrawRobot = (DrawRobot)robot;
			DrawRobot.draw();
		}
	}

}

class Robot {
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

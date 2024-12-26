package study.practice.practice12_24;


class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++)
			action(arr[i]); //동일한 내부에 있기 때문에 action만 부름
		//외부 객체의 경우 앞에 000.action을 불러야함
		//main이 스태틱이기 때문에 먼저 태어나서 
		//호출되는 메소드도 스태틱이 되어 태어나야 함
		
		
		
	} // main

	private static void action(Robot robot) {
		
		if(robot instanceof DanceRobot) {
			((DanceRobot)robot).dance(); //명시적 변경
			//robot을  (DanceRobot)robot으로 바꾸고
			//() 한번 감싸서 우선순위로 주고 ((DanceRobot)robot)로 작성한 뒤
			//((DanceRobot)robot)의 dance를 불러와야 하니까
			//((DanceRobot)robot).dance 인데 메소드를 불러야 하므로
			//((DanceRobot)robot).dance();
//			DanceRobot DanceRobot = (DanceRobot)robot; 정석
//			DanceRobot.dance();
		} 
		
		if(robot instanceof SingRobot) {
			((SingRobot)robot).sing(); //명시적 변경
//			SingRobot SingRobot = (SingRobot)robot; //정석
//			SingRobot.sing();
		} 
		
		if(robot instanceof DrawRobot) {
//			((DrawRobot)robot).draw(); //명시적 변경
			DrawRobot DrawRobot = (DrawRobot)robot; //정석
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

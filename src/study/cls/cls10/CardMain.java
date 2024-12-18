package study.cls.cls10;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("나이름", "1234");
		s1.card = new Card(1,"신한","체크","나이름");
		
		AttendTool tool = new AttendTool();
		tool.isOn = true;
		tool.forOrg = "센터";
		
		//학생 -> (카드) -> 출결 도구
		boolean result = tool.checkAttend(s1.card); //학생이 가지고 있는 카드를
		//출결 도구 체크 메소드에 보냄
		if(result) {
			
		}else {
			
		}
		
		int r = tool.checkAttend2(s1.card);
		if(r == 1) {} //출석 성공 시
		else if (r == 2) {} // 퇴실 성공 시
		else {} // 문제 발생 시
		
		
	}

}

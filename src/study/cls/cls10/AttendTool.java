package study.cls.cls10;

public class AttendTool { //출석기계
	
	boolean isOn;
	String forOrg;
	
	//출석체크 결과 -> 정상 true, 실패 false
	// 그렇다면 타입은 boolean
	//혹은 int 1: 출석성공 2: 퇴실 성공 3: 실패
	public int checkAttend2(Card card) {
		//card 확인
		//오늘 기록X -> 출석
		return 1;
		
		//출석기록 2 -> 퇴실
		//return 2;
		
		//문제 -> 처리실패
		//return 3;
	}
	public boolean checkAttend(Card card) {
		//구성원 목록
		
		//목록 == card.id
		
		//출석상태 체크
		// X-> O 출석 O -> X 결석여부 및 퇴실 여부
		
		return true;
	}
	
	//출결체크 ( 학생 지문 + 카드)
	public boolean checkAttend(Card card, Student s) {
		//s.card
		//s.hand
		
		return false;
	}
	
}

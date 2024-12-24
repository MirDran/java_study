package study.practice.moning12_24;

import java.util.List;

public class AttendanceInfo { //출근정보

	//직원 정보 (PK 사번)
	//날짜 (Date) 
	//년도 	2024 DB 라면 where 년 =2024
	//월		12 		 	where 월 =12
	//일 	1
	
	//출근찍은시간
	//퇴근찍은시간 (-> 수치비교, 조퇴여부)
	List<AttendanceInfo> aList; //직원에 해당하는 근태 목록
	
	//상태코드 (1:출근 2:지각 3:조퇴 4:결근 5휴가 etc...)
}

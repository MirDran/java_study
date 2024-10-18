package study.cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice = 5;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
			
		if(dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		
		if(dice == 1) { // 1일 때
			
		} else if (dice == 2) { // 2일 때
			
		} else if (dice == 3) { // 3일 때
			
		} else { // 그 외 
			
		}
		
			
		
		if(dice == 1) { 
		} else if (dice == 2) { 
		} else if (dice == 3) { 
		} else if (dice == 4) { 
		} else if (dice == 5) { 
		} else {} //6
		
		
		
		
		System.out.println("========switch====");
		
		dice = 4;
		
		switch(dice){
		case 1 :		//dice=1;
			System.out.println("case 1");	break;
		case 2 :		//dice=2;
			System.out.println("case 2");	break;
		case 3 :		//dice=3;
			System.out.println("case 3");	break;
		case 4 :		//dice=4;
			System.out.println("case 4"); 	break;
		case 5 :		//dice=5;
			System.out.println("case 5");	break;
		case 6 :		//dice=6;
			System.out.println("case 6");	break;
		default:		//else
			System.out.println("default");	break;
		}
		
		//8시 : 출근 -청소
		//9시 : 출근 -회의
		//10시 : 업무
		//11시 : 외근

		int showTime = 8;
		
		
		if(showTime <= 8) {
			//청소
		}
		if(showTime <= 9) {
			//회의
		}
		if(showTime <= 10) {
			//업무
		}
		if(showTime <= 11) {
			//외근
		}
		
		
		if(showTime <= 8) {
			//청소
			//회의
			//업무
			//외근
		} else if(showTime <= 9) {
			//회의
			//업무
			//외근
		} else if(showTime <= 10) {
			//업무
			//외근
		} else if(showTime <= 11) {
			//외근
		}
		
		
		switch(showTime) {
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		}
		
		
		
		switch(showTime) {
		case 8:
			//청소
			//회의
			//업무
			//외근
			break;
		case 9:
			//회의
			//업무
			//외근
		case 10:
			//업무
			//외근
		case 11:
			//외근
		}
		
		int goBadTime = 21;	// 취침시간
		int sleepTime = 9;  // 수면시간
		
		
		//case의 경우
		//일찍 많이/조금
		//늦게 많이/조금
		
		if(goBadTime <= 21) {
			//새나라의 어린이
			if(sleepTime >= 9) {
				//새나라의 아기
			} else {
				//새나라의 어른
			}
		} else {
			//새나라의 어른이
			if(sleepTime >= 9) {
				//새나라의 아기
			} else {
				//새나라의 어른
		}
		
		
			//case의 경우
			//일찍 많이/조금
			//늦게 많이/조금

			// x == 10 ; x != 10  !(x==10)
			// x < 10    !(x<10)  
			// x > 11	x <= 11   !(x > 11)
 			
			if(goBadTime <=21 && sleepTime >=9) {
				// 일찍 / 많이
			}else if (goBadTime <=21 && sleepTime <9) {
				//else if (goBadTime <=21 && !(sleepTime <9))
							//일찍 / 조금
			} else if (goBadTime >21 && sleepTime >= 9) {
				// 늦게 /많이
			}
		
		
	}

}

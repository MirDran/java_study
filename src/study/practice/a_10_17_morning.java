package study.practice;

public class a_10_17_morning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.
		키보드를 가지고 있습니다. 키보드에 대한 여러 정보를 저장하고 싶은데
		아래 데이터들에 따라서 필요한 변수들을 선언하고 값을 저장해보세요!

		브랜드명 : 로지텍 			String brand = "로지텍";
		상품명 : mx kyes			String bName = "mx kyes";
		상품가격 : 135000	(String)int bMoney = "135000";
		시리얼번호 : 332L1545K		String sNum = "332L1545K";
		*/

		/*
		2. 가지고 있는 모니터 정보를 저장할 필요가 생겼습니다.
		관련 정보 저장을 위해 아래 데이터 저장을 위한 변수를 선언하고 값을 저장해보세요!

		회사명 : SAMSUNG			String	company = "SAMSUNG";
		모니터인치 : 24	(String) int	inch = "24";
		모니터색상 : black			String	color = "black";
		HDMI포트여부 : true		String	port = "true";
		소리출력가능여부 : false		String	sound = "false";
		
		
		boolean 타입 변수 선언시 닫았는지? 열었는지 같은 의문형이라 
		open	isOpen
		close	isClose
		hdmoport	hasHdmiport
		playsound	canPlaysound
		처럼 붙이면 된다
		
		*/

		//3. 3.14 값을 가지고 있는 pi 라는 실수형 변수를 만들고 화면에 출력하세요.
		//예시) 원주율 : 3.14
			
		double pi = 3.14;
		System.out.println("원주율 : "+ pi);
		
		/*
		4. 두 개의 문자열 변수가 우리에게 주어졌습니다. 그런데 해당 문자열 변수는 어떤 학생의 점수를 가지고 있습니다.
		주어진 점수들의 전체 합을 계산하고 싶습니다. 모든 점수를 더해서 총점이 얼마인지 출력하세요.
		(*힌트 : 숫자처럼 덧셈을 하기위해서는 숫자형태로의 변환이 필요합니다.)

		주어진 변수*/
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int math = Integer.parseInt(mathScore);
		int eng = Integer.parseInt(englishScore);
		int art = Integer.parseInt(artScore);
		
		int total = math+eng+art;
		
		System.out.println(math + eng + art);
		System.out.println(total);
		
/*
 * System.out.println(" 총점 : " (Integer.parseInt(mathScore)+
 * Integer.parseInt(englishScore)+
 * Integer.parseInt(artScore)));
 * 
 * */
		/*
		5. 조카에게 나눗셈 계산하는 연습을 시키고 있습니다.
		4 / 10 을 실행시켜서 결과가 0.4 가 나오는 것을 보여주려고 하는데 아래 계산 결과가 맞지 않습니다.
		정상적으로 0.4 가 계산되서 출력되도록 만들어주세요.
	*/
		int num1 = 4;
		int num2 = 10;
		
		double d1 = num1;
		double d2 = num2;
		
		double num3 = (d1 / d2) ;
		
		System.out.println( num3 );
		
		double num4 = (double)num1 / num2;
	//		double num4 = num1 / (double)num2;
	//		double num4 = (double)num1 / (double)num2;
		System.out.println( num4 );

	
	}

}
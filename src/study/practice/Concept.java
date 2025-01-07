package study.practice;

public class Concept {

	public static void main(String[] args) {
		// DAO DATA ACCESS OBJECT
		
		// 외부 공공데이터 포탈 API서버 <-> APIseRvice <-> maiN <-> DAO <-> DB
		//										  DTO     DTO
		
		CartDTO cart = goGetDonMan(); // 돈까스
		//만두랑 돈까스 같이
	}

	//돈까스, 만두
	public static CartDTO /*String*/ goGetDonMan() { //DAO 
		
		CartDTO cart = new CartDTO();
		cart.item1 ="돈까스";
		cart.item2 = "만두";
		
		return cart;
	}
	
}

class CartDTO{ //DTO 포장
	//필드
	String item1;
	String item2;
	
	
	//생성자 생성 편하게 하기 위해서 있는 것
	//메소드 getter setter
}

class FoodDAO { //음식에 관련하여 DB에 접근하는 담당 객체
	//findFoodList	select
	//saveFood		insert
	//modifyFood	
	//removeFood	delete
	//findFoodByFoodId
}

class FoodDTO{
	
}
class ClothDAO{ //의류에 관련하여 DB에 접근하는 담당 객체
	//findClothList
}

class ClothDTO{
	
}

class HeadApiService{//본사 API 서비스 접근 담당
	// API 서버경로, 요청변수준비, 인증키 삽입, 요청
	//json포맷 텍스트 확보
	// 정돈하는 과정으로 보기 좋게 리스트로 만들어썬것임
	//json 포맷 -> 정리된 객체 형태로 변환
	//      정리된 객체 형태 ->(DTO) 
}







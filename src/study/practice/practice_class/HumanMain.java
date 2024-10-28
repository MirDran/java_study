package study.practice.practice_class;

public class HumanMain {
	public static void main(String[] args) {
	Human person1 = new Human("홍길동","남성",35,187,88,"도사","A형","이상없음","이상없음");
	Human person2 = new Human("김철수","남성",22,145,35,"백수","O형","이상없음","이상없음");
	
		person1.history();
		System.out.println();
		person2.history();
	}
}
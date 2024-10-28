package study.practice.practice_class;

public class Human {

	String name;
	String sexual;
	int age;
	int tall;
	int weight;
	String job;
	String bloodType;
	String health;
	String sleep;
	
	
	Human(String name,String sexual,int age,int weight,int tall,
			String job,String bloodType,String heath,String sleep){
		
		this.name = name;
		this.sexual = sexual;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.health = heath;
		this.sleep = sleep;
	}
	
	
	void history() {
		System.out.printf
		("이름:%s\n성별:%s\n나이:%d\n키:%d\n몸무게:%d\n직업:%s\n혈액형:%s\n건강상태:%s\n수면중여부:%s\n",
				name,sexual,age,tall,weight,job,bloodType,health,sleep);
	}
	
}

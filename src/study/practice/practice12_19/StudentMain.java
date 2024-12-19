package study.practice.practice12_19;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("풀스택",2024);
		
		s1.stuInfo();
		
		s1.setStuDepa("백엔드");
		s1.setStuNum(2025);
		System.out.println();
		s1.stuInfo();
		
	}

}

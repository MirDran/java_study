package study.practice.practice12_19;

public class Student {

	private int stuNum;
	private String stuDepa;
	
	Student(String stuDepa, int stuNum){
		this.stuNum = stuNum;
		this.stuDepa = stuDepa;
	}
	
	public void setStuNum(int x) {
		this.stuNum = x;
	}
	
	public int getStuNum() {
		return this.stuNum;
	}
	
	public void setStuDepa(String S) {
		this.stuDepa = S;
	}
	
	public String getStuDepa() {
		return this.stuDepa;
	}
	
	public void stuInfo() {
		System.out.print("학과: " + this.stuDepa + " 학번 :" + this.stuNum);
	}
}

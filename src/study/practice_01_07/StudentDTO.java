package study.practice_01_07;

import java.sql.Date;
import java.time.LocalDate;

public class StudentDTO {

	int studno;
	String name;
	String id;
	int grade;
	LocalDate birthday;
	String tel;
	int height;
	int weight;
	int deptno1;
	int deptno2;
	int profno;
	String jumin;
	
	
	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public StudentDTO() {
		
	}
	
	public StudentDTO(int studno, String name, String id, String jumin, int grade, LocalDate birthday, String tel, int height,
			int weight, int deptno1, int deptno2, int profno) {
		this.studno = studno;
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.birthday = birthday;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
		this.jumin = jumin;
	}
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	public int getDeptno2() {
		return deptno2;
	}
	public void setDeptno2(int deptno2) {
		this.deptno2 = deptno2;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [studno=" + studno + ", name=" + name + ", id=" + id + ", grade=" + grade +
				 ", jumin="
					+ jumin +", birthday="
				+ birthday + ", tell=" + tel + ", height=" + height + ", weight=" + weight + ", deptno1=" + deptno1
				+ ", deptno2=" + deptno2 + ", profno=" + profno + "]";
	}
	
	
	
}

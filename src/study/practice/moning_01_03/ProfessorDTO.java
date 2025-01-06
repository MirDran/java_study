package study.practice.moning_01_03;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProfessorDTO {

	int profno;
	String name;
	String id;
	String position;
	int pay;
	int deptno;
	
	LocalDateTime hiredate;
	
	
	
	/*
	LocalDate hiredate; //자바 유틸 데이트 , 자바 sql데이트 2가지가 있다
	//자바도 주로 로컬데이트나 로컬데이트타임을 쓴다.
	
	
	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	*/

	public LocalDateTime getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDateTime hiredate) {
		this.hiredate = hiredate;
	}

	public ProfessorDTO() {
	}
	
	public ProfessorDTO(int profno) {
	
		this.profno = profno;
		
	}
	public ProfessorDTO(int profno, String name, String id, String position, int pay, int deptno) {
	
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.position = position;
		this.pay = pay;
		this.deptno = deptno;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "ProfessorDTO [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", deptno=" + deptno + "]";
	}
	
	
	
	
	
}

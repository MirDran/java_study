package study.practice_01_07;

import java.sql.Connection;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();

		List<StudentDTO> sList = studentDAO.selectStudent();

		for (StudentDTO p : sList) {
			System.out.println(p.toString());
			
			
//			ConvertDateUtill.convertLocalDateTimeToString(p.getBirthday());
//			앞에 sysout 붙여 출력 가능 느낌
			
			
		}
		System.out.println("====================");

		List<StudentDTO> sgList1 = studentDAO.findStudentListByGrade(1);

		for (StudentDTO p : sgList1) {
			System.out.println(p.toString());
		}
		System.out.println("====================");
		List<StudentDTO> sgList2 = studentDAO.findStudentListByGrade(2);

		for (StudentDTO p : sgList2) {
			System.out.println(p.toString());
		}
		System.out.println("====================");
		List<StudentDTO> sgList3 = studentDAO.findStudentListByGrade(3);

		for (StudentDTO p : sgList3) {
			System.out.println(p.toString());
		}
		System.out.println("====================");
		List<StudentDTO> sgList4 = studentDAO.findStudentListByGrade(4);

		for (StudentDTO p : sgList4) {
			System.out.println(p.toString());
		}
		System.out.println("====================");

	}

}

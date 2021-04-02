package main.sbxx.designpattern.transferobject;

import java.util.List;

/**
 * @author Dair
 * @since
 */
public class Test {
	public static void main(String[] args) {
		StudentDTO studentDTO = new StudentDTO();
		List<Student> allStudent = studentDTO.getAllStudent();
		for (Student student : allStudent) {
			System.out.println(student.toString());
		}
		Student student = allStudent.get(1);
		student.setUserId("lisi");
		studentDTO.updateStudent(student,1);
		
		for (Student student1 : allStudent) {
			System.out.println(student1.toString());
		}
	}
}

package main.sbxx.designpattern.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dair
 * @since
 */
public class StudentDTO {
	
	private List<Student> studentList;
	
	
	public StudentDTO() {
		studentList = new ArrayList<>();
		Student student1 = new Student("dair", "001");
		Student student2 = new Student("zhangsan", "002");
		studentList.add(student1);
		studentList.add(student2);
	}
	
	
	public void deleteStudent(Student student) {
		boolean remove = studentList.remove(student);
		if (remove) {
			System.out.println("学生已被删除" + student.getUserName());
		}
	}
	
	public Student getStudentByIndex(int index) {
		return studentList.get(index);
	}
	
	public List<Student> getAllStudent() {
		return studentList;
	}
	
	public void updateStudent(Student student, int index) {
		getStudentByIndex(index).setUserName(student.getUserName());
		System.out.println("用户更新成功" + student.getUserName());
	}
	
}

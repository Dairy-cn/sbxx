package main.sbxx.designpattern.transferobject;

/**
 * @author Dair
 * @since
 */
public class Student {
	
	private String userId;
	
	
	private String userName;
	
	
	public Student(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}

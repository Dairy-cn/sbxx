package main.sbxx.designpattern.prototype;

/**
 * @author Dair
 * @since
 */
public class Rectangle extends Shape {
	
	
	public Rectangle() {
		type = "Rectangle";
	}
	
	
	@Override
	void draw() {
		System.out.println("我是Rectangle的Draw方法");
	}
}

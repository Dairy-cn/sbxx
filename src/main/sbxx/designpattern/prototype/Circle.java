package main.sbxx.designpattern.prototype;

/**
 * @author Dair
 * @since
 */
public class Circle extends Shape {
	
	
	public Circle() {
		type = "Circle";
	}
	
	
	@Override
	void draw() {
		System.out.println("我是Circle的Draw方法");
	}
}

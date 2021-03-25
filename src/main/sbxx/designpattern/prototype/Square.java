package main.sbxx.designpattern.prototype;

/**
 * @author Dair
 * @since
 */
public class Square extends Shape {
	
	
	public Square() {
		type = "Square";
	}
	
	
	@Override
	void draw() {
		System.out.println("我是Square的Draw方法");
	}
}

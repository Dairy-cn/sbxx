package main.sbxx.designpattern.bridge;

/**
 * @author Dair
 * @since
 */
public class Circle extends Shape{
	
	public Circle(DrawApi drawApi) {
		super(drawApi);
	}
	
	@Override
	public void draw() {
		drawApi.drawCircle();
	}
}

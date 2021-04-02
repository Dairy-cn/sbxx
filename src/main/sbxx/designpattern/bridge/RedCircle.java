package main.sbxx.designpattern.bridge;

/**
 * @author Dair
 * @since
 */
public class RedCircle implements DrawApi{
	
	@Override
	public void drawCircle() {
		System.out.println("red");
	}
}

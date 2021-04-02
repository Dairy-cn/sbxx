package main.sbxx.designpattern.bridge;

/**
 * @author Dair
 * @since
 */
public class BlueCircle implements DrawApi{
	
	@Override
	public void drawCircle() {
		System.out.println("blue");
	}
}

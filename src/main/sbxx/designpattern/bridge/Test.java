package main.sbxx.designpattern.bridge;

/**
 * @author Dair
 * @since
 */
public class Test {
	public static void main(String[] args) {
		Circle red = new Circle(new RedCircle());
		Circle blue = new Circle(new BlueCircle());
		red.draw();
		blue.draw();
	}
}

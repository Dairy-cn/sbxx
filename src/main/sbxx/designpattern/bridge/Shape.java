package main.sbxx.designpattern.bridge;

/**
 * @author Dair
 * @since
 */
public abstract class Shape {
	protected DrawApi drawApi;
	
	public Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	
	public abstract  void draw();
}

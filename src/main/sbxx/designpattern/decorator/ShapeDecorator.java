package main.sbxx.designpattern.decorator;

/**
 * @author Dair
 * @since
 */
public abstract class ShapeDecorator implements Shape{
	
	protected Shape decoratorShape;
	
	
	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}
	
	@Override
	public void draw() {
		decoratorShape.draw();
	}
}
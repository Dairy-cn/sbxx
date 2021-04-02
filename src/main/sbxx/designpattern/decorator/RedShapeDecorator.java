package main.sbxx.designpattern.decorator;

/**
 * @author Dair
 * @since
 */
public class RedShapeDecorator extends ShapeDecorator{
	
	
	
	
	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw() {
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}
	
	
	public void setRedBorder(Shape shape){
		System.out.println("color is red");
	}
}

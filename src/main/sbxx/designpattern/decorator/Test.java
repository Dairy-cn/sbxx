package main.sbxx.designpattern.decorator;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		
		Shape shape=new Circle();
		RedShapeDecorator circle = new RedShapeDecorator(new Circle());
		RedShapeDecorator square = new RedShapeDecorator(new Square());
		shape.draw();
		System.out.println("---------------------");
		circle.draw();
		square.draw();
	}
	
	
}

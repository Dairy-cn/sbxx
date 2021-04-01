package main.sbxx.designpattern.factory;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		AbstractFactory abstractFactory=new CircleFactory();
		Shape factory = abstractFactory.getFactory();
		factory.draw();
		
		AbstractFactory squareFactory=new SquareFactory();
		Shape shape = squareFactory.getFactory();
		shape.draw();
	}
}


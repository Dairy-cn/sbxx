package main.sbxx.designpattern.strategy;

/**
 * @author Dair
 * @since
 */
public class OpearationMultiply  implements Strategy{
	
	@Override
	public int doOperation(int numA, int numB) {
		return numA*numB;
	}
}

package main.sbxx.designpattern.strategy;

/**
 * @author Dair
 * @since
 */
public class Content {
	
	private Strategy strategy;
	
	public Content(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executStrategy(int numA, int numB) {
		return strategy.doOperation(numA, numB);
	}
}

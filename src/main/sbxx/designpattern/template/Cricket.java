package main.sbxx.designpattern.template;

/**
 * @author Dair
 * @since
 */
public class Cricket  extends Game{
	
	@Override
	void initialize() {
		System.out.println("Cricket initialize");
	}
	
	@Override
	void startPlay() {
		System.out.println("Cricket startPlay");
	}
	
	@Override
	void endPlay() {
		System.out.println("Cricket endPlay");
	}
}

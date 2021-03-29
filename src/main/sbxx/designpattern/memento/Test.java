package main.sbxx.designpattern.memento;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	
	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState(1);
		originator.setState(2);
		CareTaker careTaker=new CareTaker();
		careTaker.add(originator.saveStateToMemento());
		originator.setState(3);
		careTaker.add(originator.saveStateToMemento());
		originator.setState(4);
		
		System.out.println("current state:"+originator.getState());
		originator.getStateFormMemento(careTaker.getMemento(0));
		System.out.println("first state:"+originator.getState());
		originator.getStateFormMemento(careTaker.getMemento(1));
		System.out.println("second state:"+originator.getState());
		
		
		
	}
}

package main.sbxx.designpattern.memento;

/**
 * @author Dair
 * @since
 */
public class Originator {

    private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	
	public Memento saveStateToMemento(){
		return  new Memento(state);
	}
	
	public void getStateFormMemento(Memento memento){
		state= memento.getState();
	}
}

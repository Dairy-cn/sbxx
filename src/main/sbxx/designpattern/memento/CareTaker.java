package main.sbxx.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dair
 * @since
 */
public class CareTaker {
	
	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	public Memento getMemento(int index) {
		return mementoList.get(index);
	}
	
}

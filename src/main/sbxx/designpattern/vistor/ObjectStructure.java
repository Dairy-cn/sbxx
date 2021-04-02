package main.sbxx.designpattern.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dair
 * @since
 */
public class ObjectStructure {
	
	private List<Hero> heroes=new ArrayList<>();
	
	
	public void handleRequest(Play play){
		for (Hero hero : heroes) {
			hero.accpet(play);
		}
	}
	
	public void addHero(Hero hero){
		heroes.add(hero);
	}
}

package main.sbxx.designpattern.vistor;

/**
 * @author Dair
 * @since
 */
public class ZhenHero extends Hero {
	@Override
	public void accpet(Play player) {
		player.visitZhen(this);
	}
	
	public void operate(){
		System.out.println("甄姬放出技能了");
	}
}

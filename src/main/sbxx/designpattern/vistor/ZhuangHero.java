package main.sbxx.designpattern.vistor;

/**
 * @author Dair
 * @since
 */
public class ZhuangHero extends Hero {
	@Override
	public void accpet(Play player) {
		player.visitZhuang(this);
	}
	
	public void operate(){
		System.out.println("庄周放出技能了");
	}
}

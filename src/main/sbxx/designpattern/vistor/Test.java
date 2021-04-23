package main.sbxx.designpattern.vistor;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	
	
	
	public static void main(String[] args) {
		ObjectStructure objectStructure=new ObjectStructure();
		Hero zhuang=new ZhuangHero();
		Hero zhen=new ZhenHero();
		objectStructure.addHero(zhuang);
		objectStructure.addHero(zhen);
		Play me=new PlayerMe();
		Play a=new PlayerA();
		objectStructure.handleRequest(me);
		objectStructure.handleRequest(a);
	}
}

package main.sbxx.designpattern.vistor;

/**
 * @author Dair
 * @since
 */
public class PlayerA implements Play{
	@Override
	public void visitZhuang(ZhuangHero element) {
		System.out.println("A使用庄周，开始使出技能");
		element.operate();
	}
	
	@Override
	public void visitZhen(ZhenHero element) {
		System.out.println("A使用甄姬，开始使出技能");
		element.operate();
		
	}
}

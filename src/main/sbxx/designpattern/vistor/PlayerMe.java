package main.sbxx.designpattern.vistor;

/**
 * @author Dair
 * @since
 */
public class PlayerMe implements Play{
	@Override
	public void visitZhuang(ZhuangHero element) {
		System.out.println("我使用庄周，开始使出技能");
		element.operate();
	}
	
	@Override
	public void visitZhen(ZhenHero element) {
		System.out.println("我使用甄姬，开始使出技能");
		element.operate();
		
	}
}

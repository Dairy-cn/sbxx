package main.sbxx.designpattern.proxy;

/**
 * @author Dair
 * @since
 */
public class ProxyClass implements Proxy{
	
	private RealClass realClass;
	
	@Override
	public void doMethod() {
		
		if(realClass==null){
			realClass=new RealClass();
			realClass.doMethod();
		}
	}
}

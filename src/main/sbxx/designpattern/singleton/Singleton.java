package main.sbxx.designpattern.singleton;

/**
 * @author Dair
 * @since
 */
public class Singleton {
	
	private static volatile Singleton singleton = null;
	
	
	private Singleton() {
	}
	
	public static Singleton getSingleton() {
		
		if (singleton == null) {
			synchronized (Singleton.class) {
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		System.out.println("输出"+singleton);
		return singleton;
	}
}

package main.sbxx.designpattern.singleton;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	
	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			new Thread(new Runnable(){
				@Override
				public void run() {
					System.out.println("当前线程"+Thread.currentThread().getName());
					
					Singleton.getSingleton();
				}
			}).start();
		}
	}
	
	
}

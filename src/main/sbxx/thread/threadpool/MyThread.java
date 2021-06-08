package main.sbxx.thread.threadpool;

/**
 * @author Dair
 * @since
 */
public class MyThread implements Runnable{
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"正在执行。。。。");
	}
}

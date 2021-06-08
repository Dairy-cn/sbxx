package main.sbxx.thread.threadpool;

import java.util.concurrent.*;

/**
 * @author Dair
 * @since
 */
public class SingleThreadExecutor {
	
	public static void main(String[] args) {
		//P3C要求手动创建线程
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ThreadPoolExecutor executorService = new ThreadPoolExecutor(1,
				1,
				0L,
				TimeUnit.MILLISECONDS,
				new LinkedBlockingDeque<>(5),
				Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
		Runnable myThread1 = new MyThread();
		Runnable myThread2 = new MyThread();
		Runnable myThread3 = new MyThread();
		Runnable myThread4 = new MyThread();
		Runnable myThread5 = new MyThread();
		executorService.execute(myThread1);
		executorService.execute(myThread2);
		executorService.execute(myThread3);
		executorService.execute(myThread4);
		executorService.execute(myThread5);
		executorService.execute(() -> {
			System.out.println(Thread.currentThread().getName() + "线程正在执行...");
		});
		executorService.shutdown();
	}
}

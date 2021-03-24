package main.sbxx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * @author Dair
 * @since
 */
public class Demo1 {
	
	
	public static void main(String[] args) {
		int m = 1 + 1;
		for (int i = 0; i < 100; i++) {
			if (i > 10) {
				System.out.println(i);
			}
		}
		LinkedHashSet set=new LinkedHashSet();
		ArrayList list=new ArrayList<>();
		HashMap<String,Object> map=new HashMap<>();
		System.out.println(m);
		ThreadLocal<Demo1> threadLocal=new ThreadLocal<>();
		threadLocal.set(new  Demo1());
	
		
	}
}

package main.sbxx.designpattern.iterator;

/**
 * @author Dair
 * @since
 */
public class Test {
	
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();){
			String next = (String) iterator.next();
			System.out.println(next);
		}
		
	}
}

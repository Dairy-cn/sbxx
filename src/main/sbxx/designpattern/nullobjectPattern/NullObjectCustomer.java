package main.sbxx.designpattern.nullobjectPattern;

/**
 * @author Dair
 * @since
 */
public class NullObjectCustomer extends AbstractCustomer {
	
	@Override
	public boolean isNull() {
		return true;
	}
	
	@Override
	public String getName() {
		return "我是空对象";
	}
}

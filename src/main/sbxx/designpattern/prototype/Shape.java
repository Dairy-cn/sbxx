package main.sbxx.designpattern.prototype;

/**
 * @author Dair
 * @since
 */
public abstract class Shape implements Cloneable {
	
	private String id;
	
	protected String type;
	
	abstract void draw();
	
	@Override
	protected Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}

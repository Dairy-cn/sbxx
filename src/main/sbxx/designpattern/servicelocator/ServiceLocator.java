package main.sbxx.designpattern.servicelocator;

/**
 * @author Dair
 * @since
 */
public class ServiceLocator {
	
	private static Cache cache;
	
	static {
		cache=new Cache();
	}
	
	public static Service getService(String jndiName){
		Service service = cache.getService(jndiName);
		if(service!=null){
			return service;
		}
		InitalContext initalContext = new InitalContext();
		Service newService = (Service) initalContext.lookup(jndiName);
		cache.addService(newService);
		return newService;
	}
}

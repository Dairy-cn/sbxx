package main.sbxx.designpattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dair
 * @since
 */
public class Cache {
	
	private List<Service> list;
	
	public Cache() {
		list = new ArrayList<>();
	}
	
	public void addService(Service service) {
		list.add(service);
	}
	
	
	public Service getService(String serviceName) {
		for (Service service : list) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				return service;
			}
		}
		return null;
	}
	
}

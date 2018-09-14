package code;

import java.util.Vector;

public class DepartureCity {
	
	String name;
	Vector<String> destinations = new Vector<String>();
	
	DepartureCity(String n) {
		name = n; 
	}
	 
	
	public void addDestination(String s) {
		
		destinations.add(s); 
		
	}
	
	public Vector<String> getDestinations(){
		
		return destinations; 
		
	}
}

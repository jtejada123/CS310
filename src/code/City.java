package code;

public class City {

/* 
 * Name = name of the city this object holds  
 * Previous = City object of the previous city 
 * flightCost = cost of flying from 'previous' city to this city  
 */
	
	String name = "";
	City previous = null; 
	Integer flightCost = 0;
	
	City (String n, City p, String c) {
		name = n; 
		previous = p; 
		flightCost = Integer.parseInt(c);
	}
	
	public City getPrevious () {
		return previous; 
	}
	
	public String getName () {
		return name;
	}
	
	public Integer getCost () {
		return flightCost;
	}		
	
}

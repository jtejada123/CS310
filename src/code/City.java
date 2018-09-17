package code;

public class City {

/* 
 * Name = name of the city this object holds  
 * Previous = City object of the previous city 
 * flightCost = cost of flying from 'previous' city to this city  
 */
	
	String name;
	City previous; 
	Integer flightCost; 
	Boolean printed = false; 

	
	public void make(String n, City p, Integer c){
		
		name = n; 
		previous = p;
		flightCost = c; 	
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
	
	public void setPrinted () {
		printed = true;
	}		
	

	public Boolean isPrinted () {
		return printed;
	}
}

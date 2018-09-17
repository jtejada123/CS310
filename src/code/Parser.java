package code;

import java.util.*;

public class Parser {
	
	Vector<City> cities = new Vector<City> (); 
   		
	public Vector<String> parse ( Vector<String> data ) {
		
		//check if empty
		if(data.isEmpty()) {
			return null; 
		}
		
		//save origin city in cities vector
		String originCity = data.get(0); 
		City c = new City();
		c.make(originCity, null, 0);
		cities.add(c);
		
		String flight;
		
		// Loop through data to initialize City objects and 
		// store all direct flights into cities vector... 
		// Start at second line of input file (skip origin city on first line) 
		for(int i = 1; i < data.size(); i++) {
			
			flight = data.get(i);
			
			String departureCity = flight.substring(0, 1);
			// turn string to object  
			//City departureCity = getCity(departureCityString, cities);
			String destinationCity = flight.substring(2, 3); 
			Integer flightCost = Integer.parseInt(flight.substring(4).replaceAll("\\s", ""));
			City dep = new City();
			City dest = new City();
					//replaceAll("\\s", ""); 
			
			// if departure city isn't in 'cities' vector yet then add it, otherwise skip
//	 		if ( getCity(departureCity, cities) == null) {
//	 			
//				
//				//initialize new City object and add to cities vector
//				c = new City(departureCity, null, flightCost, direct);
//				cities.add(c);
//	 		
//	 		}
	 		
	 		// if destination city doesn't exist yet, create it 
			if ( getCity(destinationCity, cities) == null ) {
				
				
				// Check if dep is origin city
				if( getCity(departureCity, cities) == null ) {
					dep.make(departureCity, null, 0);
				}
				else {
					dep = getCity(departureCity, cities);
				}
				
				
				dest.make(destinationCity, dep, flightCost);
				cities.add(dest);
			}
			
		}
		
		Vector<String> output = printInfo(cities);
		
		return output;
	}
	
	// return City object given its name and a vector of City objects to search through 
	public City getCity(String s, Vector<City> vec) {
		
		for(int i = 0; i < vec.size(); i++) {
				
			if (s == vec.get(i).getName()){
				return vec.get(i); 
			}
//			else {
//				if (vec.get(i).getPrevious() != null) {
//					return new City (s, vec.get(i).getPrevious(), vec.get(i).getCost()); 
//				}
//				else {
//					return new City (s, null, vec.get(i).getCost()); 
//				}
//			}
		}
		
		return null; 
		
	}
	
	public Vector<String> printInfo (Vector <City> v){
		
		Vector<String> print = new Vector<String>(); 
		
		print.add("Destination    Flight Route from "+ v.get(0).getName() + "    Total Cost");
		
		
		for (int i = 1; i < v.size(); i++) {
			
			City f = v.get(i); 
			String name = f.getName(); 
			String prev = f.getPrevious().getName();
			String cost = f.getCost().toString();
			
			if (prev == v.get(0).getName()) {
				print.add(name + "                   " + prev + ", " + name 
					+ "                      $" + cost);
			}
			else {
				print.add(name + "                   " + v.get(0).getName() + ", " 
					+ prev + ", " + name + "                      $" + cost);
			}
			
		}
		
		return print;
		
	}
	
}

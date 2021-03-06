package code;

import java.util.*;

public class Parser {
	
	Vector<City> cities = new Vector<City> (); 
   	
	//parse through the input file and return a vector of Strings to writeFile for output
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
			City dep;
	 		
	 		// if destination city doesn't exist yet, create it 
			if ( getCity(destinationCity, cities) == null ) {
				
				
				// Check if dep is origin city
				if( getCity(departureCity, cities) == null ) {
					dep = new City();
					dep.make(departureCity, null, 0);
				}
				else {
					dep = getCity(departureCity, cities);
				}
				
				City dest = new City ();
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
				
			if ( s.equals(vec.get(i).getName()) ){
				return vec.get(i); 
			}
		}
		
		return null; 
		
	}
	
	//return the cities vector
	public Vector<City> getVec() {
		return cities;
	}
		
	//Store the output file info line by line into a vector of Strings
	public Vector<String> printInfo (Vector <City> v){
		
		Vector<String> print = new Vector<String>(); 
		String originCity = v.get(0).getName().replaceAll("\\s", "");
		
		print.add("Destination    Flight Route from "+ originCity + "    Total Cost");
		
		
		for (int i = 1; i < v.size(); i++) {
			
			City f = v.get(i); 
		
			if( !f.isPrinted() ) {

				v.get(i).setPrinted();
				
				String name = f.getName().replaceAll("\\s", ""); 
				City prev = f.getPrevious();
				String prevName = prev.getName().replaceAll("\\s", "");
				String cost = f.getCost().toString();
				Vector<String> routes = new Vector<String>();
				
				//check if direct flight from origin city
				if ( prevName.equals(originCity)) {
					print.add(name + "               " + prevName + ", " + name 
						+ "                   $" + cost);
				}
				else {

					Integer total = f.getCost();
					routes.add(name); 

					while( !prevName.equals(originCity) ) {
						
						routes.add(prevName);
						total += prev.getCost();
						
						//update prevName 
						prev = prev.getPrevious();
						prevName = prev.getName().replaceAll("\\s", "");		
						
					}
					
					String route = originCity + ", ";
					
					for (int j = routes.size()-1; j > 0; j--) {
						route = route + routes.get(j) + ", ";
					}
					
					route = route + routes.get(0); 
					
					String totalCost = total.toString();
					
					if(routes.size() == 2) {
						print.add(name + "               " + route + "                $" + totalCost);
					}
					else if(routes.size() == 3) {
						print.add(name + "               " + route + "             $" + totalCost);
					}
					else if (routes.size() > 3){
						print.add(name + "               " + route + "          $" + totalCost);
					}
				}
			}		
		}
		
		return print;
		
	}
	
}

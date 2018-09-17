package code;

import java.util.*;

public class Parser {
	
	Vector<City> cities = new Vector<City> (); 

   		
	public Vector<City> parse ( Vector<String> data ) {
		
		//check if empty
		if(data.isEmpty()) {
			return cities; 
		}
		
		//save origin city in cities vector
		String line = data.get(0);
		City c = new City(line, null, "0"); 
		cities.add(c);
		
		//start at second line of input file 
//		for(int i = 1; i < data.size(); i++) {
			
			line = data.get(1);
			
			String departureCityString = line.substring(0, 1);
			String destinationCity = line.substring(2, 3); 
			String flightCost = line.substring(4); 
			
			City departureCity = getCity(departureCityString, cities);
			
			
			
			c = new City(destinationCity, departureCity, flightCost);
			
			System.out.println("Total Cost: " + c.getCost());

			
//			City c1 = new City(departureCity); 
//			City c2 = new City(arrivalCity); 
			
//			for(int j = 0; j < visitedLocations.size(); j++) {
//				
//				if( !visitedLocations.contains(departureCity)) {
//					visitedLocations.add(departureCity);
//				}
//				else if( !visitedLocations.contains(arrivalCity)) {
//					visitedLocations.add(arrivalCity);
//					City c1 = new City(arrivalCity); 
//					c.setPrevious(departureCity);
//					cities.add(c1);
//					
//				}
//			}
//		}
//		
//		//get first line of input file, store into locations vector
//		String line = data.get(0);
//		locations.add(line); 
//		
//		String originCity = data.get(0);
//				
//		// store all possible locations in a vector (used in next for loop)
//		//start at second line of input file (skip origin city) 
//		for(int i = 1; i < data.size(); i++) {
//			
//			line = data.get(i);
//			
//			String departureCity = line.substring(0, 1); 
//			String arrivalCity = line.substring(2, 3);  
//			
//			//record flights departing from origin city 
//			if (departureCity == originCity) {
//				Flight f = new Flight(arrivalCity, originCity + ", " + arrivalCity, line.substring(4)); 
//				displayVec.add(f);
//				locations.add(arrivalCity);
//			}
//			else {
//				if ( locations.contains(departureCity) ){
//					
//				}
//			}
//			
//			
//			if ( !locations.contains(departureCity) ){
//				locations.add(departureCity); 
//			}
//			if ( !locations.contains(arrivalCity) ){
//				locations.add(arrivalCity); 
//			}									
//			//Flight f = new Flight(data.get(0), data.get(0), 1 ); 
//		
//		}	
//		
//		//start creating flights 
//		//start at second line of input file (skip origin city) 
//		for(int i = 1; i < data.size(); i++) {
//			
//			line = data.get(i);
//			String departureCity = line.substring(0, 1); 
//			String arrivalCity = line.substring(2, 3);  
//			
//			if ( !locations.contains(departureCity) ){
//				DepartureCity temp = new DepartureCity(departureCity); 
//				temp.addDestination(arrivalCity);
//			}
//			
//		
//											
//			
//			//Flight f = new Flight(data.get(0), data.get(0), 1 ); 
//				
//		}
		return cities;
	}
	
	// return City object given its name and a vector of City objects to search through 
	public City getCity(String s, Vector<City> vec) {
		
		for(int i = 0; i < vec.size(); i++) {
				
			if (s == vec.get(i).getName()){
				return vec.get(i); 
			}
		
		}
		
		return null; 
		
	}
	
}

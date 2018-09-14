package code;

import java.util.*;

public class Parser {
	
	Map<String, Vector<String> > displayMap = new Map<String, Vector<String> > (); 
	Vector<Flight> displayVec = new Vector<Flight> (); 
	Vector<String> locations = new Vector<String> (); 
   		
	public Vector<Flight> parse ( Vector<String> data ) {
		
		//check if empty
		if(data.isEmpty()) {
			return displayVec; 
		}
		
		//get first line of input file, store into locations vector
		String line = data.get(0);
		locations.add(line); 
				
		// store all possible locations in a vector (used in next for loop)
		//start at second line of input file (skip origin city) 
		for(int i = 1; i < data.size(); i++) {
			
			line = data.get(i);
			String departureCity = line.substring(0, 1); 
			String arrivalCity = line.substring(2, 3);  
			
			if ( !locations.contains(departureCity) ){
				locations.add(departureCity); 
			}
			if ( !locations.contains(arrivalCity) ){
				locations.add(arrivalCity); 
			}									
			//Flight f = new Flight(data.get(0), data.get(0), 1 ); 
		
		}	
		
		//start creating flights 
		//start at second line of input file (skip origin city) 
		for(int i = 1; i < data.size(); i++) {
			
			line = data.get(i);
			String departureCity = line.substring(0, 1); 
			String arrivalCity = line.substring(2, 3);  
			
			
		
											
			
			//Flight f = new Flight(data.get(0), data.get(0), 1 ); 
				
		}
		
		System.out.print("Number of locations found: " + locations.size());

		return displayVec;
	}
}

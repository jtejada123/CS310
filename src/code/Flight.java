package code;

public class Flight {
	
	String destination = "";
	String route = "";
	int cost = 0; 

	
	Flight(String d, String r, int c) {
		
		destination = d; 
		route = r; 
		cost = c; 
		
	}
	
	public String getDestination(Flight f) {
		
		return f.destination; 
	}
	
	public String getRoute(Flight f) {
		
		return f.route; 
	}

	public int getCost(Flight f) {
	
		return f.cost; 
	}

}

package code;

import java.io.*;
import java.util.*;

public class MapReader {
	
	
/*  
 	** This class just contains the main function to read from the command line. 
	** Also handles all File I/O. 
*/
			
	public static void main(String args[]) throws IOException {
		
		String inputFile = args[0]; 
		String outputFile = args[1]; 
		Vector<String> flightInfo = readFile(inputFile);  
		
		if ( writeFile(outputFile, flightInfo) ) {
			return;
		}
		else {
			System.out.println("Error: Could not write file");
		}
		
		
	}
	
	//reads file and stores all lines into vector
	public static Vector<String> readFile (String fileName) throws IOException {
		
		BufferedReader in = null; 
		
		String line; 
		Vector<String> vec = new Vector<String>(); 
		
		try {
			in = new BufferedReader(new FileReader(fileName));
			
			
			//read through file, store into vector line by line
			while( (line = in.readLine()) != null) {
				
				vec.add(line); 
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
			
		}
		
		return vec; 
	}
	
	// writes output file
	public static Boolean writeFile(String file, Vector<String> mapInfo) throws IOException {
		
		BufferedWriter out = null; 
		FileWriter writer = null; 
		Parser p = new Parser(); 
		Vector<String> output = p.parse(mapInfo); 
		
		try {
			writer = new FileWriter(file);
			out = new BufferedWriter(writer);
			
/*______________Output File Display_______________________*/
			
			for(int i = 0; i < output.size(); i++ ) {
				out.write(output.get(i));
				out.newLine();
			}
		
/*______________Output File Display_______________________*/
	
		} finally {
			if (out != null) {
				out.close();
			}
		}
		return true;
	}
}

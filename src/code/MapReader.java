package code;

import java.io.*;
import java.util.*;

public class MapReader {
	
	public static void main(String args[]) throws IOException {
		
		String inputFile = args[0]; 
		String outputFile = args[1]; 
		Vector<String> file = ReadFile(inputFile);  
		
		
	}
	
	public static Vector<String> ReadFile (String fileName) throws IOException {
		
		BufferedReader in = null; 
		BufferedWriter out = null; 
		FileWriter writer = null; 
		String line; 
		Vector<String> vec = new Vector<String>(); 
		
		try {
			in = new BufferedReader(new FileReader(fileName));
//			writer = new FileWriter(outputFile);
//			out = new BufferedWriter(writer);
			
			while( (line = in.readLine()) != null) {
				
				vec.add(line); 
				
				
				
//				out.write("Destination    Flight Route from " + originCity + "    Total Cost");
//				out.newLine();
			}
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
		return vec; 
	}
	
}

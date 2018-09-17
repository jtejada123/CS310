package tests;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Vector;

import code.*;

public class MapReaderTests {
	
	@Test
	public void testReadFile() throws IOException {
		
		MapReader mr = new MapReader();
		Vector <String> file = MapReader.readFile("inputfile.txt");
		assertEquals(file.get(0), "P");
		
	}
	
	@Test
	public void testParser() throws IOException {
		
		MapReader mr = new MapReader();
		Vector<String> data = MapReader.readFile("inputfile.txt");
		Parser p = new Parser ();
		Vector<String> info = p.parse(data);
		
		// test for correct number of cities stored into cities vector
		//assertEquals("Number of Flights", cities.size()-1, 10);
		
	}
	

}

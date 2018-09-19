package tests;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.util.Vector;

import code.*;

public class ParserTest {

	@Test
	public void testParseFunction() throws IOException {
		
		MapReader mr = new MapReader();
		Vector<String> data = MapReader.readFile("inputfile.txt");
		Parser p = new Parser ();
		Vector<String> info = p.parse(data);
		
		// test for correct number of cities stored into cities vector
		//assertEquals("Number of Flights", cities.size()-1, 10);
		
	}
	
}

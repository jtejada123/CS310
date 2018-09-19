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
		
		// test to see if parse function returns a vector successfully
		assertTrue( p.parse(data)!= null);	
	}
	
	@Test
	public void testGetCity() throws IOException {
		
		MapReader mr = new MapReader();
		Vector<String> data = MapReader.readFile("inputfile.txt");
		Parser p = new Parser ();
		Vector<String> info = p.parse(data);
		
		Vector<City> cities = p.getVec();
		City c1 = cities.get(0);
		String name = c1.getName(); 
		
		// test to see if getCity returns the correct origin city object
		assertTrue( p.getCity("P",cities) == c1);	
	}
	
	@Test
	public void testGetVec() throws IOException {
		
		MapReader mr = new MapReader();
		Vector<String> data = MapReader.readFile("inputfile.txt");
		Parser p = new Parser ();
		
		// test to see if getVec successfully returns the cities vector
		assertTrue( p.getVec() != null);	
	}
	
	@Test
	public void testPrintInfo() throws IOException {
		
		MapReader mr = new MapReader();
		Vector<String> data = MapReader.readFile("inputfile.txt");
		Parser p = new Parser ();
		p.parse(data);
		Vector<String> info = p.printInfo(p.getVec());
		
		// test to see if the printInfo function returns proper output Strings 
		assertTrue( info.isEmpty() != true);	
	}
	
}

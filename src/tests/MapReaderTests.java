package tests;
import junit.framework.*;

import java.io.*;
import java.util.Vector;

import code.MapReader; 

public class MapReaderTests extends TestCase {
	
	public void testReadFile() throws IOException {
		
		MapReader mr = new MapReader();
		Vector <String> file = MapReader.ReadFile("inputfile.txt");
		assertEquals(file.get(0), "P");
		
	}
	
}

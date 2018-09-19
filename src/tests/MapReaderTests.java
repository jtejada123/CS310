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
	public void testWriteFile() throws IOException {
		
		MapReader mr = new MapReader();
		Vector <String> mapInfo = MapReader.readFile("inputfile.txt");
		
		assertTrue( MapReader.writeFile("outputfile.txt", mapInfo) == true);
	}
	

}

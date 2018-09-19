package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.*;

public class CityTests {

	@Test
	public void testMake() {
		
		City c1 = new City();
		City c2 = new City();
		
		c1.make("LA", c2, 0);
		
		assertEquals(c1.getName(), "LA");
		assertEquals(c1.getPrevious(), c2);
		assertTrue(c1.getCost() == 0);
	}
	
	@Test
	public void testGetPrevious() {
		
		City c1 = new City();
		City c2 = new City();
		
		c1.make("LA", c2, 0);
		
		assertEquals(c1.getPrevious(), c2);
	}
	
	@Test
	public void testGetName() {
		
		City c1 = new City();
		City c2 = new City();
		
		c1.make("LA", c2, 0);
		
		assertEquals(c1.getName(), "LA");
	}
	
	@Test
	public void testGetCost() {
		
		City c1 = new City();
		City c2 = new City();
		
		c1.make("LA", c2, 0);
		
		assertTrue(c1.getCost() == 0);
	}
	
	@Test
	public void testSetPrinted() {
		
		City c1 = new City();

		assertTrue(c1.isPrinted() == false);
		c1.setPrinted();
		assertTrue(c1.isPrinted() == true);
	}
	
	@Test
	public void testIsPrinted() {
		
		City c1 = new City();

		c1.setPrinted();
		assertTrue(c1.isPrinted() == true);
	}
	
	
}

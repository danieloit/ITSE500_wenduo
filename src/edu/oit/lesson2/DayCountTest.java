package edu.oit.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayCountTest {

	 @Test
	  public void testIsLeap() {
	    assertEquals(DayCount.dayCount(2001, 9),30);
	    assertEquals(DayCount.dayCount(2009, 2),28);
	    assertEquals(DayCount.dayCount(2000, 2),29);
	    assertEquals(DayCount.dayCount(1900, 2),28);
	  }
	          
}

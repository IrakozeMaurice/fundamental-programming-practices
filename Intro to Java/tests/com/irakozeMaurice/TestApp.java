package com.irakozeMaurice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestApp {

	@Test
	public void testApp() {
		
		String result = App.hello();
		assertEquals(result,"ok");
	}
	
	@Test
	public void testCalculateSum() {
		int[] arr = {2,3,4};
		int expected = 2+3+4;
		int result = App.calculateSum(arr);
		assertTrue(expected == result);
	}
}

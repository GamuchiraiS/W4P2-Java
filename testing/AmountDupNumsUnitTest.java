package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountDupNumsUnitTest {

	@Test
	public void AmountDupNumsTest() {
		//Arrange 
		int expectedAmount = 2;
		int actualAmount; 
		int[] valueArrTest = { 50, 50, 20, 20, 4, 60, 88, 7, 9, 1 };
		Duplicate dp = new Duplicate();
		
		//Act
		actualAmount = dp.AmountDupNums(valueArrTest);
		
		//Assert
		assertTrue("Amount calculated incorrectly", actualAmount == expectedAmount);
	}

}

package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountDupNumsUnitTest2 {

	@Test
	public void AmountDupNumsTest2() {
		//Arrange 
		int expectedAmount = 3;
		int actualAmount; 
		int[] valueArrTest = { 7, 8, 2, 2, 4, 60, 8, 7, 9, 1 };
		Duplicate dp = new Duplicate();
		
		//Act
		actualAmount = dp.AmountDupNums(valueArrTest);
		
		//Assert
		assertTrue("Amount calculated incorrectly", actualAmount == expectedAmount);
	}

}

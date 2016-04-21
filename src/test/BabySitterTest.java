package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BabySitter;

public class BabySitterTest {
	
	
	@Test
	public void ifStringIsInUpperCaseIntegerIsExpected(){
		BabySitter babySitter = new BabySitter();
		assertEquals(17,babySitter.timeProcessing("5:00PM"));
	}
	
	@Test
	public void ifStringIsPmTheMethodAdds12AndReturnsInteger(){
		BabySitter babySitter = new BabySitter();
		assertEquals(17,babySitter.timeProcessing("5:00PM"));
	}
	
	@Test
	public void ifStringIsAmTheMethodDoesNotAddAndReturnsInteger(){
		BabySitter babySitter = new BabySitter();
		assertEquals(4,babySitter.timeProcessing("4:00AM"));
	}
	
	@Test
	public void ifStringIsNotInSpecifiedFormatItReturns13(){
		BabySitter babySitter = new BabySitter();
		assertEquals(13,babySitter.timeProcessing("5:00GM"));
	}
	
	@Test
	public void ifThreeParametersAreGivenAsInputItReturnsInteger(){
		BabySitter babySitter = new BabySitter();
		assertEquals(0,babySitter.salary(17,10,4));
	}
	
	@Test
	public void ifInTimeisEarlierThan5PMItReturnsInvalidEntry(){
		BabySitter babySitter = new BabySitter();
		assertEquals(0,babySitter.salary(14, 11, 4));
	}
}
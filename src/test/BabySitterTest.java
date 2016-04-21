package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.BabySitter;

public class BabySitterTest {
	BabySitter babySitter;
	@Before
	public void setUp(){
		babySitter = new BabySitter();
	}
	@Test
	public void ifStringIsInUpperCaseIntegerIsExpected(){
		
		assertEquals(17,babySitter.timeProcessing("5:00PM"));
	}
	
	@Test
	public void ifStringIsPmTheMethodAdds12AndReturnsInteger(){
		
		assertEquals(17,babySitter.timeProcessing("5:00PM"));
	}
	
	@Test
	public void ifStringIsAmTheMethodDoesNotAddAndReturnsInteger(){
		
		assertEquals(4,babySitter.timeProcessing("4:00AM"));
	}
	
	@Test
	public void ifStringIsNotInSpecifiedFormatItReturns13(){
		
		assertEquals(13,babySitter.timeProcessing("5:00GM"));
	}
	
	@Test
	public void ifThreeParametersAreGivenAsInputItReturnsInteger(){
		
		assertEquals(0,babySitter.salary(17,10,4));
	}
	
	@Test
	public void ifInTimeisEarlierThan5PMItReturnsInvalidEntry(){
		
		assertEquals(0,babySitter.salary(14, 11, 4));
	}
	
	@Test
	public void ifOutTimeisLaterThan4AMItReturnsInvalidEntry(){
		
		assertEquals(0,babySitter.salary(17, 11, 5));
	}
	
	@Test
	public void ifBedTimeisLessThanInTimeItReturnsInvalidEntry(){
		
		assertEquals(0,babySitter.salary(17, 3, 4));
	}
	
	@Test
	public void salaryMethodCheck(){
		
		assertEquals(140,babySitter.salary(17, 22, 4));
	}
	
	@Test
	public void fractionalHoursRoundedToFloorValue(){
		
		assertEquals(3,babySitter.timeProcessing("3:45aM"));
	}
}
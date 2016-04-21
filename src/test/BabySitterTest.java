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
}
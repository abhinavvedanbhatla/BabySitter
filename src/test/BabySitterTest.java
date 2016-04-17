package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BabySitter;

public class BabySitterTest {

	@Test
	public void if5PmIsGivenTheMethodReturns17(){
	
		String a = "5:00PM";
		BabySitter babySitter = new BabySitter();
		assertEquals(17,babySitter.timeProcessing(a));
		
	}
	
	
	
	

}

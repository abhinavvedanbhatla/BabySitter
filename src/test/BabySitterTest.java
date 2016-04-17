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
	
	@Test
	public void if4AmIsGivenTheMethodReturns4(){
	
		String a = "4:00AM";
		BabySitter babySitter = new BabySitter();
		assertEquals(4,babySitter.timeProcessing(a));
		
	}
	
	@Test
	public void if4PmIsGivenTheMethodReturns13(){
	
		String a = "4:00PM";
		BabySitter babySitter = new BabySitter();
		assertEquals(13,babySitter.timeProcessing(a));
		
	}
	
	@Test
	public void if5AmIsGivenTheMethodReturns13(){
	
		String a = "5:00AM";
		BabySitter babySitter = new BabySitter();
		assertEquals(13,babySitter.timeProcessing(a));
		
	}
	
	@Test
	public void salaryMethodCheck(){
		BabySitter babySitter = new BabySitter();
		assertEquals(140,babySitter.salary(17, 22, 4));
	}
	
	
	
	

}

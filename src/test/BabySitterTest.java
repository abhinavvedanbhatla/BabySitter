package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BabySitter;

public class BabySitterTest {

	@Test
	public void BabySitterReturnsStartTimeas17(){
		BabySitter babySitter = new BabySitter();
		assertEquals(17,babySitter.getStartTime());
	}
}

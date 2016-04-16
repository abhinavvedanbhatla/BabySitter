package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.BabySitter;

public class BabySitterTest {

	@Test
	public void whenIntegerIsGivenItReturnsInteger(){
		BabySitter babySitter = new BabySitter();
		assertEquals(15,babySitter.getStartTime());
	}
}

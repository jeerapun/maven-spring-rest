package tmn.v1.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHelloRestSpring {

	@Test
	public void testSayHelloRestSpring() 
	{
		HelloRestSpring helloRestSpring = new HelloRestSpring();
		assertEquals("Hello Rest Spring", helloRestSpring.sayHello());
	}

}

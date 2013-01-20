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
	
	@Test
	public void testNotSayHelloRestSpring() 
	{
		HelloRestSpring helloRestSpring = new HelloRestSpring();
		assertFalse("Hi Rest Spring".equals(helloRestSpring.sayHello()));
	}
	
	@Test
	public void testInputSayHello() 
	{
		HelloRestSpring helloRestSpring = new HelloRestSpring();
		String helloWord = "My Rest Spring";
		assertEquals(helloWord,helloRestSpring.sayHello(helloWord));
	}

}

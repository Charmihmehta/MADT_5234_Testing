package code_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNewclass_1 {

	@Test
	public void testhelloWorld() {
		//1. write the code to run the function
		Newclass_1 n = new Newclass_1();
		String actualOutput = n.helloWorld() ;
		
		//2. test expected output == actual output
		// Pick any jUnit function
		
		assertEquals("Hello world!!!!", actualOutput);
	}
	
	@Test
	public void testconverter(){
		Newclass_1 n1 = new Newclass_1();
		
		assertEquals(125f ,  n1.converter(100, "CAD"),0);
		assertEquals(37.50f ,  n1.converter(50, "USD"),0);
		assertEquals(-1 ,  n1.converter(50, "SD"),0);
	}

}

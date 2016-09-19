package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class genericTest {

	@Test
	public void test() {
		genericobject <Integer> intob;
		intob = new genericobject <Integer>(12);
		Integer obj = new Integer(12);
		assertEquals(obj,intob.getob());
		
		genericobject <String> strob;
		strob = new genericobject <String> ("Sharat");
		String strobj = "Sharat";
		assertEquals(strobj,strob.getob());
	}

}

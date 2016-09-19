package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class StacksDemoTest {

	StacksDemo popins = new StacksDemo();
	boolean result = false;
	@Test
	public void test() {
		result = popins.pop();
		assertEquals(false,result);
		popins.push("red");
		popins.push("blue");
		popins.push("green");
		result = popins.pop();
		assertEquals(true,result);
		result = popins.pop();
		assertEquals(true,result);
		result = popins.pop();
		assertEquals(true,result);
		
	}

}

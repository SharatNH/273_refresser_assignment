package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDemoTest {
    ArrayDemo arr=new ArrayDemo();
	@Test
	public void test() {
		int[] nums ={10,0,20,30};
		int target=30;
		int result = ArrayDemo.myfunction( nums, target);
		assertEquals(1,result);
		
		
	}

}

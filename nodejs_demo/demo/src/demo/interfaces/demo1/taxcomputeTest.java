package demo.interfaces.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class taxcomputeTest {

	taxcompute car=new taxcompute();
	private static final double digit=1e-15;
	@Test
	public void testtacxompute() {
		double result = car.nettax(1800000,80000,"SUV");
		double res = 2150000;
		assertEquals(result,res,digit);

	}

}

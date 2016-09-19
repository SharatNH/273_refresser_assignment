package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueDemoTest {
	QueueDemo mcd = new QueueDemo();
	boolean result;
	@Test
	public void testdeQ() {
		
		if(!mcd.isEmpty())
		{
			mcd.addtoQ(1);
			mcd.addtoQ(2);
			mcd.addtoQ(3);
		}
		result=mcd.deQ();
		assertEquals(true,result);
		result=mcd.deQ();
		assertEquals(true,result);
		result=mcd.deQ();
		assertEquals(true,result);
		result=mcd.deQ();
		assertEquals(false,result);
	}

}

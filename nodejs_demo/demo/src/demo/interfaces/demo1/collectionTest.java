package demo.interfaces.demo1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class collectionTest {

	collectionDemo c = new collectionDemo();
	
	@Test
	public void testsort() {
		
		ArrayList<String> friendList = new ArrayList<>();
		friendList.add("Rakesh");
		   friendList.add("Shashank");
		   friendList.add("Tej");
		   friendList.add("Avinash");
		   c.sort(friendList);
		   
		   ArrayList<String> sortList = new ArrayList<>();
		   sortList.add("Avinash");
		   sortList.add("Rakesh");
		   sortList.add("Shashank");
		   sortList.add("Tej");
		   
			   c.sort(friendList);
			   
			   assertEquals(friendList,sortList);
		   
	}

}

package demo.interfaces.demo1;

import java.util.ArrayList;

import java.util.Collections;

public class collectionDemo {
   public static void main(String [] args)
   {
	   collectionDemo friend = new collectionDemo();
	   ArrayList<String> friendList = new ArrayList<>();
	   friendList.add("Rakesh");
	   friendList.add("Shashank");
	   friendList.add("Tej");
	   friendList.add("Avinash");
	   
	   friend.sort(friendList);
	   
   }
   public ArrayList<String> sort(ArrayList<String> llist)
   {
	   Collections.sort(llist);
	   for(int i=0;i<llist.size();i++)
		   System.out.println(llist.get(i));
    
	   return llist;
	   
   }
   }


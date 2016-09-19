package demo.interfaces.demo1;

public class DispThread extends Thread
{
  String msg;
  public void run()
  {
	  for(int i=0;i<100;i++)
	  {
		  System.out.println(msg);
		  
	  }
  }
  
  DispThread( String m)
  {
	  msg=m;
  }
}

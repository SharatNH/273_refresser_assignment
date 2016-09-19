package demo.interfaces.demo1;

public interface Dispthread1 implements Runnable {
	String msg;
	  public void run()
	  {
		  for(int i=0;i<100;i++)
		  {
			  System.out.println(msg);
			  
		  }
	  }
	  
	  DispThread1( String m)
	  {
		  msg=m;
	  }
	}

}

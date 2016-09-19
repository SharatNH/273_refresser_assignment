package demo.interfaces.demo1;

public class DispThread2 implements Runnable {
	String msg;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
			for(int i=0;i<100;i++)
			{
				System.out.println(msg);

			}
		}
	
		DispThread2( String m)
		{
			msg=m;
		}


	}



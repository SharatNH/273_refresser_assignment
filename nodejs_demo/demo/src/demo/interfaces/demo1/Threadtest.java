package demo.interfaces.demo1;

public class Threadtest {

	public static void main(String[] args) {
		DispThread dt1 = new DispThread("Hello");
		DispThread dt2 = new DispThread("World");
		dt1.start();
		dt2.start();
	
	}

}

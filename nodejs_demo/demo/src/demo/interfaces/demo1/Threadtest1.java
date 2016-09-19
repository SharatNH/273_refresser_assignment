package demo.interfaces.demo1;

public class Threadtest1 {

	public static void main(String[] args) {
		DispThread dt1 = new DispThread("Hello");
		DispThread dt2 = new DispThread("World");
		Thread t1 = new Thread(dt1);
		Thread t2 = new Thread(dt1);
		t1.start();
		t2.start();
	}

}

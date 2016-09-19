package demo;



	public class genericDemo {
	  public static void main(String args[]) {
	    // Create a Gen reference for Integers.
		  genericobject<Integer> integer = new genericobject<Integer>(12);
	    integer.showType();

	    // no cast is needed.
	    int num = integer.getob();
	    System.out.println("value: " + num);

	    // Create a Gen object for Strings.
	    genericobject<String> string = new genericobject<String>("Sharat");
	    string.showType();

	    String str = string.getob();
	    System.out.println("value: " + str);
	  }
	}
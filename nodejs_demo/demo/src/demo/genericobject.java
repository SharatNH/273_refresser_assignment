package demo;


	public class genericobject<T> {
		  T ob;

		  genericobject(T o) {
		    ob = o;
		  }

		  T getob() {
		    return ob;
		  }

		  void showType() {
		    System.out.println("Type of T is " + ob.getClass().getName());
		  }
		}


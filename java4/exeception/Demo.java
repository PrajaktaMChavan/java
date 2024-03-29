package exeception;
//Exception is occured but not handled.
public class Demo {
	public static void main (String[] args) {
		
		try {
			System.out.println("from try block");
			int a=10/0;
			
		}
		finally {
			System.out.println("from finally block");
			
		}
		System.out.println("normal flow continue");
		
	}

}

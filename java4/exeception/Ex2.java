package exeception;

public class Ex2 {
	public static void main(String[] args) {
		try {
			int res=10/0;
		}catch(ArithmeticException ae) {
			System.out.println("from ArithmeticException");
		}
		catch(NullPointerException ne) {
			System.out.println("from NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("from Exception");
		}
		catch(Throwable t) {
			System.out.println("from throwable");
		}
		System.out.println("normal flow continue");
			
		}

}

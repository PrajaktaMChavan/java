package exeception;

public class Pro {

	public static void main(String[] args) {
		System.out.println(test());
		

	}
	public static int test() {
		try {
			int a=10/2;
			return 10;
			
		}catch(ArithmeticException a) {
			return 20;
			
		}
		finally {
			return 30;
			}
	}
}

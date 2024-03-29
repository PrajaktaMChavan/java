package exeception;

public class Ex1 {
	public static void main(String[] args) {
		
	
		int a=10;
		int b=0;
		try {
			System.out.println("from try block");
			int res=a/b;
			System.out.println(res);
			
		}catch (NullPointerException ne) {
			System.out.println("exception is handle from catch block");
			
		}
		System.out.println("normal flow continue");

	}

}

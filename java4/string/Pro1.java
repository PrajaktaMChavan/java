package string;

public class Pro1 {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("hello");
		System.out.println((sb1));
		System.out.println(sb2);
		sb1.append(sb2);
		System.out.println("After appending");
		System.out.println(sb1);
		System.out.println(sb2);

		
	}

}

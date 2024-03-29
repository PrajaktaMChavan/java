package non;

public class Demo1 {
	static int a=10;
	int b=20;
	public static void main (String[] args) {
		System.out.println(a);
		Demo1 d1 = new Demo1();
		System.out.println(d1.b);
		d1.test();
	}
	public static void m1() {
		System.out.println(a);
		Demo1 d1= new Demo1();
		System.out.println(d1.b);
	}
	public void test() {
		System.out.println(a);
		System.out.println(b);
	}
	{
		System.out.println(a);
		System.out.println(b);
	
	}
	static {
		System.out.println(a);
		Demo1 d1 = new Demo1();
		System.out.println(d1.b);
	}
}


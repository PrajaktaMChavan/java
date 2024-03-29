package non;

public class Demo2 {
	public Demo2(int b,int c)
	{
		this.b=b;
		this.c=c;
		
	}
	static int a=10;
	int b;
	{
		System.out.println("from MLNSI");
		System.out.println(a);
		System.out.println(b);
	}
	int c;
	static
	{
		System.out.println("from MLSI");
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo2 d1= new Demo2(-9,12);
		System.out.println(a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		Demo2 d2= new Demo2(-13,45);
		System.out.println(d2.b);
		System.out.println(d2.c);
		
	}
}
		
	
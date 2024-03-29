package non;

public class Demo3 {
	int a;
	int b;
	public Demo3(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		Demo3 d1 = new Demo3(3,5);
        System.out.println(d1.a);
		System.out.println(d1.b);
		Demo3 d2 = new Demo3(-3,9);
		System.out.println(d2.a);
		System.out.println(d2.b);
		
	}

}

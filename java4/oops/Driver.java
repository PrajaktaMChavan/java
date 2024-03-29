package oops;

public class Driver {
	public static void main(String[] args) {
		
		A a1=new D();//upcasting
		System.out.println(a1.i);
		//System.out.println(a1.j);
		
		System.out.println(a1 instanceof B);
		B b1=(B)a1;//downcasting
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		System.out.println(b1 instanceof C);
		C c1=(C)b1;
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		
		C c2=(C)a1;
		System.out.println(c2.i);
		System.out.println(c2.j);
		System.out.println(c2.k);
		System.out.println(c1 instanceof D);
		D d1=(D)c1;
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1.k);
		System.out.println(d1.h);
	}
		
}

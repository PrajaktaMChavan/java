package oops;

public class Test {
	public static void main(String[] args) {
		
		
		Parent p2=new Child();//upcasting
		System.out.println(p2 instanceof Child);
		Child c1=(Child)p2;
		
		Parent p1=new Parent();
		System.out.println(p1 instanceof Child);
		Child c2=(Child)p1;
		
	}

}

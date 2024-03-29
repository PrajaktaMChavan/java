package poly;

public class Driver {

	public static void main(String[] args) {
		Parent p1 =new Parent();
		System.out.println(p1.a);
		Child c1 = new Child();
		System.out.println(c1.a);
		
		Parent p2=c1;//upcasting
		System.out.println(p2.a);
		
		Child c2=(Child)p2;//downcasting
		System.out.println(c2.a);
	}

}

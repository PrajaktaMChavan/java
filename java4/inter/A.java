package inter;

public class A implements I1,I2 {
	public void m1() {
		System.out.println("from class A m1()");
	}

	public static void main(String[] args) {
		A a1=new A();
		a1.m1();
		

	}

}

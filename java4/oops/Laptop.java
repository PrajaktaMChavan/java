package oops;

public class Laptop {
	Laptop(){
		System.out.println("Laptop created");
	}
	public void useMouse() {
		Mouse m1=new Mouse();
		
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.useMouse();
	}

}

package oops;

public class Car1 {
	Car1(){
		System.out.println("Car created");
		
	}
	public void useIndicator() {
		Indicator i1=new Indicator();
		
	}
	public static void main(String[] args) {
		Car1 c1=new Car1();
		c1.useIndicator();
	}
	

}

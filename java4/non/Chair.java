package non;

public class Chair {
	String  name;
	int  no;
	double price;
	Chair(String name){
		this.name=name;
	
	} 
	Chair(String name, int no) {
		this(name);
		this.no=no;
	}
	
	 Chair(String name, int no, double price) {
		this(name,no);
		this.price=price;
	}
		
	
	public static void main(String[] args) {
		Chair e1=new Chair("bajaj", 123,450.6);
		e1.getaccess();
	}
	public void getaccess() {
		System.out.println("Chair name is "+name);
		System.out.println("product no is "+no);
		System.out.println("chair price is "+price);
	}

}



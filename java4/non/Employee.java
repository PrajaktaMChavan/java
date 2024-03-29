package non;

public class Employee {
	String name;
	int id;
	long phno;
	public Employee() {
		System.out.println("Hello");
		
	}
	public Employee(String name) {
		this();
		this.name=name;
	}
	
	public Employee(String name,int id) {
		this(name);
		this.id=id;
	
		}
	public Employee(String name, int id,long phno)
	{
		this(name,id);
		this.phno=phno;
		
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getaccess();
	}
	public void getaccess() {
		System.out.println("employee name is "+name);
		System.out.println("employee id is "+id);
		System.out.println("employee phno is "+phno);
	}

}

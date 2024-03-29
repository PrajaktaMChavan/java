package obj;

public class Employee {
	String empname;
	int empid;
	double empsal;
	Employee(String empname,int empid,double empsal){
		this.empname=empname;
		this.empid=empid;
		this.empsal=empsal;
		
	}
	@Override
	public String toString() {
		return "empname:"+name+"empid:"+id+"empsal:"+sal;
	}
	@Override
	public boolean equals(Object o)
	{
		Employee e1=(Employee)o;
		if(this.name.equals(e1.empname) && this.empid==e1.id &&this.empsal==(e1.sal))
	}
	@Override
	

}


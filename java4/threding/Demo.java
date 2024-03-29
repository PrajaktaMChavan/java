package threding;

public class Demo {

	public static void main(String[] args) {
	Thread t=new Thread();
	System.out.println("Thread ID :- "+t.getId());
	System.out.println("Thread Name :- "+t.getName());
	System.out.println("Thread Priority :- "+t.getPriority());
	t.setName("hello");
	System.out.println("Thread Name :- "+t.getName());
	t.setPriority(8);
	System.out.println("Thread Priority :- "+t.getPriority());
			
	}

}

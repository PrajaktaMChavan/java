package collection;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("hi");
		
		System.out.println("Arraylist 1st "+a1);
		ArrayList a2=new ArrayList();
		a2.add(30.3);
		a2.add(true);
		System.out.println("ArrayList 2nd "+a2);
		
		a1.addAll(a2);
		System.out.println("after addAll()");
		System.out.println("Arraylist 1st "+a1);
		System.out.println("Arraylist 2nd "+a2);
		
		System.out.println(a1.size());
		

	}
 
}

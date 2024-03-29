package collection;


import java.util.LinkedList;

public class Array {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(12);
		li.add("hi");
		li.add('h');
		li.add(true);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		
}
    

}

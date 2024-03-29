package collection;

import java.util.HashSet;

public class Hash1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("hi");
		hs.add(10);
		hs.add('h');
		hs.add(true);
		hs.add(20.5);
		hs.add(null);
		
		for (Object o:hs) {
			System.out.println(o);
		}
	}

}

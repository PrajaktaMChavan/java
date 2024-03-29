package wrapper;

public class Demo {
	public static void main(String[] args) {
		byte b=10;
		int i=30;
		double d=23.3;
		long l=67;
		float f=24;
		char c='a';
		short s=12;
		
		
		Byte b1=Byte.valueOf(b);
		Integer i1=Integer.valueOf(i);
		Double d1=Double.valueOf(d);
		Long l1=Long.valueOf(l);
		Float f1=Float.valueOf(f);
		Character c1=Character.valueOf(c);
		Short s1=Short.valueOf(s);
		
		
		System.out.println(b1);
		System.out.println(i1);
		System.out.println(d1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(c1);
		System.out.println(s1);
	}

}

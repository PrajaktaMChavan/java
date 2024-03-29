package wrapper;

public class Demo1 {

	public static void main(String[] args) {
		Long l=12l;
		Integer i=230;
		Short s=98;
		Float f=34.f;
		Double d=45.7;
		Byte b=89;
		
		long l1=l.longValue();
		int i1=i.intValue();
		short s1=s.shortValue();
		float f1=f.floatValue();
		double d1=d.doubleValue();
		byte b1=b.byteValue();
		
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(b1);

	}

}

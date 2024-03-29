package non;

public class Student {
	String name;
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=s1;
		Student s3=s2;
		System.out.println("s1 "+s1.name);
		System.out.println("s2 "+s2.name);
		System.out.println("s3 "+s3.name);
	}
	}
	
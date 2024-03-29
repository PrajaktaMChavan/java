package inter;

public class Student implements Classroom {
	int student =100;

	@Override
	public void present(int a) {
		System.out.println(a+"absent student");
		student-=a;
		System.out.println("present student");
	}

	@Override
	public void absent() {
		
		System.out.println(a+" student");
		student+=a;
		System.out.println("present student");
		
	}

	@Override
	public void student(int a) {
		// TODO Auto-generated method stub
		
	}
}

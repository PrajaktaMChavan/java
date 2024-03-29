package non;

public class Ex1 {
	int a;//non static
	public static void main(String[] args){
		Ex1 e1 = new Ex1();
		e1.test();
		
		System.out.println(e1.a);
		
		}
	public void test() {
		int a=20;//local variable
		System.out.println(a);//20
		System.out.println(this.a);//0
	}

}

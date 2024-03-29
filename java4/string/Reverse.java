package string;

public class Reverse {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("prajakta");
		StringBuilder sb2=new StringBuilder("");
		
		for (int i=sb1.length()-1;i>=0;i--)
		{
			sb2=sb2.append(sb1.charAt(i));
			
		}
		System.out.println(sb2);
	}

}

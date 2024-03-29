package array;

public class Demo {
	public static void main(String[] args) {
		int a[]= {2,3,5,7,13,15,23,29};
		for (int i=0;i<a.length-1;i++)
		{
			int count=0;
			for (int d=1;d<=a[i];d++)
			{
				if(a[i]%d==0) 
					
				
				{
				count++;
			}
		}
			
		if (count==2){
			System.out.println(a[i]);
		}
		
			
	}

}
}

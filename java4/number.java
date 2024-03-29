import java.util.Scanner;
class Number{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int num=sc.nextInt();
  int rev=0;

  for(int a=num;a!=0;a=a/10)
{
   rev=a*10;

}
 System.out.println("reverce the number is "+num);
}

}

       
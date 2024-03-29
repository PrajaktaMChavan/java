
import java.util.Scanner;
class Case{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int num=sc.nextInt();
  System.out.println("prime number between 1 to "+num);
  for(int a=1;a<=num;a++){
  int count=0;
 for(int i=1;i<=a;i++){
if(a%i==0){
 count++;
}
}
if(count==2)
{
 System.out.println(a);
}

}
}
}
       
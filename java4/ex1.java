import java.util.Scanner;

class ex1{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
System.out.println(fact(num));
}
public static int fact(int num){

int count=0;
for(int i=1;i<=num;i++){
if(num%i==0){
count++;
}
}
return count;
}
}

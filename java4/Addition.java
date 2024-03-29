import java.util.Scanner;
class TypeCast{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
if(num<=100 && num>=90){
System.out.println("A+");
}
else if(num<=89 && num>=75){
System.out.println("A");
}

else if(num<=74 && num>=60){
System.out.println("B");
}

else if(num<=59 && num>=40){
System.out.println("C");
}

else if(num<=39 && num>=35){
System.out.println("D");
}

else{
System.out.println("Fail");
}
}
}
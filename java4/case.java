import java.util.Scanner;
class Case{


public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the days");
  String day=sc.next();
  switch(day){
   case "monday": case "friday":{
          System.out.println("tennis");
          }
          break;
    case "tuesday": case "thursday":{
          System.out.println("cricket");
          }
          break;
     case "wednesday":{
          System.out.println("basketball");
          }
          break;
      case "saturday":{
          System.out.println("chess");
          }
          break;
       case "sunday":{
          System.out.println("holiday");
          }
          break;
            }
         }
       }



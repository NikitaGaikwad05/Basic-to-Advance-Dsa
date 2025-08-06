//Switch case 
import java.io.*;
import java.util.*;
public class C34{
       public void show(){
              int choice;
              Scanner sc=new Scanner(System.in);
              System.out.println("1.Sunday,2.Monday,3.Tuesday,4.Wednesday,5.Thursday,6.Friday,7.Saturday");
              System.out.println("Enter your choice");
              choice=sc.nextInt();

              switch(choice){
                     case 1:
                          System.out.println(" Today is Sunday");
                          break;
                     case 2:
                      System.out.println("Today is Monday");
                      break;
                      case 3:
                      System.out.println("Today is Tuesday");
                      break;
                      case 4:
                      System.out.println("Today is Wednesday");
                      break;
                      case 5:
                      System.out.println("Today is Thursday");
                      break;
                      case 6:
                      System.out.println("Today is Friday");
                      break;
                      case 7:
                      System.out.println("Today is Saturday");
                      break;
                      default:
                      System.out.println("You enter the wrong choice");
              }

       }
       public static void main(String []args){
              C34 c=new C34();
              c.show();
       }
}

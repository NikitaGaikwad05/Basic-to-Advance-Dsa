//Default constructor Automatically call when just create the object of class.
import java.io.*;
import java.util.*;
public class C33 {
            int a,b,c;
         C33(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Two number");
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
        }
        public void display(){
            System.out.println("Addition="+c);
        }
        public static void main(String[] args) {
            C33 c=new C33();
            c.display();
            
        }
}

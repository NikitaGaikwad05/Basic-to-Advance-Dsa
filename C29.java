//convert the string into uppercase using the built in function.
import java.io.*;
import java.util.*;
public class C29 {
    public void show(){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        s=sc.next();
       String upper=s.toUpperCase();
       System.out.println("String in upper_case"+upper);
    }
    public static void main(String []args){
        C29 c=new C29();
        c.show();
    }
    
}

import java.util.*;
import java.io.*;
public class add

 { 
    public void addition()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entert the two  number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println(c);

    }    
    public static void main(String[] args)
     {
        add d=new add();
        d.addition();
    }
    
}

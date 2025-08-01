// To find the reverse number of given number;
import java.io.*;
import java.util.*;
public class C18{
    public void show(){
        int n,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println("reverse number"+rev);
    }
    public static void main(String []args){
       C18 c=new C18();
       c.show();
    }
}

// Write the program to find the given number is palindrome or not
 import java.io.*;
import java.util.*;
public class C20{
    public void show(){
        int n,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int org=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
           
        }
        if(org==rev){
            System.out.println("Given number is palindrome"+org);
        }
        else{
            System.out.println("Given number is not palindrome"+org);
        }
    }
    public static void main(String[] args){
        C20 c=new C20();
        c.show();
    }
}

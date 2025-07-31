// calculate the factorial of entered number
 import java.io.*;
import java.util.*;
public class C14 {
    public void factorial(){
        int n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate the fact");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        C14 c=new C14();
        c.factorial();
    }
}

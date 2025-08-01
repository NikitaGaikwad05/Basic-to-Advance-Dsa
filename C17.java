//find the sum digit of the given number

import java.io.*;
import java.util.*;
public class C17 {
    public void sum(){
        int n,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
             n=n/10;
            sum=sum+rem;
            

        }
           System.out.println(sum);
    }
    public static void main(String [] args){
        C17 c=new C17();
        c.sum();
    }
    
}

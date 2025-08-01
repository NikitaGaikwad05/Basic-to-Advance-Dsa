// WRITE THE PROGRAM TO COUNT THE NUMBER OF DIGIT;
import java.io.*;
import java.util.*;
public class C19{
    public void show(){
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);

    }
    public static void main(String []args){
        C19 c=new C19();
        c.show();
    }
}

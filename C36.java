//Find the sum of series 
import java.io.*;
import java.util.*;
public class C36{
    public void show(){

        int i=1,sum=0;
        while(i<=100){
            sum=sum+i;
        i=i+1;
        }
        System.out.println("Sum of series="+sum);
    }
    public static void main(String []args){
        C36 c=new C36();
        c.show();
    }
}

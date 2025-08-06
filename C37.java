//Find the sum of only even number from 1 to 100
import java.io.*;
import java.util.*;
public class C37{
    int sum=0;
    public void show(){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of only Even Number="+sum);
    }
    public static void main(String[]args){
        C37 c=new C37();
        c.show();
    }
}

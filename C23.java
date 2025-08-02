//Calculate the sum of Array
import java.io.*;
import java.util.*;
public class C23{
    public void show(){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter the array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 
        int sum=0;
       for(int i=0;i<size;i++){
        sum=sum+arr[i];
       }
         
           System.out.println(sum);

    }
    public static void main(String[] args){
        C23 c=new C23();
        c.show();
    }
    }

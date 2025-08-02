// Reverse the Given array Element;
import java.io.*;
import java.util.*;
public class C22{
    public void show(){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=size-1;
        while(start<end){
            int temp=arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

          
    }
    public static void main(String [] args){
        C22 c=new C22();
        c.show();
    }
}

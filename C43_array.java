//Find the square of  array element
import java.io.*;
import java.util.*;
import java.lang.*;
public class C43_array {
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
        for(int i=0;i<size;i++){
            System.out.println(Math.pow(arr[i], 2));
        }
    }
    public static void main(String[] args) {
        C43_array c=new C43_array();
        c.show();
    }
    
}

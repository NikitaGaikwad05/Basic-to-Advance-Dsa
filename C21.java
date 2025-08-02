//Find the minimum and maximum element from the array accepting the array  element from the user
import java.io.*;
import java.util.*;
public class C21{
    public void show(){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         int min=arr[0];
         int max=arr[0];
         for(int i=1;i<size;i++){
         
            if(arr[i]<min){
                min=arr[i];
         } if(arr[i]>max){
            max=arr[i];
         }
        }
        System.out.println("Minimum element"+min);
        System.out.println("Maximum element"+max);
    }
    public static void main(String[] args) {
        C21 c=new C21();
        c.show();
    }
}

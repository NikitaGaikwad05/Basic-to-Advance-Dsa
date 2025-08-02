//Write the program to find element present in Array and it's position.
import java.io.*;
import java.util.*;
public class C25{
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
        int ele;
        System.out.println("Enter the element that is to searched");
        ele=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++){
        if(arr[i]==ele){
            System.out.println(" element found"+" "+ele+" "+"At position"+i);
            found=true;
            break;
        }
    }
    if(!found){
        System.out.println("The element is found");
    }
    }
    public static void main(String []args){
        C25 c=new C25();
        c.show();
    }
}

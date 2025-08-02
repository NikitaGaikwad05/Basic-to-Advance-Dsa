//Implement the binary search using very simple logic
 import java.io.*;
import java.util.*;
public class C26{
    public void binary(){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        System.out.println("Enter the element of array");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ele;
        System.out.println("Enter the element to searched");
        ele=sc.nextInt();
        int start=0;
        int end=size-1;
        boolean found=false;
         while(start<=end){
        int mid=(start+end)/2;
        
        if(arr[mid]==ele){
            System.out.println("Element found at mid"+mid);
            found=true;
            break;
        }else if(arr[mid]<ele){
            start=mid+1;

        } else{
            end=mid-1;
        }
    }
    if(!found){
        System.out.println("Element not found");
    }
}
public static void main(String []args){
    C26 c=new C26();
    c.binary();
}
}

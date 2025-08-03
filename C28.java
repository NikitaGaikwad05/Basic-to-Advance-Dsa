//Selection sort
import java.io.*;
import java.util.*;
public class C28{
    public void selectionsort(){

        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            int midindex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[midindex]){
                    midindex=j;
                }
            }
            int temp=arr[midindex];
            arr[midindex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        C28 c=new C28();
        c.selectionsort();
    }
}

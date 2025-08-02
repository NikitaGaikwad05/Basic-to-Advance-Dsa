//Average of the element of the Array.
import java.io.*;
import java.util.*;
public class C24{
    public void show(){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size array");
        size=sc.nextInt();
        System.out.println("Enter the array element");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        double avg=0;
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
            avg=sum/size;
        }
        System.out.println(avg);
    }
    public static void main(String[] args){
        C24 c=new C24();
        c.show();
    }
}

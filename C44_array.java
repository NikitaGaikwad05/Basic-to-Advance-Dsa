//copy the content of array from one array to another
import java.io.*;
import java.util.*;
public class C44_array{
      public void show(){
        int arr[]=new int[5];
        int arrB[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element");
        for(i=0;i<5;i++){
          arr[i]=sc.nextInt();
        }for(i=0;i<5;i++){
          arrB[i]=arr[i];
        }for(i=0;i<5;i++){
          System.out.println(arrB[i]);
        }
      }
             public static void main(String[] args) {
        C44_array c=new C44_array();
        c.show();
      }
}

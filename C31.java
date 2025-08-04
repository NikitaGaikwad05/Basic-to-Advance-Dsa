//Calculate the String length
import java.io.*;
import java.util.*;
public class C31{
    public void show(){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();
        char []arr=s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println("length"+count);
    }
    public static void main(String[]args){
        C31 c=new C31();
        c.show();
    }
}

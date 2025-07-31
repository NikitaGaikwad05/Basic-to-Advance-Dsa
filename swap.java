//using the third variable;
import java.io.*;
import java.util.*;
public class swap {
    public void swap(){
        int num1,num2,temp;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1+""+num2);
    }
    public static void main(String[] args) {
        swap s=new swap();
         s.swap();
    }
    
}

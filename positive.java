import java.util.*;
import java.io.*;
public class positive {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive"+num);
        }else if(num<0){
            System.out.println("Number is negative"+num);
        }
        else{
            System.out.println("Number is equal to Zero"+num);
        }
    }
    
}

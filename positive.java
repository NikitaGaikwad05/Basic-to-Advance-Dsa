import java.util.*;
import java.io.*;
public class positive {
    public void pos(){
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
    public static void main(String[] args) {
        positive p=new positive();
         p.pos();
    }
    
}

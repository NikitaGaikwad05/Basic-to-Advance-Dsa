//Convert the given String into lowercase;
import java.io.*;
import java.util.*;
public class C30{
    public void show(){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the srting");
        s=sc.next();
        String lower=s.toLowerCase();
        System.out.println("String into lowercase"+" "+lower);

    }
    public static void main(String[] args){
        C30 c=new C30();
        c.show();
    }
}

// To implement the constructor overloading;
import java.io.*;
import java.util.*;
public class C45{
    int a,b,c,s;
     C45(int x){
        a=x;
        s=a*a;
     }
     C45(int y,int z){
        b=y;
        c=z;
        s=b*c;
     }
     public void display(){
        System.out.println("Area="+s);
     }
     public static void main(String []args){
        C45 c=new C45(10);
        c.display();
        C45 c1=new C45(10,20);
        c1.display();

     }
}

//Multiple inheritance using interface;
import java.io.*;
import java.util.*;
interface student{
    void getStudent();
}
interface Dept{
    void getDept();
}
public class C46 implements student,Dept{
    String Sname;
    String Dname;
    int clgcode;
    public void getStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sname");
        Sname=sc.next();


    }
    public void getDept(){
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the deptname,code");
        Dname=sc.next();
        clgcode=sc.nextInt();
       }
       public void display(){
        System.out.println("Sname="+Sname+" "+" dname="+Dname+" "+"clgcode="+clgcode);
       }
       public static void main(String[]args){
        C46 c=new C46();
        c.getStudent();
        c.getDept();
        c.display();
       }
}

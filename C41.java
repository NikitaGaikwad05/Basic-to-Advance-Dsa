//multilevel inheritance;
 import java.io.*;
 import java.util.*;
 class dept{
     String name;
 }
 class student extends dept{
    int Roll;
    String sname;
    int Prn;
 }
 public class C41 extends student{
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the DEPT name,Roll,Sname,Prn");
        name=sc.next();
         Roll=sc.nextInt();
        sname=sc.next();
        Prn=sc.nextInt();
    }
    public void display(){
        System.out.println("DEPT name="+name+" "+"RollNO="+Roll+" "+"Sname="+sname+" "+"Prn="+Prn);
    }
    public static void main(String[] args) {
        C41 c=new C41();
        c.get();
        c.display();
    }
    
}

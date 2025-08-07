//single inheritance;
import java.io.*;
import java.util.*;
 class library{
           int id;
           String name;
           int Prn;
        }
         public class C40 extends library{
            int lid;
            String Lname;
            public void get(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the id,name,Prn,lid,Lname");
            id=sc.nextInt();
            name=sc.next();
            Prn=sc.nextInt();
            lid=sc.nextInt();
            Lname=sc.next();

        }
        public void display(){
            System.out.println("id="+id+" "+"Name="+name+" "+"Prn="+Prn+" "+"lid="+lid+" "+"Lname="+Lname);
        }
        public static void main(String[] args) {
            C40 c=new C40();
            c.get();
            c.display();
        }
}

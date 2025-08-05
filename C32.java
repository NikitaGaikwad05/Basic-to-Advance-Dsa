//Create the class with field and Methods.
import java.io.*;
import java.util.*;
public class C32{
        String name,Add;
        int roll,Prn;
        public void student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student detail:Name,Add,Roll,Prn");
        name=sc.nextLine();
        Add=sc.nextLine();
        roll=sc.nextInt();
        Prn=sc.nextInt();
    }
    public void display(){
        System.out.println("Name="+name+"\n"+"Add="+Add+"\n"+"Roll NO="+roll+"\n"+"Prn="+Prn);
    }
   
    public static void main(String[] args) {
        C32 c=new C32();
        c.student();
        c.display();
    }
}

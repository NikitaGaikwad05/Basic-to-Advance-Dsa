import java.io.*;
import java.util.*;
public class Evenodd {
    public void Evenodd()
    {
         int num;
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
            if(num%2==0){
                System.out.println("Number is even"+num);
            }
            else{
                System.out.println("NUmber is odd"+num);
            }

    }
    public static void main(String[] args) {
       Evenodd e=new Evenodd();
       e.Evenodd();
             
    }   
}

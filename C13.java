import java.io.*;
import java.util.*;
public class C13 {
    public void fibo(){
    Scanner sc=new Scanner(System.in);
    int n,a=0,b=1,c;
    System.out.println("Enter the No of term");
    n=sc.nextInt();
    if(n>=1){
        System.out.println(a);

    }if(n>=2){
        System.out.println(b);
    }
    for(int i=3;i<=n;i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
}
    public static void main(String[] args) {
        C13 c=new C13();
        c.fibo();
    }
    
}


/* providing the range
 public class fibb{
 public static void main(String[] args)
 { 
 int f1=-1,f2=1,f3=0;
 System.out.println(f1+""+f2);
 while(f3<=34){
 f3=f1+f2;
 System.out.println(f3);
 f1=f2;
 f2=f3;
 }
 }
 } 
 */

 
 

import java.util.Scanner;

public class product {
    public void product(){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        product p=new product();
        p.product();
    }
    
}

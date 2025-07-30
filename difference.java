import java.util.Scanner;

public class difference {
    public static void main(String [] args){
        int num1,num2;
        int d;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1>num2){
            d=num1-num2;
            System.out.println(d);
        }else{
            d=num2-num1;
            System.out.println(d);
        }

    }
    
}

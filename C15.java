//enter the number  and find the prime number upto that number;
 import java.io.*;
 import java.util.*;
 public class C15 
 {
    public void prime(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Prime numbers up to " + n );
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        C15 c=new C15();
        c.prime();
    }
}



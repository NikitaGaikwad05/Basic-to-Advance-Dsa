import java.util.*;
 import java.io.*;
 public class vowel {

    public void vowelcon(){
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U'){
            System.out.println("character is vowel"+""+ch);
        } else{
            System.out.println("Number is consonent"+ch);
        }

    }
    
    
    public static void main(String[] args) {
        vowel v=new vowel();
        v.vowelcon();
}
 }

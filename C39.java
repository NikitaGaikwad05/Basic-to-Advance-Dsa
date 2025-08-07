//To display the Pattern;
import java.io.*;
import java.util.*;
public class C39{
    public void show(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        C39 c=new C39();
        c.show();
    }
}

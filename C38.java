// To display the pattern;
import java.io.*;
public class C38{
    public void show(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        C38 c=new C38();
        c.show();
    }
}

//The use of Super keyword
import java.io.*;
class demo {
    demo(){
        System.out.println("This base class constructor");
    }
}
public class C42 extends demo {
      C42(){
        super();
        System.out.println("This derrived class constructor");
      }
      public static void main(String[]args){
        C42 c=new C42();
        
      }  
}

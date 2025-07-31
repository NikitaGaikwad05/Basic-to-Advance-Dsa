//average of the number;

import java.util.*;
import java.io.*;
public class avg
{
    public void average(int a,int b,int c,int d,int e)
  {
        double avg=(a+b+c+d+e)/5;
        System.out.println(avg);

    }
    public static void main(String[] args) {
        avg a=new avg();
        a.average(23,34, 45,34,45);
    }
} 

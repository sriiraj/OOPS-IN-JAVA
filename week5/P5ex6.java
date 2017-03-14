/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5ex6;
import java.util.*;
/**
 *
 * @author terror
 */
public class P5ex6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          A a1 = new A(10);
       A a2 = new A(20);      
       a1 = a2;
       System.gc();  //OR call Runtime.getRuntime().gc();           
       System.out.println("done");  
    }  
}
class A
{
    int i;
    public A(int i)
    {
        this.i = i;
    }
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method, i = "+i);
    }  
}

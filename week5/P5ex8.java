/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5ex8;

/**
 *
 * @author terror
 */
class Outer
{
 public void display()
 {
  Inner in=new Inner();
  in.show();
 }
 class Inner
 {
  public void show()
  {
   System.out.println("Inside inner");
  } 
 }
}
public class P5ex8 {
    /**
     * @param args the command line arguments
     */
   
         public static void main(String[] args)
 {
  Outer ot=new Outer();
  ot.display();
 }
    }
    


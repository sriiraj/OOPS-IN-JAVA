/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5ex7;

/**
 *
 * @author terror
 */
public class P5ex7 {
public enum Season { WINTER, SPRING, SUMMER, FALL }  
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for (Season s : Season.values())  
         System.out.println(s);  
    }
    
}

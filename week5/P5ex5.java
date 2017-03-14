/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5ex5;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author terror
 */
public class P5ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         File file = new File("C:\\Users\\terror\\Documents Duplicate Cleaner log.txt");
         
         if(file.createNewFile())System.out.println("Success!");
         else System.out.println ("Error, file already exists.");
      }
      catch(IOException ioe) {
         ioe.printStackTrace();
      }
    }}
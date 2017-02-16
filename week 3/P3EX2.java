/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3ex2;
import java.util.Scanner;

/**
 *
 * @author terror
 */
public class P3EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    } int g,n = (int)(Math.random()*10);
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Guess a Number: ");
            g = scanner.nextInt();
            if (g == n) {
                System.out.println("You Guessed It !!!");
               break;
            }
            
            else if(g > n)
                System.out.println("Too high,try again");
            else
                System.out.println("Too low,try again");
        }

    }
  

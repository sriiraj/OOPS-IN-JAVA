/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3ex4;
import java.util.Scanner;

/**
 *
 * @author terror
 */
public class P3ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = scanner.nextInt();
        double ans = 0;
        while (n > 0) ans = ans + 1/(double)n--;

        System.out.println("ANSWER: " + ans);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3ex3;
import java.util.Scanner;
/**
 *
 * @author terror
 */
public class P3ex3 {

  private static void printMessage(String str) {
        System.out.print(str);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        printMessage("Enter 2 Numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printMessage("\nWhat do you want do?\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n >> ");
        int c = scanner.nextInt();
        if(c == 1)
            printMessage("ANS: " + (a+b) + "\n");
        else if(c == 2)
            printMessage("ANS: " + (a-b) + "\n");
        else if(c == 3)
            printMessage("ANS: " + (a*b) + "\n");
        else
            printMessage("ANS: " + (a/(double)b) + "\n");

    }
}
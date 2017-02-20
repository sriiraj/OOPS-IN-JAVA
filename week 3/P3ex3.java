/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3ex3;
import java.util.*;
/**
 *
 * @author terror
 */
public class P3ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();
		int d = a|4+c>>b&7;
		System.out.println("Value is : " +d);
    }
    
}

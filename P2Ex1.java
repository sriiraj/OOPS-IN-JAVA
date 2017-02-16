/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2.ex.pkg1;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author terror
 */
public class P2Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("enter the value of a,b,c");
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int d=(b^2)-(4*a*c);
    int x1=(int)(-b+Math.sqrt(d))/(2*a);
     int x2=(int)(-b-Math.sqrt(d))/(2*a);
    System.out.println("roots:"+x1 + x2);}  
}

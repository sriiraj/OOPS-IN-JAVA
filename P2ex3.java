/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2ex3;
import java.util.Scanner;

/**
 *
 * @author terror
 */
public class P2ex3 {

    /**
     * @param args the command line arguments
     */public static final int LENGTH=10;
    public static void main(String[] args) {
        // TODO code application logic here
        int[]myArray=new int[LENGTH];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=scan.nextInt();
        }
        System.out.println("enter the key");
        int key,i=0;
        Scanner Scanner=new Scanner(System.in);
         key = Scanner.nextInt();
         myLabel:for(int a: myArray){
             i++;
             if(a==key)
                 break myLabel;
             else
                 continue myLabel;
         }
         if((i-1)==myArray.length)
             System.out.println("not present");
         else
             System.out.println("present");
    }
    
}

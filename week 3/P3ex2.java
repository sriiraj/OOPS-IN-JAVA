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
public class P3ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int mnth = sc.nextInt();
		switch(mnth)
		{
			case 1:

				System.out.println("Winter");
				break;
			case 2:
				System.out.println("Winter");
				break;
			case 3: 
				System.out.println("Summer");
				break;
			case 4: 
				System.out.println("Summer");
				break;
			case 5: 
				System.out.println("Summer");
				break;
			case 6: 
				System.out.println("Spring");
				break;
			case 7:
				System.out.println("Spring");
				break;
			case 8: 
				System.out.println("Spring");
				break;
			case 9: 
				System.out.println("Winter");
				break;
			case 10: 
				System.out.println("Autumn");
				break;
			case 11:
				System.out.println("Autumn");
				break;
			case 12:
				System.out.println("Autumn");
				break;
			default:
				System.out.println("Invalid Entry!");			 
		}	
    }
    
}

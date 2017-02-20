/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3ex1;
import java.util.Scanner;
/**
 *
 * @author terror
 */
public class P3ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner OBJ= new Scanner(System.in);
System.out.println("Are you a student?");

String x= OBJ.nextLine();
int a=0,b=0,h=0,i=0;
float e=0,f=0,g=0;
String c=" ",d=" ";
if(x.equals("Yes"))
{
	System.out.println("Enter your register number:");
	a= OBJ.nextInt();
	System.out.println("Which year are you in?");
	
		 b=OBJ.nextInt();
	
	System.out.println("What is your section?");
	
	 do 
{
	c= OBJ.nextLine();
	
}while(!c.equals(""));
	System.out.println("Do you have any Scholarship?");
	do
{
	d= OBJ.nextLine();
}while(!d.equals(""));
	if(d.equals("Yes"))
{
	System.out.println("Enter your CGPA:");
	e= OBJ.nextFloat();
	f = e*10000;
}
else
{
	System.out.println("You do not have any scholarship");
}
	System.out.println("What is your total living expense?");
	g= OBJ.nextFloat();
	System.out.println("What is the total number of students in your campus?");
	h= OBJ.nextInt();
	System.out.println("What is the total number of students across your campus?");
	i= OBJ.nextInt();
	System.out.println("You are a student with Register Number" + a +"and you belong to" + b + "year of section" + c + "and eligible for a scholarship of" + f + "per year as your CGPA is" + e + "and your total living expense is" + g + ". Total number of students in your campus is" + h + "and across campus is" + i );
}
else
{
	System.out.println("Permission denied to enter details");
}
    }
    
}

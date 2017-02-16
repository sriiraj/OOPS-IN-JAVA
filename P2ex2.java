/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2ex2;
import java.util.Scanner;
/**
 *
 * @author terror
 */
public class P2ex2 {
	private final static int LENGTH=10;
	private static int[] getArray()
	{
		int myArray[] = new int[LENGTH];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter" + LENGTH + "Integers: ");
		for(int i=0;i<myArray.length;i++)
		{
			myArray[i] = scanner.nextInt();
		}
		return myArray;
	}
	private static void printArray(int myArray[])
	{
		System.out.print("Array ->");
		for(int aMyArray : myArray)
		{
			System.out.print(" " + aMyArray);
		}
		System.out.println(" ");
	}
	private static void findInArray(int myArray[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element to search for: ");
		int i,key = scanner.nextInt();
		for(i=0;i<myArray.length;i++)
		{
			if(myArray[i] == key)
			{
				break;
			}
		}
		if(i == myArray.length)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index: " + i);	
		}
	}
	private static int[] sortArray(int[] myArray)
	{
		for(int k=0;k<myArray.length;k++)
		{
			for(int j=0;j<myArray.length-1;j++)
			{
				if(myArray[j] > myArray[j+1])
				{
					int temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp; 
				}
			}
		}
		System.out.println("Array is sorted");
		return myArray;
	}
	public static void main(String args[])
	{
		boolean canRun = true;
		int[] myArray = new int[LENGTH];
		Scanner scanner = new Scanner(System.in);
		while(canRun)
		{
			System.out.println("SELECT AN OPTION");
			System.out.println("-----------------");
			System.out.println("1. Enter Array");
			System.out.println("2. Display Array");
			System.out.println("3. Search Array");
			System.out.println("4. Sort Array");
			System.out.println("0. Exit");
			System.out.println("\n >> ");
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 1: 
					myArray = getArray();
					break;
				case 2:
					printArray(myArray);
					break;
				case 3:
					findInArray(myArray);
					break;
				case 4: 	
					myArray = sortArray(myArray);
					break;
				case 0:
					canRun = false;
					System.out.println("Bye!!");	
					break;
				default:
					System.out.println("Invalid Entry!");
					break;
			}
		}
	}
}
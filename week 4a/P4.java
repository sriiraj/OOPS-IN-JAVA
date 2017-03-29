/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author terror
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s = new Scanner(System.in);
        BankAccount account = new BankAccount();
        DecimalFormat format = new DecimalFormat(".##");
        
        System.out.print("Welcome to the Bank.\nEnter Your Name\n");
        String name = s.next();
        
        System.out.print("Hi "+ name + "! How are you doing today?\n");
        
        System.out.print("What's your balance amount?\n");
        account.balance = s.nextDouble();
        
        System.out.print("What's your annual interest rate?\n");
        account.annualInterestRate = s.nextDouble();
        
        System.out.print("What's your monthly payment rate?\n");
        account.monthlyPaymentInterest = s.nextDouble();
        
        System.out.print("What's your due time in months?\n");
        account.time = s.nextDouble();
        
        int counter = 0;
        while(account.getTime() != 0) {
            counter++;
            account.calculateMonthly();
            System.out.print("Month: "+ counter + "\n" +
            "Minimum monthly payment: " + format.format(account.getmonthlyPaymentRate()) + "\n" +
            "Remaining balance: " + format.format(account.getBalance()) + "\n");
            
            if (counter%12 == 0)
                System.out.print("Total paid: " + format.format(account.gettotalPaid()) + "\n" +
                "Remaining balance: " + format.format(account.getBalance()) + "\n");
            
            account.time = account.getTime()-1;
        }
    }
    
}

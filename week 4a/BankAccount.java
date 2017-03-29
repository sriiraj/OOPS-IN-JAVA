/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

/**
 *
 * @author terror
 */
class BankAccount {
     double time;
    double balance;
    double unpaidBalance;
    double annualInterestRate;
    double monthlyPaymentInterest;
    double monthlyPaymentRate;
    double interestMade;
    double totalPaid;
    
    double getTime() {
        return time;
    }
    
    double getBalance() {
        return balance;
    }
    
    double getunpaidBalance() {
        return unpaidBalance;
    }
    
    double getannualInterestRate() {
        return annualInterestRate;
    }
    
    double getmonthlyPaymentRate() {
        return monthlyPaymentRate;
    }
    
    double gettotalPaid() {
        return totalPaid;
    }
    
    double getinterestMade() {
        return interestMade;
    }
    
    void calculateMonthly() {
        monthlyPaymentRate = balance * monthlyPaymentInterest/100;
        totalPaid += monthlyPaymentRate;
        unpaidBalance = balance - monthlyPaymentRate;
        interestMade = annualInterestRate/1200 * unpaidBalance;
        balance = unpaidBalance + interestMade;   
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p9ex2;

public class P9ex2{
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is: " + b.total);
        }
    }
}
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        } }}// TODO code application logic here
    
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;
import java.util.Scanner;

/**
 *
 * @author terror
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total;
        int i=1,j = 0,m;
        String stud[]=new String[2];
        int mark[][]=new int[2][2];
        int avg[]=new int[2];
        while(i!=3)
        {
        System.out.println("pellala peru lu");
        Scanner s=new Scanner(System.in);
        stud[i-1]=s.next();
        System.out.println("peru" + stud[i-1]);
        m=s.nextInt();
        if(m>=0&&m<=100)
        {
            mark[i-1][0]=m;
        }
        else{
            System.out.println("pukku pagilindhi");
            continue;
        }
        System.out.println("marks pettu" + stud[i-1] + "sub 2");
        m=s.nextInt();
        if(m>=0&&m<=100)
        {
            mark[i-1][1]=m;
        }
        else{
            System.out.println("pukku pagilindhi");
            continue;
        }
        avg[i-1]=(mark[i-1][0]+mark[i-1][1])/2;
        i++;
        }
        if(avg[j]>avg[0])
        {
            System.out.println(stud[j]+"has more marks"+stud[0]);
        }
        else{
             System.out.println(stud[1]+"has more marks"+stud[j]);
        }
        
    }
    
}


package p9ex4;
public class P9ex4 {
    public static void main(String[] args) {
         display d=new display();
        MyThread t1=new MyThread(d);
        MyThread t2=new MyThread(d);
        t1.start();
        t2.start();  
    }
}
class display{
    public synchronized  void wish()
    {
        for(int i=1;i<=5;i++)
        {
           System.out.println("ongoing call conversion person:"+i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
                System.out.println("conversion completed");        
        }
    }
}
class MyThread extends Thread{
    display d;
    MyThread(display d)
    {
        this.d=d;
    }    
    public void run()
    {
        d.wish();  // TODO code application logic here
    }
}
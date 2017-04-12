
package p9ex3;
class A implements Runnable{
public void run(){
int [] myList = {1,2,3};
for (int i:myList)
System.out.println(i);
}};
class B implements Runnable{
public void run(){
int [] myList = {4,5,6};
for (int i:myList)
System.out.println(i);
}};
class C implements Runnable{
public void run(){
int [] myList = {7,8,9};
for (int i:myList)
System.out.println(i);
}};
public class P9ex3 {
    public static void main(String[] args) {
       A a=new A();
B b=new B();
C c=new C();
Thread t=new Thread(a);
t.run();
Thread t1=new Thread(b);
t1.run();
Thread t2=new Thread(c);
t2.run();
System.out.println("a thread name="+t.getName());
System.out.println(Thread.currentThread().getName());
t.setName("sriiraj");
t1.setName("hi");
t2.setName("hello");
System.out.println("after changing a thread name="+t.getName());
System.out.println("after changing a thread name="+t1.getName());
System.out.println("after changing a thread name="+t2.getName());
 
    } 
}

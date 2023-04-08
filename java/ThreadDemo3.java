import java.lang.*;
class ThreadDemo3 extends Thread
{
public void run()
{
System.out.println(" inside run method ");
}
public static void main(String args [])
{
ThreadDemo3 t1 = new ThreadDemo3();
ThreadDemo3 t2=  new ThreadDemo3();
ThreadDemo3 t3 = new ThreadDemo3();
System.out.println(" t1 thread priority ="+ t1.getPriority());
System.out.println(" t2  thread priority ="+ t2.getPriority());
System.out.println(" t3 thread priority ="+ t3.getPriority());
t1.setPriority(2);
t2.setPriority(5);
t3.setPriority(8);
System.out.println(" t1 thread priority ="+ t1.getPriority());
System.out.println(" t2  thread priority ="+ t2.getPriority());
System.out.println(" t3 thread priority ="+ t3.getPriority());
System.out.println(Thread.currentThread().getName());
System.out.println("current thread:"+Thread.currentThread().getPriority());
Thread.currentThread().setPriority(10);
System.out.println(" main thread priority :"+ Thread.currentThread().getPriority());
}
}

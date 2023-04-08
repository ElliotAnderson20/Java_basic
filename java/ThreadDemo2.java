class A extends Thread
{
synchronized public void run()
{
try
{
System.out.println(" good ");
sleep(1000);
}
catch(Exception e)
{}
}
}
class  B extends Thread
{
synchronized public void run()
{
try
{
System.out.println(" morning ");
sleep(2000);
}
catch(Exception e)
{}
}
}
class  C extends Thread
{
synchronized public void run()
{
try
{
System.out.println(" india  ");
sleep(3000);
}
catch(Exception e)
{}
}
}
class ThreadDemo2
{
public static void main (String args [])
{
A t1 = new A();
B t2 = new B();
C t3 = new C();
t1.start();
t2.start();
t3.start();
}
}

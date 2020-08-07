/*4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block]
*/
package MultiThread;


public class MyClass4 implements Runnable
{
	public static void disp() 
	{
		synchronized(Thread.currentThread()) 
		{
			for(int i=0;i<=10;i++) 
			{
				System.out.println(i);
			}
		}
		
	}
	
	public void run() 
	{
		disp();
	}


	public static void main(String [] args)throws Exception
		{	
			MyClass4 m1=new MyClass4();
			MyClass4 m2=new MyClass4();
			
			Thread t1=new Thread(m1);
			Thread t2=new Thread(m2);
			
			t1.start();
			t2.start();		
		}
}

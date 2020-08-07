//2) above program  using "implements Runnable" method.
//1) create a multi-threaded application by using  "extends Thread " method.
//create 2 threads. they should display characters from A to J.

package MultiThread;

class que2 implements Runnable
{
	public void run()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
		}
	}
}

public class MyClass2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		que2 m1=new que2();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		t1.start();
		t2.start();
	}
}
	


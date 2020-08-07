//1) create a multi-threaded application by using  "extends Thread " method.
//create 2 threads. they should display characters from A to J.

package MultiThread;

class que1 extends Thread
{
	public void run()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
		}
	}
}

public class MyClass1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		que1 m1=new que1();
		que1 m2=new que1();
		m1.start();
		m2.start();
	}
}
	


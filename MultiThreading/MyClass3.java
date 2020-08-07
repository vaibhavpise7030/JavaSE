/*3) create 3 threads in such a way that while one thread is executing, 
2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".
*/
package MultiThread;

class que3 implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Exec "+ i);
		}
		System.out.println("-----------");
	}
	
}
public class MyClass3 
{

	public static void main(String[] args) 
	{
		que3 m1 = new que3();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		Thread t3 = new Thread(m1);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}





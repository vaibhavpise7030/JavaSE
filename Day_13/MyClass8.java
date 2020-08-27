/*
 8)Define a thread which displays 1 to 10 values. 
	Use lambda to pass Runnable implementation to Thread class constructor.
 */
public class MyClass8 
{

	public static void main(String[] args) 
	{
		Thread t1=new Thread(()->{for(int i=1;i<=10;i++)
		                          {
			                      System.out.println(i);
		                           }
			                      },"first");
		t1.start();
		}
	
	}


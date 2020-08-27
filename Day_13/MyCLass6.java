/*
 6)	Given
interface Alpha
{
	void perform();
}
And
Public class Demo
{
	Public static void main(String args[])
	{
		Alpha a=MyClass.getAlpha();
		a.perform();
	}
}

Above code is incomplete. You have to complete it.
 It means you have to write “MyClass”.
Complete the entire code, compile and run.

/*
 */
interface Alpha
{
	void perform();
}
class MyClass
{
	static Alpha getAlpha()
	{
	  Alpha ref= new Alpha()
		{
			public void perform()
			{
				System.out.println("Inside Myclass Perform");
			}
			
		};
		
		return ref;
	}
}

public class MyCLass6 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
			Alpha a=MyClass.getAlpha();
			a.perform();
		}
}

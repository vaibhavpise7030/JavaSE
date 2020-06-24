class course
{
	public void start()
	{
		
	}
	public void end()
	{
		
	}
}

class MSCIT extends course
{
	public void start()
	{
		System.out.println("MSC-IT Start");
	}
	public void end()
	{
		System.out.println("MSC-IT End");
	}
	
}

class DAC extends course
{
	public void start()
	{
		System.out.println("DAC Start");
	}
	public void end()
	{
		System.out.println("DAC End");
	}	
}

class DBDA extends course
{
	public void start()
	{
		System.out.println("DBDA Start");
	}
	public void end()
	{
		System.out.println("DBDA End");
	}
	public void orientation()
	{
		System.out.println("Welcome to DBDA");

	}
	
}
public class CourseDemo {
	
	static void perform(course ref)	//Upcasting
	{
		if (ref instanceof DBDA)
		{
			DBDA d=(DBDA)ref;//Downcasting
			d.orientation();
		}
		ref.start();
		ref.end();	
	}
	
	public static void main(String[] args) 
	{
		perform(new MSCIT());
		perform(new DAC());
		perform(new DBDA());
	}

}

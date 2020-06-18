//7)Define a parent and a child class . Now explain function overriding with Example.
class base11
	{
	  public void disp()  //overridden
	  {
		System.out.println("Inside base disp");	  
	  }	
	}
public class Myclass8 extends base11
{
	  public void disp()  //overriding
	  {
		System.out.println("Inside Sub disp");	  
	  }	
	
	public static void main(String[] args) 
	{
		Myclass8 m=new Myclass8();
		m.disp();
	}
}

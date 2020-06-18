//5)Show the example of multi-level inheritance with constructor invocation.
class base
{
  public  base()
  {
	System.out.println("Inside base No Argu Const");	  
  }	
}
class B extends base
{
  public B()
  {
	System.out.println("Inside B No Argu Const");	  
  }	
}
class C extends B
{
  public C()
  {
	System.out.println("Inside C No Argu Const");	  
  }	
}
public class Myclass5 extends C
{
	public Myclass5()
	{ 
		System.out.println("Inside Myclass No Argu Const");
	}

	public static void main(String[] args) 
	{
		Myclass5 m=new Myclass5();
		
	}

}

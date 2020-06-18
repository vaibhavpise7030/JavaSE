//6)Show the example of hierarchical inheritance with constructor invocation.
class base10
{
  public  base10()
  {
	System.out.println("Inside base No Argu Const");	  
  }	
}
class B1 extends base10
{
  public B1()
  {
	System.out.println("Inside B No Argu Const");	  
  }	
}
class C1 extends base10
{
  public C1()
  {
	System.out.println("Inside C No Argu Const");	  
  }	
}
public class Myclass6 extends base10
{
	public Myclass6()
	{ 
		System.out.println("Inside Myclass No Argu Const");
	}

	public static void main(String[] args) 
	{
		Myclass6 m=new Myclass6();
		C1 m1=new C1();
		B1 m2=new B1();		
	}
}

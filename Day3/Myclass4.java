//4)Show the example of single level inheritance with constructor invocation.
class A
{
  public A()
  {
	System.out.println("Inside base No Argu Const");	  
  }
	
}
class B12 extends A{
	public B12()
	{
		System.out.println("Inside sub no arg");
	}
}
public class Myclass4
{
	
	public static void main(String[] args) 
	{
		B12 m=new B12();
		
	}

}

/*
  2)Define two interfaces
    Interface A with “default void fun()” and 
    interface B with “default void fun()” methods.
	Now define a class C which implements both A and B.
	Observe what happens here. Provide the solution in case of any problem.
	
 */
interface A
{
	default void fun()
	{
		System.out.println("In Fun A");
	}
	
}

interface B
{
	default void fun()
	{
		System.out.println("In Fun B");
	}
	
}

class C implements A,B
{
	public void fun()
	{
		System.out.println("In C Fun");
	}
	
}

public class MyClass2 
{

	public static void main(String[] args) 
	{
		C ob= new C();
		ob.fun();
	}

}

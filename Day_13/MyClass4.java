/*
 4)Define a class “Base” with  “public void disp()” 
 and interface “MyInterface” with default method “public void disp()”.
 Now define a child class “Sub2 extends Base implements MyInterface”
 Inside main function create an instance of “Sub2” and invoke “disp()”.
 Observe what happens.
 */

interface MyInterface
{
	default void disp()
	{
		System.out.println("In MyInterface disp");
	}
}
class Base
{
	public void disp()
	{
		System.out.println("In base disp");
	}
}

class sub2 extends Base implements MyInterface
{
	
}

public class MyClass4 
{

	public static void main(String[] args) 
	{
		sub2 ref = new sub2();
		ref.disp();
	}
}

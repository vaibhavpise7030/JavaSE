/*
 * 9)	Given
interface MyInterface
{
	void fun(char a,int b);
}
	And
class SomeClass
{
	void disp(char a,int b)
	{
		S.o.p(a,b);
	}
}
 Write a lambda expression as well as method reference
 and invoke disp() method of SomeClass.
 */

interface MyInterface1
{
	void fun(char a,int b);
}

class SomeClass 
{
	public void disp(char a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class MyClass9 {

	public static void main(String[] args) 
	{
		System.out.println("Using lambda");
		SomeClass ob = new SomeClass();
 		MyInterface1 ref=(char a,int b)->{ob.disp(a,b);};
 		ref.fun('A', 100);
 		
 		System.out.println("\nUsing Method interface");
 		MyInterface1 ref1= ob::disp;
 		ref1.fun('B', 200);
	}

}

/*
 * 5)	Define an interface “MyAlgo” with static methods
	Static int sqr(int k)
	Static int add(int a,int b)
	Static int product(int a,int b)

	From main function invoke all the static methods of “MyAlgo”.
 */

interface MyAlgo
{
	static int sqr(int k)
	{
		return k*k;
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int product(int a,int b)
	{
		return a*b;
	}

}
public class MyClass5 
{

	public static void main(String[] args)
	{
		System.out.println("Square: "+MyAlgo.sqr(10));
		System.out.println("Addition: "+MyAlgo.add(10, 2));
		System.out.println("Product: "+MyAlgo.product(10, 20));
		
	}

}

/*7)	Given
interface Base
{
	int product(int a,int b);
}
Write a lambda expression and invoke product method.
*/
interface Base1
{
	int product(int a,int b);
}

public class MyClass7 
{
	public static void main(String args[])
	{
		Base1 ref=(a,b)->{return a*b;};
		System.out.println(ref.product(10, 30));
	}

}

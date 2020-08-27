/*
1)	Define an interface “First” with 
	One abstract method and one default method.
	Now define a class “Sub”, which implements “First”.
	From main function, create an instance of Sub and 
	invoke both the methods of interface.
*/
interface First
{
	void disp();
	default String disp1() 
	{
		return "in disp1";
	}
}
class Sub implements First
{
	public void disp()
	{
		System.out.println("in sub disp");
	}
}
public class MyClass1 
{
	public static void main(String[] args) 
	{
		Sub s = new Sub();
		s.disp();
		System.out.println(s.disp1()); 
	}
}
/*
 3)	Define an interface “Second” with 
	One abstract method and one default method.
Now define a class “Sub1”, which implements “Second” 
and override the default method of interface “Second”. 
Also invoke default method of Second from the overriding method.
From main function, create an instance of Sub1 and invoke the methods.

 */
interface second
{
	void disp();
	default void disp2()
	{
		System.out.println("in default");
	}
}
class sub1 implements second
{
	public void disp()
	{
		System.out.println("in disp1");
	}
	public void disp2()
	{
	second.super.disp2();
		System.out.println("in override default");
	}
}
	public class MyClass3 {

	public static void main(String[] args)
	{
		sub1 ref=new sub1();
		ref.disp2();
		ref.disp();

	}

}

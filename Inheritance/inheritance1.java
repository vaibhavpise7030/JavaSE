//1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class constructor from child class ?

class A
{
	public A (int k)
	{
		System.out.println("Costr in A");
	}
}
class B extends A
{
	public B()
	{
		super(10);
		System.out.println("Costr in B");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("Costr in C");
	}
}

public class inheritance1 
{

	public static void main(String[] args) 
	{
		C ob = new C();
		//B ob1 = new B();
	}

}

//3)Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.


class A1

{
	public A1()
	{
		System.out.println("in A");
	}
}
class B1 extends A1

{
	public B1()
	{
		System.out.println("in B");
	}
}
class C1 extends A1

{
	public C1()
	{
		System.out.println("in C");
	}
}
public class inheritance4 {
	

	public static void main(String[] args) {
			B1 obj = new B1();
			C1 obj1 = new C1();
	}

}

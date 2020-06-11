class P
{
	static
	{
		System.out.println("Inside class P static");
	}
}
class Q
{
	static
	{
		System.out.println("Inside class Q static");
	}
}
class R
{
	static
	{
		System.out.println("Inside class R static");
	}
}
public class MyClass2 {

	public static void main(String[] args) {
		P ob1 = new P();
		Q ob2 = new Q();
		R ob3 = new R();

	}

}

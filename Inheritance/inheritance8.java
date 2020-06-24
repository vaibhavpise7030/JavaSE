class base1
{
	int num=10;
	public base1(int k)
	{
		this.num=k;
		System.out.println("in base  para constructor");
	}
}
class sub1 extends base1
{
	int num1=20,num2=30;
	public sub1()
	{
		super(11);
		System.out.println("in sub1 default constructor");
	}
	public sub1(int l)
	{
		super(12);
		this.num1=l;
		System.out.println("in sub1 one parameter constructor");

	}
	public sub1(int m ,int n)
	{
		super(13);
		this.num1=m;
		this.num2=n;
		System.out.println("in sub1 two parameter constructor");

	}
}
public class inheritance8 {

	public static void main(String[] args) 
	{
		sub1 obj1 = new sub1();
		System.out.println("========================");
		sub1 obj2 = new sub1(21);
		System.out.println("========================");
		sub1 obj3 = new sub1(22,31);
	}

}

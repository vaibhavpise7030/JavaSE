class A
{
	static int m=10;
	public int n=11;
	
	public void  disp()
	{
		System.out.println("inside a");
	}
	
}
class B
{
	static int m=12;
	public int n=13;
	
	public void  dispB()
	{
		System.out.println("inside b");
	}
	
}
class C
{
	static int m=14;
	public int n=15;
	
	public void  dispC()
	{
		System.out.println("inside c");
	}
	
}
public class demo {

	public static void main(String[] args) {
		A m1=new A();
		m1.disp();
		System.out.println(m1.n+" And "+A.m);
		B m2=new B();
		m2.dispB();
		System.out.println(m2.n+" And "+B.m);
		C m3=new C();
		m3.dispC();
		System.out.println(m3.n+" And "+C.m);
	}

}

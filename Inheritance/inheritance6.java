
interface A12
{
	void disp1();
}
interface B12 extends A12
{
	void disp2();
}
class C12 implements B12
{
	int num=100;
	public void disp1() 
	{
		System.out.println("from A");
	}
	
	public void disp2() 
	{
		System.out.println("from B");
	}
}

public class inheritance6 {

	public static void main(String[] args)
	{
		C12 obj = new C12();
		System.out.println(obj.num);
		obj.disp1();
		obj.disp2();
	}
}

interface Parent2 
{
	void disp2();
}
class Parent1
{
	public void disp1()
	{
		System.out.println("In Parent1");
	}	
}

class child extends Parent1 implements Parent2
{
	int num = 100;
	public void disp2()
	{
		System.out.println("In Parent2");
	}
}
public class inheritnce7 
{

	public static void main(String[] args)
	{
		child obj = new child();
		System.out.println(obj.num);
		obj.disp1();
		obj.disp2();

	}

}

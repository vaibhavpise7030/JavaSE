/*4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes 
,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/


class top1
{
	public void disp1()
	{
		System.out.println("Costr in top1");
	}
}
class bottom1 extends top1
{
	public void  disp1()
	{
		System.out.println("bottom1");
	}
}
class bottom2 extends top1
{
	public void  disp1()
	{
		System.out.println("bottom2");
	}
}

public class inheritance3
{
	static void perform(top1 ref)
	{
		ref.disp1();
	}

	public static void main(String[] args) 
	{
		perform(new bottom1());
		perform(new bottom2());
		
	}

}

/*
1)Define 2 classes “First” and “Second” with member variables
, member functions and constructors of  your choice. 
Now define a class “Two” in which define main function . 
In main function create various instances of First and Second  
and call their individual member functions.*/
class first
{
	int num1=100;
	public first(int k)
	{
		this.num1=k;
		System.out.println("inside first const");
	}
	
	void disp1()
	{
		System.out.println("num1="+num1);
	}
	
}
class second
{
	int num2=200;
	public second(int l)
	{
		this.num2=l;
		System.out.println("inside second const");
	}
	void disp2()
	{
		System.out.println("num2="+num2);
	}
	
}
public class Myclass2 {

	public static void main(String[] args) 
	{
		first f1=new first(500);
		f1.disp1();
		second s1=new second(1000);
		s1.disp2();
	}

}

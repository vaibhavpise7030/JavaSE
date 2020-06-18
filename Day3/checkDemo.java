
/*3)Define a class “Check” in which declare member variables using  different 
 * accessibility modifiers i.e.  <default>, private ,public and protected.   
 * Define a function “disp”  which should be public.  
 * Define a class “CheckDemo” in which you will write “main()” function. 
 * Create an instance of  the class “Check” and  show how many  variables 
 * can be accessed directly and how many indirectly.
 */
class check{
	int num=10;
	private int num1=20;
	public int num2=30;
	protected int num3=40;
	
	public void disp()
	{
		System.out.println("num="+num+" "+"num1="+num1+" "+"num2="+num2+" "+"num3="+num3);	
	}
	
	public int getNum()
	{
		return num1;
	}
	
}

public class checkDemo {

	public static void main(String[] args) 
	{
	  check c= new check();
	  c.disp();
	  System.out.println("num="+c.num+" "+"num2="+c.num2+" "+"num3="+c.num3);//directly
	  System.out.println("num1="+c.getNum());//indirectly access

	}
}

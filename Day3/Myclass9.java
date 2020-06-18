/*8)Define a parent class with one function. 
 * Define child class with the function having same name as of parent class function,
 *  but having different argument.
Create an instance of child class and call the functions.
 Make sure u have followed the concept of “function overloading “ in inheritance.
*/
class base01
	{
	  public void disp() 
	  {
		System.out.println("Inside base disp");	  
	  }	
	}
public class Myclass9 extends base01
{
	  public void disp(int a)  //overloading
	  {
		System.out.println("Inside Sub disp");	  
	  }	
	
	public static void main(String[] args) 
	{
		Myclass9 m=new Myclass9();
		m.disp();
		//m.disp(10);
	}
}

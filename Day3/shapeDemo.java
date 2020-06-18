/*
9)Define a class “Shape” with “draw()” function . Now derive  
classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and 
override “draw()” function. Define a class “ShapeDemo” in which  write  main()  
function. In the main function create a reference to Shape class referring to 
any of the sub class. Using this reference, call “draw()” and check the result.
*/
abstract class shape
{
	abstract void draw();	
}
class circle extends shape
{
  public void draw()
	{
		System.out.println("inside circle");
	}
}
class polygon extends shape
{
	public void draw()
	{
		System.out.println("inside polygon");
	}
	
}

public class shapeDemo 
{
	static void perform (shape ref)
	{
		ref.draw();
	}
	public static void main(String[] args) 
	{
		perform(new circle());
		perform(new polygon());
	}
}

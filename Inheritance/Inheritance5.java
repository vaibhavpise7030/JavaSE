abstract class Shape
{
	abstract void draw();
}
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("triangle");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}
class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("Polygon");
	}
}

public class Inheritance5 
{

	public static void main(String[] args)
	{
		Shape ref[] = {new Triangle(),new Circle(),new Polygon()};
		for(int i=0;i<ref.length;i++)
		{
			ref[i].draw();
		}
	}

}

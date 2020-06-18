/*
10)Define an interface “Vechicle” with “start()” function . 
Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. 
from “Vehicle” and override “start()” function. 
Define a class “VDemo” in which  write  main()  function. 
In the main function create a reference to Vehicle  class referring to 
any of the sub class. Using this reference, call “start" method."
*/
interface Vehicle
{
	void start(); //public and abstract
}

class TwoWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Inside TwoWheeler");
	}
}

class ThreeWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Inside ThreeWheeler");
	}
}

class FourWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("Inside FourWheeler");
	}
}
public class VDemo {
	
	static void perform(Vehicle ref)
	{
		ref.start();
	}

	public static void main(String[] args) 
	{
		VDemo.perform(new TwoWheeler());
		perform(new ThreeWheeler());
		perform(new FourWheeler());
	}

}
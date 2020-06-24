//2) create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?

class vehicle
{
	public void start()
	{
		System.out.println("Vehicle start");
	}
}
class fourWheeler extends vehicle
{
	public void start()
	{
		System.out.println("Fourwheeler start");
	}
}
public class Inheritance2 
{

	public static void main(String[] args)
	{
		vehicle v = new fourWheeler();
		v.start();
	}
}
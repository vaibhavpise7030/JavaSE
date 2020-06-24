
class Animal
{
	public void sound()
	{
			
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("bark");
		
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("meow");
		
	}
	
}
class Tiger extends Animal
{
	public void sound()
	{
		System.out.println("roar");
		
	}
	public void hunting()
	{
		System.out.println("hunt");
	}
	
}

public class AnimalDemo {
	
   static void  perform(Animal ref) 
	{                                 
		if(ref instanceof Tiger)
		{
			Tiger ob=(Tiger)ref;
			ob.hunting();
		}
		ref.sound();
	}

	public static void main(String[] args) 
	{
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());
	}

}

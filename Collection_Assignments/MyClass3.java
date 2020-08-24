
/*3) create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it.
Now Create generic class which can take Game type 
(i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.
*/

interface Game
{
	void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("Play Cricket");
	}
}
class Football implements Game
{
	public void play()
	{
		System.out.println("Play Football");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("Play Tennis");
	}
}

class generic<T extends Game>
{
	
	T ob;
	public generic(T ob)
	{
		this.ob=ob;
		callplay();
	}
	void callplay()
	{
		this.ob.play();

	}
	
	
}


public class MyClass3 
{
	/*static <T extends Game> void perform(T ref)
	{
		ref.play();
	}*/
	public static void main(String[] args) 
	{
			generic g1=new generic(new Cricket());
			generic g2=new generic(new Tennis());
			generic g3=new generic(new Football());
			
		/*	perform(new Cricket());
			perform(new Tennis());
			perform(new Football()); */
	}

}

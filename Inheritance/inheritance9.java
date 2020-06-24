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

public class inheritance9
{
	static void perform(Game ref)
	{
		ref.play();
	}

	public static void main(String[] args)
	{
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}
}

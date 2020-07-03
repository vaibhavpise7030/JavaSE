abstract class Game
{
	abstract void play();
}
class Cricket extends Game
{
	public void play()
	{
		System.out.println("Play cricket");
	}
}
class Tennis extends Game
{
	public void play()
	{
		System.out.println("Play Tennis");
	}
}
class Football extends Game
{
	public void play()
	{
		System.out.println("Play FootBall");
	}
}
public class GameDemo {

	public static void main(String[] args) 
	{
		Game g[]= {new Cricket() ,new Tennis(), new Football()};
		for(int i=0;i<3;i++)
		{
			if(g[i] instanceof Cricket)
			{
				g[i].play();
			}
		}
	}
}

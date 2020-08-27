import java.util.*;

class Player
{
	private int playerid;
	private String name;
	private int runs;
	private String countryname;
	
	public Player(int playerid, String name, int runs, String countryname) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.runs = runs;
		this.countryname = countryname;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	
	public String toString() {
		return "Player [id=" + playerid + ", name=" + name + ", runs=" + runs + ", country=" + countryname
				+ "]"+"\n";
	}	
	
}
public class Third {

	public static void main(String[] args)
	{
		List<Player> mylist = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("\nPlayer "+i+" Info\n");
			System.out.println("Enter ID");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Runs");
			int run = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter CountryName");
			String country = sc.nextLine();
			
			mylist.add(new Player(id,name,run,country));
		}
		
		
		/*
		Player p1 = new Player(101,"Sachin",10000,"India");
		Player p2 = new Player(101,"Virat",9000,"India");
		Player p3 = new Player(101,"Bravo",8000,"WestIndies");
		Player p4 = new Player(101,"Smith",6000,"Aus");
		Player p5 = new Player(101,"Hardik",5000,"India");
		Player p6= new Player(101,"Raina",7000,"India");
		Player p7 = new Player(101,"ABD",1000,"SA");
		Player p8 = new Player(101,"Dhoni",9000,"India");
		Player p9 = new Player(101,"Williamson",8000,"NZ");
		Player p10 = new Player(101,"Warner",1000,"Aus");
		
		mylist.add(p1);
		mylist.add(p2);
		mylist.add(p3);
		mylist.add(p4);
		mylist.add(p5);
		mylist.add(p6);
		mylist.add(p7);
		mylist.add(p8);
		mylist.add(p9);
		mylist.add(p10);
		*/
		mylist.stream().filter(s->s.getCountryname().equalsIgnoreCase("india")).forEach(System.out::print);
		System.out.println();
		System.out.println("Players run more than 5000: "+mylist.stream().filter(s->s.getRuns()>5000).count());
	}

}

import java.util.HashMap;
import java.util.Scanner;

/*
 5) maintain ICC ranking of at least 5 batsmen in the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Sachin Tendulkar".
Now ask any rank bet'n 1 to 5 from user. ( user input).
if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.
*/

public class  MyClass4
{
	public static void main(String args[]) 
	{
		HashMap <Integer, String >ref =new HashMap<Integer, String>();
		
		ref.put(1,"Sachin");
		ref.put(2,"Dhoni");
		ref.put(3,"Virat");
		ref.put(4,"Raina");
		ref.put(5,"Hardik");
		System.out.println("enter key value to fetch from 1 to 5");
		while(true)
		{
			System.out.println("enter rank");
			Scanner sc1=new Scanner(System.in);
			int sc2=sc1.nextInt();
			System.out.println(ref.get(sc2));
		}
	}
}
import java.util.*;
import java.util.Map.Entry;

/*
  2) create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.

 */
public class MyClass2 
{
	
	
	public static void main(String []args)
	{
		
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		Scanner sc1=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("enter prn");
			int a=sc1.nextInt();
			sc1.nextLine();
			System.out.println("enter name");
			String b=sc1.nextLine();
			
			m1.put(a,b);
		}
		
		Set<Entry<Integer,String>> m2=m1.entrySet();
		Iterator<Entry<Integer,String>>ref=m2.iterator();
		
		while(ref.hasNext())
		{
			Map.Entry<Integer,String> ref3=(Entry<Integer,String>)ref.next();
			
			System.out.print("PRN_No: "+ref3.getKey());
			System.out.println(" Name: "+ref3.getValue());
		}
		
		
		
	}
}

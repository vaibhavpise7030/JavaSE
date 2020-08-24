
import java.io.*;
import java.util.*;

/*
 * 1) create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.

 */

public class MyClass implements Serializable
{
	private int num1;
	private String Name;
	
	public MyClass(int num1, String name) 
	{
		this.num1 = num1;
		Name = name;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public String toString()
	{
		return (num1+"\t"+Name);
	}

	public static void main(String[] args) 
	{
		
		MyClass m1= new MyClass(100,"Akash");
		MyClass m2= new MyClass(200,"Ganesh");
		MyClass m3= new MyClass(300,"Vaibhav");
		MyClass m4= new MyClass(400,"Anand");
		
		List<MyClass> ob= new ArrayList<MyClass>();	
		ob.add(m1);
		ob.add(m2);
		ob.add(m3);
		ob.add(m4);
		
		try(FileOutputStream fo= new FileOutputStream("E:\\MyClass.txt",true))
		{
			ObjectOutputStream oo= new ObjectOutputStream(fo);
			oo.writeObject(ob);
			System.out.println("File Write Successfully\n");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Following Data From File\n");
		try(FileInputStream fi= new FileInputStream("E:\\MyClass.txt"))
		{
			ObjectInputStream oi= new ObjectInputStream(fi);
			ArrayList<MyClass> ref= (ArrayList<MyClass>)oi.readObject();
			
			Iterator it= ref.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
import java.io.*;
import java.util.*;
public class MyClass1
{

	public static void main(String[] args) 
	{
		char arr[]=new char[100];
		try(FileWriter f=new FileWriter("E:\\Assignmet1.txt"))
		{
			System.out.println("Enter character");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<10;i++)
			{
				String s=sc.nextLine();
				arr[i]=s.charAt(0);
			}
			f.write(arr);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		try(FileReader r=new FileReader("E:\\Assignmet1.txt"))
		{
			char b[]=new char[arr.length];
			r.read(b);
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
/*4) Write a file copy program using unicode character streams.
( FileWriter and FileReader )
*/

import java.io.*;

public class MyClass4 
{

	public static void main(String[] args)
	{
		char c[]=null;
		
		try(FileWriter F= new FileWriter("D:\\GK1.txt"))
		{
			char arr[]= {'A','B','C','D'};
			F.write(arr);	
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		
		File f=new File("D:\\GK1.txt");
		if(f.exists())
		{
			System.out.println("File is present");
		}
		
		try(FileReader ref=new FileReader("D:\\GK1.txt"))
		{
			c=new char[(int)f.length()];
			int k=ref.read(c);
			}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		try(FileWriter ref1=new FileWriter("D:\\akash.txt",true))
		{
			ref1.write(c);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}

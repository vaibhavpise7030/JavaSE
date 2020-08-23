
/*
  3) write a file copy program using byte streams.
 		(FileOutputStream and FileInputStream)
 */

import java.io.*;
public class MyClass3
{
	public static void main(String []args)
	{
		File f= new File("D:\\abc.txt");
		byte b[]=null;
		if(f.exists())
		{
			System.out.println("File is present");
		}
		try		
		{
			FileInputStream fis= new FileInputStream(f);
			b= new byte[(int)f.length()];
			int k=fis.read(b);
			String s=new String(b);
			System.out.println(s);	
			
			FileOutputStream fos=new FileOutputStream("D:\\copy.txt",true);
			fos.write(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
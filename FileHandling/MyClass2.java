/*
  2) using RandomAccessFile class create a file.
accept a message from user and write in a file.
now read the message which u have stored in a file.
now again accept a message and write in a file at the end of existing message.
now read the entire content of file . ( u should be able to read both the messages now)

 */

import java.io.*;
public class MyClass2 {

	public static void main(String[] args) 
	{
		try(RandomAccessFile ref =new RandomAccessFile("D:\\ab1.txt","rw"))
		{
			ref.seek(0);
			byte b[]=new byte[1000];
			System.out.println("Enter a data");
			int k= System.in.read(b);
			ref.write(b,0,k);
			
			ref.seek(0);
			byte arr[]=new byte[(int)ref.length()];
			ref.read(arr);
			String s=new String(arr);
			System.out.println(s);
			
			
			ref.seek((int)ref.length());
			System.out.println("Enter a data");
			k= System.in.read(b);
			ref.write(b,0,k);
			
			ref.seek(0);
			arr=new byte[(int)ref.length()];
			ref.read(arr);
			s=new String(arr);
			System.out.println(s);
				
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}

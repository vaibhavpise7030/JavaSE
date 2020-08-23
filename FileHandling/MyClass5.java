import java.io.*;
import java.util.Scanner;

/*
 5) accept as many as numbers from user till he presses "0"  
 and write these numbers in a file. 
 Now Open a file and read these numbers.
 ( Hint :- use Scanner class for input, FileOutputStream, 
DataOutputStream, FileInputStream , DataInputStream)
*/


public class MyClass5 
{
	public static void main(String []args)
	{
		int count = 0;
	try(FileOutputStream fos=new FileOutputStream("D:\\Gk.txt"))
	{
		DataOutputStream dos=new DataOutputStream(fos);
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number greater than zero");
			while (true)
			{
				int k=sc.nextInt();
				++count;
				if(k==0)
				{
					System.out.println("Quite");
					break;
				}
				else
				{
					dos.write(k);
				}
			}	
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	try(FileInputStream fis=new FileInputStream("D:\\Gk.txt"))
	{
		DataInputStream dis=new DataInputStream(fis);
		System.out.println("\nFollowing Data From File\n");
		for(int i=0; i<(count-1); i++)
		{
			System.out.println(dis.read());	
		}
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
}


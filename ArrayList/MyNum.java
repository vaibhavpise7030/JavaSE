import java.io.*;
import java.util.*;

public class MyNum implements Serializable
{
	private int num;
	 public MyNum(int num)
	 {
		 this.num=num;
	 }
	 
	 public String toString()
	 {
		 return "MyNum "+num;
	 }
	public static void main(String[] args) 
	{
		MyNum n1=new MyNum(100);
		MyNum n2=new MyNum(200);
		MyNum n3=new MyNum(300);
		MyNum n4=new MyNum(400);
		
		List <MyNum>l=new ArrayList<MyNum>();
		l.add(n1);
		l.add(n2);
		l.add(n3);
		l.add(n4);
		
		try(FileOutputStream fos=new FileOutputStream("d:\\MyNum.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(l);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
		try(FileInputStream fos=new FileInputStream("d:\\MyNum.txt"))
		{
			ObjectInputStream oos=new ObjectInputStream(fos);
			ArrayList<MyNum> m=(ArrayList<MyNum>)oos.readObject();
			
			Iterator itr=m.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}		
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}

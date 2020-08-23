import java.io.*;
import java.util.*;

public class Employee implements Serializable
{
	private int empid;
	private String name,desig;
	private double salary;
	
	public Employee(int empid,String name,String desig, double salary)
	{
		this.empid=empid;
		this.name=name;
		this.desig=desig;
		this.salary=salary;
	}
	
	public String toString()
	{
		return this.empid+"\t"+this.name+"\t"+this.desig+"\t"+this.salary;
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee(101,"Akash","FS-Devloper",50000);
		Employee e2=new Employee(102,"Vaibhav","Py-Devloper",20000);
		Employee e3=new Employee(103,"Ganesh","owner",10000);
		Employee e4=new Employee(104,"Anand","Tester",30000);
		
		List <Employee> ref=new ArrayList<Employee>();
		ref.add(e1);
		ref.add(e2);
		ref.add(e3);
		ref.add(e4);
		
		Iterator itr=ref.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		try(FileOutputStream fo=new FileOutputStream("d:\\employeede.txt"))
		{
			ObjectOutputStream d1=new ObjectOutputStream(fo);
			d1.writeObject(ref);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		try(FileInputStream fi=new FileInputStream("d:\\employeede.txt"))
		{
			ObjectInputStream d2=new ObjectInputStream(fi);
			ArrayList<Employee> e=(ArrayList<Employee>)d2.readObject();
			
			Iterator i=e.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
				
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
	}

}

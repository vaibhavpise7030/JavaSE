import java.util.*;

class student
{
	private int roll_no;
	private String name;
	private int age;
	private int marks;
	public student(int roll_no, String name, int age, int marks) 
	{
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString() {
		return "student [name=" + name + "]";
	}
}
public class Second {

	public static void main(String[] args) 
	{
		student s1 = new student(100,"Vaibhav",20,95);
		student s2 = new student(101,"Akash",24,90);
		student s3 = new student(100,"Ganesh",21,50);
		student s4 = new student(100,"Sachin",25,96);
		student s5 = new student(100,"Sanket",24,94);
		
		List <student> mylist = new ArrayList<student>();
		
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		mylist.add(s4);
		mylist.add(s5);
		
		mylist.stream().filter(s->s.getName().startsWith("S")).forEach(System.out::println);
		
		System.out.println("Marks above 70: "+mylist.stream().filter(s->s.getMarks()>70).count());
		System.out.println("Age Between 22 &25: "+mylist.stream().filter(s->s.getAge()>=22 && s.getAge()<=25).count());
	}

}

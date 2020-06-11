
public class MyClass1 {
	int a;
	int b;
	static int cnt;
	public MyClass1()
	{
		this.a=0;
		this.b=0;
		cnt++;
		System.out.println("Inside default constr.");
	}
	
	public MyClass1(int a)
	{
		this.a=a;
		cnt++;
		System.out.println("Inside para constr.");
	}
	public MyClass1(int a,int b)
	{
		this.a=a;
		this.b=b;
		cnt++;
	}

	public static void main(String[] args) {
		MyClass1 m1=new MyClass1();
		MyClass1 m2=new MyClass1(100);
		MyClass1 m3=new MyClass1(100,200);
		System.out.println("no of constructor "+cnt);
	}

}

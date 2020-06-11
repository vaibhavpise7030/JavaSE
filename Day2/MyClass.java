class shape{
	private int width;
	private int height;
	
	/*public shape(int a,int b)
	{
		this.width=a;
		this.height=b;
	}*/
	public void setNum(int a,int b) 
	{
		this.width=a;
		this.height=b;
	}
	public int getnum()
	{
		return this.width;
	}
	public int getnum1()
	{
		return this.height;
	}	
}

public class MyClass {
	

	public static void main(String[] args) {
		//shape a=new shape(100,200);// using constructor
		shape b=new shape(); // useing getNumsetNum
		b.setNum(100, 300);
		System.out.println(b.getnum());
		System.out.println(b.getnum1());

	}

}

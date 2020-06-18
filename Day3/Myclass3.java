
public class Myclass3 {
	
	int num1=100;
	static int num2=200;
	
	void disp1()
	{
		System.out.println("Instance num2="+num1);
	}
	
	static void disp2()
	{
		System.out.println("Static num2="+num2);
	}
	
	public static void main(String []args) 
	{
		
		Myclass3 m= new Myclass3();
		//System.out.println(m.num1 +" "+Myclass3.num2);	
	
		Myclass3.disp2(); //class 
		m.disp1(); //object
		m.disp2();  //object	
	}

}

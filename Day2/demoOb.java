
public class demoOb {
	int a=10;
	public void disp()
	{
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		demoOb m1=new demoOb();
		demoOb m2=m1;
		
		m1.disp();//10
		m2.disp();//10
		
	    m2=new demoOb();
		m2.a=20;
		
		m1.disp();//10
		m2.disp();//20
	}

}

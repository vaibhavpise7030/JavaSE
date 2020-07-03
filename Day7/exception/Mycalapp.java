package exception;
import java.util.*;
public class Mycalapp {
	

	public static void main(String[] args) {
	   Calculator g=new Calculator();
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Your no:");
	   		   
     try 
	  {
    	  int a=sc.nextInt();
		  System.out.println(g.cal(a));	  
	  }
      catch(Myarithmaticexception ex)  //=new  Myarithmaticexception("zero not alloweded");
	  {
    	 System.out.println(ex);
    	  //ex.printStackTrace();
	  }
	}

}

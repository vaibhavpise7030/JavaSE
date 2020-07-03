package exception;

public class Calculator {

public  int cal(int a) throws Myarithmaticexception 

{
	if(a==0)
	{
		throw new  Myarithmaticexception("zero not alloweded");
	}
	else if(a<0)
	{
		throw new  Myarithmaticexception("negative not alloweded");
	}
	else
	{
		return a*a;
	}
	
}

}

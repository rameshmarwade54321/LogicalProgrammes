package Practice_22mar2024;

public class E04_Factorial 
{
	
	
//	1=1
//	1*2=2
//	1*2*3=6
//	1*2*3*4=24
//  1*2*3*4*5=125	=4!*5
	public static void main(String[] args) 
	{
		
		// method 1- starting by no.1 ( 1 to 5)
		int fact=1;
		for(int i=1; i<=5; i++)
		{
			fact=fact*i;
			System.out.println("fact of "+i+" is :"+fact);
		}
		
		//method 2- starting with random number or range ( t to 10)
		int fact1=1;
		for(int a=5; a<=10; a++ )
		{
			for(int b=1; b<=a; b++)
			{
				fact1=fact1*b;			
			}
			System.out.println("factorial of "+a+" is "+fact1);
			fact1=1;
		}
		
	}
}

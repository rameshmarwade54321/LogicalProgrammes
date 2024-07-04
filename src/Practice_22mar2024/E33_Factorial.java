package Practice_22mar2024;

import java.util.Scanner;

public class E33_Factorial 
{

	public static void main(String[] args) 
	{
	    
		int fact=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				fact=fact*j;
			}
			System.out.println("factorial of "+i+" is "+fact);
			fact=1;
		}
		
		
		
	}
	
}

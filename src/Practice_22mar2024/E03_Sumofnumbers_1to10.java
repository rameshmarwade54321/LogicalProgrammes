package Practice_22mar2024;

public class E03_Sumofnumbers_1to10 
{
	public static void main(String[] args) 
	{
		
		//method 1=starting point 1 ( 1 to 10)
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			sum=sum+i;
			System.out.println("sum of "+i+" is :"+sum);
		}
		
		System.out.println("-------------------------");
		//method 2= starting point is not 1 ( 5 to 15)
		
		int sum1=1;
		for(int a=5; a<=15; a++)
		{
			for(int b=1; b<=a; b++)
			{
				sum1=sum1+b;				
			}
			System.out.println("sum of "+a+" is :"+sum1);
			sum1=0;
			
			
			
		
		}
		
		
	}
}

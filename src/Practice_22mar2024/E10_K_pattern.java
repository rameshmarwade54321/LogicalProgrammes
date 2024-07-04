package Practice_22mar2024;

public class E10_K_pattern 
{
	public static void main(String[] args) 
	{
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		
		int rows=5;
		for(int i=0; i<=rows; i++)
		{
			for(int j=0; j<=rows-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		int rows1=5;
		for(int a=1; a<=rows1; a++)
		{
			for(int b=1; b<=a+1; b++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	
		
		
		
		
		
		
		
	}
}

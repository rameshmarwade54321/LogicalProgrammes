package Practice_22mar2024;

public class E08_Reverse_right_half_pyramid 
{
	public static void main(String[] args) 
	{
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		int rows=5;
		for(int i=0; i<=rows; i++)
		{
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}

package Practice_22mar2024;

public class E09_Decreasing_numbers_pyramid 
{
	public static void main(String[] args) 
	{
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		 
		int rows=5;
		for(int i=0; i<=rows; i++)
		{
			for(int j=1; j<= rows-i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}
}

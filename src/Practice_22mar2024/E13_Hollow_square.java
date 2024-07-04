package Practice_22mar2024;

public class E13_Hollow_square 
{
//        Hollow Square
	
//	    * * * * * * 
//	    *         *
//	    *         *
//	    *         *
//	    *         *
//	    * * * * * *
	
	public static void main(String[] args) 
	{
		
	
	int rows=6;
	int column=6;
	
	for(int i=1; i<=rows; i++)
	{
		for(int j=1; j<=column; j++)
		{
			if(i==1 || i==rows || j==1 || j==column)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	
	
	}	
}

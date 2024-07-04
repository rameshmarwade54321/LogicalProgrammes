package Practice_22mar2024;

public class E32_Star 
{
	public static void main(String[] args) 
	{
//		*
//		***
//		*****
//		*******
//		*********    //rows = 5
		
		for(int i=0; i<=4; i++)
		{
			for(int j=1;j<=(i*2)+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

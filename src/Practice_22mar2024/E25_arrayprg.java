package Practice_22mar2024;

public class E25_arrayprg 
{
	
	public static void main(String[] args) 
	{
		int a [] = {1,2,3,4,5};
		//Result = 120 60 40 30 24
		//5*4*3*2=120
		//5*4*3*1=60
		//5*4*2*1=40
		//5*3*2*1=30
		//4*3*2*1=24
		for(int i =0; i<a.length; i++)
		{
			int mult=1;
			for(int j=0; j<a.length; j++)
			{
				if(i!=j)
				{
					mult=mult*a[j];  //2 6 24 120, 3 12 60,
				}
			}
			System.out.print(mult+" ");
		}	
	}
}

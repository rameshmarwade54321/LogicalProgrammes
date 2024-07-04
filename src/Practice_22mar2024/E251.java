package Practice_22mar2024;

public class E251 
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
		int mult=1;
		for(int i=0; i<a.length; i++)
		{
			mult=mult*a[i];
		}
		System.out.println(mult);  //mult=120
		
		for(int i=0; i<a.length; i++)
		{
			int result=mult/a[i];
			System.out.print(result+" ");
		}
		
}
}
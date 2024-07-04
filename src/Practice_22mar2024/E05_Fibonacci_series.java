package Practice_22mar2024;

public class E05_Fibonacci_series 
{
	public static void main(String[] args) 
	{
		//fibonacci series = 0 1 1 2 3 5 8 13 21 .....
		                  // 0+1=1
		                  //   1+1=2
		                  //     1+2=3
		                  //       2+3=5
		
		int n1=0,n2=1, n3 ,i ;
		System.out.print(n1+" "+n2);
		for(i=1; i<=10; i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
		
		
		
		
	}
}

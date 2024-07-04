package Practice_22mar2024;

public class E37_LeftShiftArray 
{

	public static void main(String[] args) 
	{
	
		int ar[]= {1,2,3,4,5};
		
		int n=0;
		System.out.println("-----Original array--------------");
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<=n; i++)
		{
		int j, first;
		first=ar[0];
		for( j=0;j<ar.length-1; j++)
		{
			ar[j]=ar[j+1];
		}
		
		ar[j]=first;
		}
		
		System.out.println("-----new  array--------------");
		for(int i=0;i<=ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}

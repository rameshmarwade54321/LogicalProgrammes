package Practice_22mar2024;

public class E23_AscendingOrder_WithoutUsingSorting 
{

	public static void main(String[] args) 
	{
		int []a= {10,20,15,36,30,100,45};
		
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
			
			System.out.print(a[i]+" ");
		}
		
		
		
	}
}

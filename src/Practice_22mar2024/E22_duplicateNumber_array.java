package Practice_22mar2024;

public class E22_duplicateNumber_array 
{
	public static void main(String[] args) 
	{
		int []a= {10,20,30,30,40,50,40};
		
		//required two for loop for comparing each index with all other index
		
		for(int i=0; i<a.length; i++) //outer for loop start from index 0
		{
			for(int j=i+1; j<a.length; j++) //inner for loop start from index 1
			{
				if(a[i]==a[j])    //comparing each index with all other index
				{
					System.out.println("Duplicate number is "+a[j]);
				}
			}
		}
		
		
	}
}

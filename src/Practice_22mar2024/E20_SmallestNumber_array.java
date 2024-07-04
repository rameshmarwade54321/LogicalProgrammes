package Practice_22mar2024;
import java.util.Arrays;
public class E20_SmallestNumber_array 
{
	public static void main(String[] args) 
	{
		int []a= {10,5,45,90,73,55};
		
		//smallest number using sorting
		
		Arrays.sort(a);    // after sorting array in ascending order
		
		System.out.println("smallest number using sorting : "+a[0]);  //first index print having smallest number
		
		//smallest number without using sorting
		
		int min=a[0];      //5     //declare index 0 as min
		
		for(int i=0; i<a.length; i++)  //for loop for 0 to last index
		{
			if (a[i]<min)   //comparing each index with min
			{
				min=a[i];    //if true then min=present index
			}
		}
		System.out.println("smallest number without sorting : "+min);
		
		
		
		
		
		
		
		
	}
}

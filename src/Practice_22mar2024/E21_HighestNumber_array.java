package Practice_22mar2024;
import java.util.Arrays;
public class E21_HighestNumber_array 
{
	public static void main(String[] args) 
	{
		int[]a= {23,10,40,28,15,75,70,65};
		
		//highest number using sorting
		
		Arrays.sort(a);    // after sorting array in ascending order
		
		System.out.println("highest number using sorting : "+(a[a.length-1]));    //last index print having highest number
		
		
		//highest number without using sorting
		
		int max=a[0];  //75     //declare index 0 as max
		
		for(int i=0; i<a.length; i++) //for loop for 0 to last index
		{
			if(a[i]>max)    //comparing each index with min
			{
				max=a[i];     //if true then max=present index
			}
		}
		System.out.println("highest number using sorting : "+max);
	}
}

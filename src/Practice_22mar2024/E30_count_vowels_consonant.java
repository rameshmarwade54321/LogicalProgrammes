package Practice_22mar2024;

public class E30_count_vowels_consonant 
{
	public static void main(String[] args) 
	{
		String str="ramersh marwade";
		int vcount=0;
		int ccount=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='e' || str.charAt(i)=='i'
					|| str.charAt(i)=='u')
			{
				vcount++;
			}
			else if( str.charAt(i)!=' ')
			{
				ccount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
		
		
	}
}

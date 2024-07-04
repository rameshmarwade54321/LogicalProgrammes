package Practice_22mar2024;

public class E26_CountCharacter 
{
	public static void main(String[] args) 
	{
		String str = "The best of both worlds";
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if (str.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println("Count of charaters without spaces in string is "+count);
	}
}

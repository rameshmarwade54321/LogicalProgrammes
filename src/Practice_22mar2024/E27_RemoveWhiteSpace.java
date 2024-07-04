package Practice_22mar2024;

public class E27_RemoveWhiteSpace 
{
	public static void main(String[] args) 
	{
		String str1="Remove white spaces";
		int count=0;
		str1=str1.replace(" ", "");
		System.out.println(str1);
		for(int i=0; i<str1.length();i++)
		{
			count++;
		}
		
		System.out.println(count);
	}
}

package Practice_22mar2024;

public class E29_CountDuplicateChar 
{
	public static void main(String[] args) 
	{   //count numbers of duplicate character 
		String str="shitsal piwarh";
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			for (int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j))
				
				{
					
					count++;
				}
			}
		}
		System.out.println(count);
}
}


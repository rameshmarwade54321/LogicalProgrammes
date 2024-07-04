package Practice_22mar2024;

public class E36_replaceAll_method 
{

	public static void main(String[] args) 
	{
	
		String a= "7ra5140m8es2h123";
		
		System.out.println(a.replaceAll("[0-9]", ""));
		
		String b="@#$rahusg&*jhgsvch";
		System.out.println(b.replaceAll("[^a-z]", "0"));
	}
}

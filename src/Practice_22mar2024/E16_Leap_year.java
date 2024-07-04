package Practice_22mar2024;

public class E16_Leap_year 
{
		//find out leap year except centuries

	public static void m1(int year) 
	{
		if(year%4==0)
		{
			System.out.println(year + " is a Leap Year");
		}
		else
		{
			System.out.println(year + " is not a Leap Year");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		m1(2024);
		m1(2023);
		m1(2025);
		m1(2020);
		
	}
	
	
	
	
}
